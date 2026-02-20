public class Dosen10 {
    String idDosen;
    String nama;
    boolean status;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen10() {}
    
    public Dosen10(String id, String nm, boolean stat, int thnGabung, String keahlian) {
        this.idDosen = id;
        this.nama = nm;
        this.status = stat;
        this.tahunBergabung = thnGabung;
        this.bidangKeahlian = keahlian;
    }

    void tampilkanInformasi() {
        System.out.println("================================================");
        System.out.printf("%-20s : %s\n", "Id Dosen", idDosen);
        System.out.printf("%-20s : %s\n", "Nama", nama);
        System.out.printf("%-20s : %s\n", "Status", (status ? "Aktif" : "Tidak Aktif"));
        System.out.printf("%-20s : %d\n", "Tahun Bergabung", tahunBergabung);
        System.out.printf("%-20s : %s\n", "Bidang Keahlian", bidangKeahlian);
        System.out.println("================================================\n");
    }

    void setStatusAktif(boolean status) {
        this.status = status;
        System.out.printf("Status aktif %s berhasil diubah\n", nama);
    }

    int hitungMasaKerja(int thnSekarang) {
        int masaKerja = thnSekarang - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.printf("Bidang keahlian %s telah berhasil diubah menjadi: %s\n", nama, bidang);
    }
}