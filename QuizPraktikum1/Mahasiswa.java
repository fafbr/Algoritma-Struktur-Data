public class Mahasiswa {
    String nim;
    String nama;
    Buku[] bukuDipinjam;
    int jumlahDipinjam;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new Buku[2];
        this.jumlahDipinjam = 0;
    }
}
