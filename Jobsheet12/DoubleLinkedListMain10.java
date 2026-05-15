import java.util.Scanner;
public class DoubleLinkedListMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList10 list = new DoubleLinkedList10();
        int pilihan;

        do {
            System.out.println("\n=== Menu Double Linked List ===");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus Data di Awal");
            System.out.println("5. Hapus Data di Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa10 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa10 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.print("Masukkan data baru: ");
                    Mahasiswa10 dataBaru =  inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Manu tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }

    private static Mahasiswa10 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM  :");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama :");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas:");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK  :");
        double ipk = sc.nextDouble(); sc.nextLine();
        return new Mahasiswa10(nim, nama, kelas, ipk);
    }
}
