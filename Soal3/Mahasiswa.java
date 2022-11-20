package Soal3;

public class Mahasiswa {
    private Integer id;
    private String name;
    private String kelas;
    private Integer tglMasuk;

    public Mahasiswa(Integer id, String name, String kelas, Integer tglMasuk) {
        this.id = id;
        this.name = name;
        this.kelas = kelas;
        this.tglMasuk = tglMasuk;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameNew) {
        this.name = nameNew;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelasNew) {
        this.kelas = kelasNew;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNew) {
        this.id = idNew;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", kelas='" + kelas + '\'' +
                ", kelas='" + tglMasuk + '\'' + '}';
    }
}