import java.util.Scanner;
public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;
        
        do {
            System.out.println("\n=== Layanan Persetujuan KRS DPA ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Belakang");
            System.out.println("6. Cek Jumlah Antrian Saat Ini");
            System.out.println("7. Cek Jumlah Mahasiswa Sudah KRS");
            System.out.println("8. Cek Sisa Kuota DPA Belum KRS");
            System.out.println("9. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   :");
                    String nim = sc.nextLine();
                    System.out.print("Nama  :");
                    String nama = sc.nextLine();
                    System.out.print("Prodi :");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas :");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.cetakJmlAntrian();
                    break;
                case 7:
                    antrian.cetakJmlSudahKRS();
                    break;
                case 8:
                    antrian.cetakSisaBelumKRS();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}