public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jmlDiproses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max]; 
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jmlDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;  
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Memproses KRS Mahasiswa:");
        for (int i = 0; i < 2; i++) {
            if (!isEmpty()) {
                Mahasiswa mhs = data[front];
                front = (front + 1) % max;
                size--;
                jmlDiproses++;
                System.out.println("- ");
                mhs.tampilkanData();
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian.");
        for (int i = 0; i < size; i++) {
            int index = (front + 1) % max;
            System.out.println((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosonng.");
            return;
        }
        System.out.println("2 Antrian Terdepan: ");
        System.out.println("1. ");
        data[front].tampilkanData();
        if (size > 1) {
            int next = (front+1) % max;
            System.out.println("2. ");
            data[next].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJmlAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJmlSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah KRS: " + jmlDiproses);
    }

    public void cetakSisaBelumKRS() {
        int batasDPA = 30;
        int sisa = batasDPA - jmlDiproses;
        System.out.println("Sisa kuota DPA yang belum melakukan proses KRS: " + sisa);
    }
}
