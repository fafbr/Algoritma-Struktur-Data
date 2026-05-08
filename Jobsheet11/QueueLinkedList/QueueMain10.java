package QueueLinkedList;
import java.util.Scanner;
public class QueueMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList10 queue = new QueueLinkedList10();  
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian (Daftar)");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFront();
                    break;
                case 4:
                    queue.printRear();
                    break;
                case 5:
                    queue.printAll();
                    break;
                case 6:
                    queue.getJumlahAntrian();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 8:
                    System.out.println("Program dihentikan.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        sc.close();
    }
}
