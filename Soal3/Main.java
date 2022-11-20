package Soal3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(new Mahasiswa(252, "Naufal", "Informatika", 12122022));
        mahasiswa.add(new Mahasiswa(99, "Akhdan Wirasena", "Informatika", 12122022));
        mahasiswa.add(new Mahasiswa(32, "Riski Ali", "Informatika", 12122022));
        mahasiswa.add(new Mahasiswa(128, "Muttamaqin Bilah", "Informatika", 12122022));
        mahasiswa.add(new Mahasiswa(26, "M. Prabu Kiandamar Utoyo", "Informatika", 12122022));

        System.out.println("-----------{ Print All }-------------");
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));
        
        System.out.println("\n-----------{ Remove }-------------");
        mahasiswa.remove(1);
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n-----------{ Add }-------------");
        mahasiswa.add(1, new Mahasiswa(31, "Yuika Haruno", "Informatika", 19122022));
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("-----------{ Size }-------------");
        System.out.println("Total Mahasiswa : " + mahasiswa.size());
    }
}