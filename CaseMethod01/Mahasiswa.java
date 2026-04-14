public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa() {}
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.printf("| %-7s | %-7s | %-25s |\n", nim, nama, prodi);
    }
}