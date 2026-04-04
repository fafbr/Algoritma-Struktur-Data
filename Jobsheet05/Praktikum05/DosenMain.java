package Praktikum05;
import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen listDosen = new DataDosen();
        int menu;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (termuda ke tertua)");
            System.out.println("4. Sorting DSC (tertua ke termuda)");
            System.out.println("5 Keluar");
            System.out.print("Pilih menu:");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (true=Pria, false=Wanita): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen dsn = new Dosen(kode, nama, null, usia);
                    listDosen.tambah(dsn);
                    break;

                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    listDosen.tampil();
                    break;

                case 3:
                    listDosen.SortingASC();
                    break;

                case 4:
                    listDosen.SortDSC();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 5);
    }
}
