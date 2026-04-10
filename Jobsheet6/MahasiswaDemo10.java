import java.util.Scanner;
public class MahasiswaDemo10 {
    public static void main(String[] args) {
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0;i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            
            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }

        System.out.println("--------------------------------");
        list.tampil();
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        // double cari = sc.nextDouble();
        String cariStr = sc.nextLine();
        double cari = Double.parseDouble(cariStr);
        
        System.out.println("--------------------------------");
        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
