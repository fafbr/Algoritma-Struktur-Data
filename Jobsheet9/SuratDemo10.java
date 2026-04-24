import java.util.Scanner;
public class SuratDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat10 stack = new StackSurat10(10);
        int pilih;

        do {
            System.out.println("\n=== Sistem Pengelolaan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasar Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin(S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi(hari): ");
                    int durasi = sc.nextInt();

                    Surat10 suratBaru = new Surat10(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil diterima dan dimasukkan ke Stack.");
                    break;
                
                case 2:
                    Surat10 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.print("Memproses surat ID: " + diproses.idSurat + " atas nama " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat10 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.print("Surat terakhir yang masuk adalah ID: " + terakhir.idSurat + " atas nama " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    stack.cariSurat(namaCari);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");;
            }
        } while (pilih != 5);
        sc.close();
    }
}