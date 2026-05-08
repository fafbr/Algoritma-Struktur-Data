public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa10() {}
    public Mahasiswa10(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.print(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk + "\n");
    }
}