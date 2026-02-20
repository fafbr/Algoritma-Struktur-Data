public class MataKuliah10 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah10() {}

    public MataKuliah10(String kodeMK, String nama, int sks, int jmlJam) {
        this.kode = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jmlJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-------------------------");
    }

    void ubahSks(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam ditambah. Total Jam: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        this.jumlahJam -= jam;
        System.out.println("Jam dikurangi. Total Jam: " + jumlahJam);
    }
}
