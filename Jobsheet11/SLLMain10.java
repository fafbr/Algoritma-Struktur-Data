// import java.util.Scanner;
public class SLLMain10 {
    public static void main(String[] args) {

        SingleLinkedList10 sll = new SingleLinkedList10();

        Mahasiswa10 mhs1 = new Mahasiswa10("21212203", "Dirga", "4D", 3.6);
        Mahasiswa10 mhs2 = new Mahasiswa10("22212202", "Cintia", "3C", 3.5);
        Mahasiswa10 mhs3 = new Mahasiswa10("23212201", "Bimon", "2B", 3.8);
        Mahasiswa10 mhs4 = new Mahasiswa10("24212200", "Alvaro", "1A", 4.0);

        sll.addFirst(mhs1);
        sll.addlast(mhs4);
        sll.insertAfter("Dirga", mhs2);
        sll.insertAt(2, mhs3);

        System.out.println("data index 1:");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimo berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        // Scanner sc = new Scanner(System.in);
        // SingleLinkedList10 sll = new SingleLinkedList10();
        // String lanjut;

        // System.out.println("--- Tambah Data Mahasiswa ---");
        // do {
        //     System.out.print("\nNIM   :");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama  :");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas :");
        //     String kelas = sc.nextLine();
        //     System.out.print("IPK   :");
        //     double ipk = sc.nextDouble(); sc.nextLine();

        //     Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
        //     sll.addlast(mhs);

        //     System.out.print("Tambah data baru? (y/n): ");
        //     lanjut = sc.nextLine();
        // } while (lanjut.equalsIgnoreCase("y"));

        // System.out.println("--- Hasil Akhir Linked List ---");
        // sll.print();
        // sc.close();
    }
}
