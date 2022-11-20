import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int[] angka = new int[10];

        System.out.println("----{{ Menentukan Gajil/Genap Dengan short bubble/selection }}----");

        for (int i = 0; i < 10; i++) {
            System.out.println("Dibutuhkan " + (10 - i) + " angka lagi untuk memulai program");
            System.out.print("Masukan angka: ");

            int inputAngka = inputData.nextInt();
            Array.setInt(angka, i, inputAngka);
        }

        // Shorting Angka Ganjil (Selection)
        System.out.println("Angka Ganjil - Selection Sort");
        int[] angkaGanjil = angka;
        angkaGanjil = deleteGajil(angkaGanjil);
        selectionShort(angkaGanjil);
        for (int i = 0; i < angkaGanjil.length; i++) {
            System.out.println(angkaGanjil[i]);
        }

        // Shorting Angka Genap (Bubble)
        System.out.println("Angka Genap - Bubble Sort");
        int[] angkaGenap = angka;
        angkaGenap = deleteGenap(angkaGenap);
        bubbleShort(angkaGenap);
        for (int i = 0; i < angkaGenap.length; i++) {
            System.out.println(angkaGenap[i]);
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

    public static void bubbleShort (int[] array) {
        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i , i+ 1);
                }
            }
        }
    }

    public static void selectionShort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static int[] deleteGajil (int[] arr) {
        int even_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) 
            {
                even_count++;
            }
        }

        int[] result = new int[even_count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    public static int[] deleteGenap (int[] arr) {
        int even_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) 
            {
                even_count++;
            }
        }

        int[] result = new int[even_count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}
