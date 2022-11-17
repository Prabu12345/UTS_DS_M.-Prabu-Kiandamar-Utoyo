import java.lang.reflect.Array;
import java.util.Scanner;

public class soal_dua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("----{{ Menentukan Gajil/Genap Dengan short bubble/selection }}----");
            System.out.println("M. Prabu Kiandamar Utoyo");
            System.out.println("Dibutuhkan " + (10 - i) + " angka lagi untuk memulai program");
            System.out.print("Masukan angka: ");

            int inputAngka = input.nextInt();
            Array.setInt(angka, i, inputAngka);
        }
        
        for(int lastUnsortedIndex = angka.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(angka[i] > angka[i + 1]){
                    swap(angka, i , i+ 1);
                }
            }
        }

        for( int i = 0; i < angka.length; i++){
            if (angka[i] % 2 == 0) {
                System.out.println(angka[i] + " - Genap");
                continue;
            }
        }

        for( int i = 0; i < angka.length; i++){
            if (angka[i] % 2 == 1) {
                System.out.println(angka[i] + " - Ganjil");
                continue;
            }
        }
    }

    public static void swap (int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
