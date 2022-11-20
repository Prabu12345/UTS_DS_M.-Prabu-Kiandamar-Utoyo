public class Main {
    public static void main(String[] args) {
        int[] angka = {1,5,2,3,6,8,7,10,14,12,19,21,28,22,27};

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.println(angka[i] + " - Genap");
                continue;
            }
            System.out.println(angka[i] + " - Ganjil");
        }
    }
}