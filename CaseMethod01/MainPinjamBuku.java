import java.util.Scanner;

public class MainPinjamBuku {
    public static void insertionSortDenda(Peminjaman[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman key = arr[i];
            int j = i - 1; 
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionSortNIM(Peminjaman[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void binarySearchNIM(Peminjaman[] arr, String targetNim) {
        insertionSortNIM(arr);
        int left = 0;
        int right = arr.length - 1;
        int mid = -1;
        boolean found = false;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int compareResult = arr[mid].mhs.nim.compareTo(targetNim);
            if (compareResult == 0) {
                found = true;
                break;
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (found) {
            System.out.println("[Binary Search] ditemukan:");
            int start = mid;
            int end = mid;
            while (start > 0 && arr[start - 1].mhs.nim.equals(targetNim)) {
                start--;
            }
            while (end < arr.length - 1 && arr[end + 1].mhs.nim.equals(targetNim)) {
                end++;
            }
            for (int i = start; i <= end; i++) {
                arr[i].tampilPeminjaman();
            }
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] daftarBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] daftarPeminjaman = {
            new Peminjaman(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman(daftarMhs[0], daftarBuku[1], 4)
        };

        int menu;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUNAG BACA JTI");
            System.out.println(" 1. Tampilkan Mahasiswa");
            System.out.println(" 2. Tampilkan Buku");
            System.out.println(" 3. Tampilkan Peminjaman");
            System.out.println(" 4. Tampilkan Urutkan berdasarkan Denda");
            System.out.println(" 5. Tampilkan Cari berdasarkan NIM");

            System.out.println(" 6. Tambah Data Peminjaman Baru");
            System.out.println(" 7. Tampilkan Statitik");

            System.out.println(" 0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    System.out.println("---------------------------------------------------");
                    System.out.printf("| %-7s | %-7s | %-25s |\n", "NIM", "Nama", "Prodi");
                    System.out.println("---------------------------------------------------");
                    for (Mahasiswa mhs : daftarMhs) mhs.tampilMahasiswa();
                    System.out.println("---------------------------------------------------");
                    break;
                    
                case 2:
                    System.out.println("\nDaftar Buku:");
                    System.out.println("--------------------------------------------");
                    System.out.printf("| %-6s | %-15s | %-12s |\n", "Kode", "Judul", "Tahun Terbit");
                    System.out.println("--------------------------------------------");
                    for (Buku buku : daftarBuku) buku.tampilBuku();
                    System.out.println("--------------------------------------------");
                    break;
                    
                case 3:
                    System.out.println("\nData Peminjaman:");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("| %-7s | %-15s | %-11s | %-9s | %-10s |\n", "Nama", "Buku", "Lama Pinjam", "Terlambat", "Denda");
                    System.out.println("----------------------------------------------------------------------");
                    for (Peminjaman p : daftarPeminjaman) p.tampilPeminjaman();
                    System.out.println("----------------------------------------------------------------------");
                    break;
                    
                case 4:
                    System.out.println("\nSetelah diurutkan dengan Insertion Sort (Denda terbesar):");
                    insertionSortDenda(daftarPeminjaman);
                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("| %-7s | %-15s | %-11s | %-9s | %-10s |\n", "Nama", "Buku", "Lama Pinjam", "Terlambat", "Denda");
                    System.out.println("----------------------------------------------------------------------");
                    for (Peminjaman p : daftarPeminjaman) p.tampilPeminjaman();
                    System.out.println("----------------------------------------------------------------------");
                    break;
                    
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String cariNIM = sc.nextLine();
                    System.out.println("[Binary Search] ditemukan: ");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("| %-7s | %-15s | %-11s | %-9s | %-10s |\n", "Nama", "Buku", "Lama Pinjam", "Terlambat", "Denda");
                    System.out.println("----------------------------------------------------------------------");
                    binarySearchNIM(daftarPeminjaman, cariNIM);
                    System.out.println("----------------------------------------------------------------------");
                    break;

                case 6:
                    System.out.print("Masukkan NIM: ");
                    String inNim = sc.nextLine();

                    Mahasiswa mhsBaru = null;
                    for (Mahasiswa m : daftarMhs) {
                        if (m.nim.equals(inNim)) {
                            mhsBaru = m; 
                            break;
                        }
                    }
                    if (mhsBaru == null) {
                        System.out.println("NIM tidak ditemukan!");
                        break; 
                    }

                    System.out.print("Masukkan Kode Buku: ");
                    String inKode = sc.nextLine();
                    
                    Buku bukuBaru = null;
                    for (Buku b : daftarBuku) {
                        if (b.kodeBuku.equalsIgnoreCase(inKode)) {
                            bukuBaru = b;
                            break;
                        }
                    }
                    if (bukuBaru == null) {
                        System.out.println("Kode buku tidak ditemukan!");
                        break; 
                    }

                    System.out.print("Masukkan Lama Pinjam: ");
                    int inLama = sc.nextInt();
                    sc.nextLine();

                    Peminjaman pemBaru = new Peminjaman(mhsBaru, bukuBaru, inLama);

                    Peminjaman[] tempArray = new Peminjaman[daftarPeminjaman.length + 1];
                    for (int i = 0; i < daftarPeminjaman.length; i++) {
                        tempArray[i] = daftarPeminjaman[i];
                    }
                    tempArray[tempArray.length - 1] = pemBaru;
                    daftarPeminjaman = tempArray; 

                    System.out.println("Data peminjaman berhasil ditambahkan!");
                    break;

                case 7:
                    int totDendaKeseluruhan = 0;
                    int jmlTerlambat = 0;
                    int jmlTepatWaktu = 0;

                    for (Peminjaman p : daftarPeminjaman) {
                        totDendaKeseluruhan += p.denda;
                        if (p.terlambat > 0) {
                            jmlTerlambat++;
                        } else {
                            jmlTepatWaktu++;
                        }
                    }

                    System.out.println("\n=== STATISTIK PEMINJAMAN ===");
                    System.out.println("Total Denda Keseluruhan: Rp " + totDendaKeseluruhan);
                    System.out.println("Jumlah Peminjaman Terlambat: " + jmlTerlambat);
                    System.out.println("Jumlah Peminjaman Tepat Waktu: " + jmlTepatWaktu);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 0);
    }
}
