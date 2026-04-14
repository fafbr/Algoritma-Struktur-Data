public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public Buku(String kode, String judul, int tahun) {
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
    }

    public void tampilBuku() {
        System.out.printf("| %-6s | %-15s | %-12d |\n", kodeBuku, judul, tahunTerbit);
    }
}
