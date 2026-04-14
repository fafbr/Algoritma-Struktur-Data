public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (this.lamaPinjam > this.batasPinjam) {
            this.terlambat = this.lamaPinjam - this.batasPinjam;
            this.denda = this.terlambat * 2000;
        } else {
            this.terlambat = 0;
            this.denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.printf("| %-7s | %-15s | %-11d | %-9d | Rp %-7d |\n",mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}
