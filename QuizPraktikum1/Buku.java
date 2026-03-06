public class Buku {
    String kodeBuku;
    String judulBuku;
    String penulis;
    boolean statusPeminjaman;

    public Buku(String kodeBuku, String judulBuku, String penulis, boolean statusPeminjaman) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.statusPeminjaman = false;
    }
}