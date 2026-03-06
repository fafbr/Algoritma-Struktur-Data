import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        int pilihan;

        do {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode buku: ");
                    String kodeBuku = sc.nextLine();
                    System.out.print("Masukkan Judul buku: ");
                    String judulBuku = sc.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = sc.nextLine();
                    perpus.tambahBuku(kodeBuku, judulBuku, penulis);
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    perpus.tambahMahasiswa(nim, nama);
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimPinjam = sc.nextLine();
                    System.out.print("Masukkan Kode Buku: ");
                    String kodePinjam = sc.nextLine();
                    perpus.pinjamBuku(nimPinjam, kodePinjam);
                    break;

                case 4:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimKembali = sc.nextLine();
                    System.out.print("Masukkan Kode Buku: ");
                    String kodeKembali = sc.nextLine();
                    perpus.kembalikanBuku(nimKembali, kodeKembali);
                    break;

                case 5 :
                    perpus.tampilkanPeminjaman();
                    break;

                case 6:
                    System.out.println("Terimakasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! pilihh menu 1-6.");
            }
        } while (pilihan != 6);
                sc.close();
    }
}