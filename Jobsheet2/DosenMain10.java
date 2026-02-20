public class DosenMain10 {
    public static void main(String[] args) {
        int thnSkrg = 2026;
        System.out.println("\nobjek 1 (konstruktor default)");
        Dosen10 dosen1 = new Dosen10();
        dosen1.idDosen = "DSN01";
        dosen1.nama = "Dr. Eng. Herman, M.T.";
        dosen1.status = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Sistem Informasi";
        dosen1.tampilkanInformasi();
        int masaKerja = dosen1.hitungMasaKerja(thnSkrg);
        System.out.printf("Masa Kerja %s adalah: %d tahun\n", dosen1.nama, masaKerja);
        
        System.out.println("objek 2 (konstruktor berparameter");
        Dosen10 dosen2 = new Dosen10("DSN02", "Dra. Luciana, M.Kom.", false, 2018, "Basis Data");
        dosen2.tampilkanInformasi();
        
        System.out.println("update dosen 2");
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Data Science");
        dosen2.tampilkanInformasi();
        masaKerja = dosen2.hitungMasaKerja(thnSkrg);
        System.out.printf("Masa Kerja %s adalah: %d tahun\n", dosen2.nama, masaKerja);
    }
}