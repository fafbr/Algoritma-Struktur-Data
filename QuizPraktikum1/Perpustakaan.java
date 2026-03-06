public class Perpustakaan {
    Buku[] daftarBuku = new Buku[100];
    Mahasiswa[] daftarMahasiswa = new Mahasiswa[100];
    int totalBuku = 0;
    int totalMahasiswa = 0;

    public void tambahBuku(String kode, String judul, String penulis) {
        if(totalBuku < daftarBuku.length) {
            daftarBuku[totalBuku] = new Buku(kode, judul, penulis, false);
            totalBuku++;
            System.out.println("buku ditambahkan.");
        } else {
            System.out.println("Kapasitas buku telah penuh.");
        }
    }

    public void tambahMahasiswa(String nim, String nama) {
        if(totalMahasiswa < daftarMahasiswa.length) {
            daftarMahasiswa[totalMahasiswa] = new Mahasiswa(nim, nama);
            totalMahasiswa++;
            System.out.println("Mahasiswa ditambahkan");
        } else {
            System.out.println("kapasitas mahasiswa penuh.");
        }
    }

    public void pinjamBuku(String nim, String kodeBuku) {
        Mahasiswa mhs = cariMahasiswa(nim);
        Buku buku = cariBuku(kodeBuku);

        if(mhs == null) {
            System.out.println("mahasiswa tidak ditemukan.");
            return;
        }
        if(buku == null) {
            System.out.println("buku tidak ditemukan.");
            return;
        }

        if(buku.statusPeminjaman) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku +" karena sudah dipinjam.");
            return;
        }
        if(mhs.jumlahDipinjam >=2) {
            System.out.println("gagal meminjam: " + mhs.nama + " sudah mencapai batas peminjaman.");
            return;
        }

        buku.statusPeminjaman = true;
        mhs.bukuDipinjam[mhs.jumlahDipinjam] = buku;
        mhs.jumlahDipinjam++;
        System.out.println(mhs.nama + " berhasil meminjam " + buku.judulBuku);
    }

    public void kembalikanBuku(String nim, String kodeBuku) {
        Mahasiswa mhs = cariMahasiswa(nim);
        if(mhs == null) {
            System.out.println("mahasiswa tidak ditemukan.");
            return;
        }

        for(int i = 0; i < mhs.jumlahDipinjam; i++) {
            if(mhs.bukuDipinjam[i].kodeBuku.equals(kodeBuku)) {
                mhs.bukuDipinjam[i].statusPeminjaman = false;
                System.out.println(mhs.nama + "Berhasil mengembalikan " + mhs.bukuDipinjam[i].judulBuku);

                for(int j = i; j < mhs.jumlahDipinjam - 1; j++) {
                    mhs.bukuDipinjam[j] = mhs.bukuDipinjam[j+1];
                }
                mhs.bukuDipinjam[mhs.jumlahDipinjam - 1] = null;
                mhs.jumlahDipinjam--;
                return;
            }
        }
        System.out.println("buku tidak ditemukan dalam daftar pinjaman mahasiswa.");
    }

    public void tampilkanPeminjaman() {
        System.out.println("\nDaftar Peminjaman Buku: ");
        boolean adaPeminjaman = false;
        for(int i = 0; i < totalMahasiswa; i++) {
            Mahasiswa mhs = daftarMahasiswa[i];
            if(mhs. jumlahDipinjam > 0) {
                adaPeminjaman = true;
                System.out.print((mhs.nama + " meminjam: "));
                for(int j = 0; j < mhs.jumlahDipinjam; j++) {
                    System.out.println(mhs.bukuDipinjam[j].judulBuku);
                    if(j < mhs.jumlahDipinjam - 1) System.out.print(", ");
                }
                System.out.println();        
            }
        }
        if(!adaPeminjaman) {
            System.out.println("Belum ada buku yang dipinjam.");
        }
    }

    private Mahasiswa cariMahasiswa(String nim) {
        for(int i = 0; i < totalMahasiswa; i++) {
            if(daftarMahasiswa[i].nim.equalsIgnoreCase(nim)) return daftarMahasiswa[i];
        }
        return null;
    }

    private Buku cariBuku(String kodeBuku) {
        for(int i = 0;i < totalBuku; i++) {
            if(daftarBuku[i].kodeBuku.equalsIgnoreCase(kodeBuku)) return daftarBuku[i];
        }
        return null;
    }
}