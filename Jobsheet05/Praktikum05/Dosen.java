package Praktikum05;

public class Dosen {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("JK: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia: " + usia);
        System.out.println("--------------------");
    }
}
