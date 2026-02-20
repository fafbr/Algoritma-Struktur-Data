public class MataKuliahMain10 {
    public static void main(String[] args) {
        System.out.println("Objek 1 (konstruktor default)");
        MataKuliah10 mk1 = new MataKuliah10();
        mk1.kode = "ASD_SIB";
        mk1.nama = "Agoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();

        System.out.println("Objek 2 (konstruktor berparameter");
        MataKuliah10 mk2 = new MataKuliah10("BD_SIB", "Basis Data", 2,4);
        mk2.tampilkanInformasi();
        mk2.ubahSks(4);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi();
    }
}
