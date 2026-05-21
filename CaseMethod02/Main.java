import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrian antrian = new DLLAntrian();
        DLLPesanan listPesanan = new DLLPesanan();
        int pilihan;
        do {
            System.out.println("\n===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pemmbeli   : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP           : ");
                    String noHp = sc.nextLine();
                    Pembeli p = new Pembeli(nama, noHp);
                    antrian.addLast(p);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + antrian.totAntrian);
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Gagal: Antrian kosong.");
                        break;
                    }
                    Pembeli diproses = antrian.removeFirst();

                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();sc.nextLine();

                    Pesanan pesananBaru = new Pesanan(kode, namaPesanan, harga);
                    listPesanan.add(pesananBaru);
                    System.out.println(diproses.namaPembeli + " telah memesan " + namaPesanan);
                    break;
                case 4:
                    listPesanan.print();
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
