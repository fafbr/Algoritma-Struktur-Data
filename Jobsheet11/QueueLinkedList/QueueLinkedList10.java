package QueueLinkedList;

public class QueueLinkedList10 {
    Node10 head, tail;
    int size;

    public QueueLinkedList10() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void enqueue(Mahasiswa10 data) {
        Node10 newNode = new Node10(data, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Berhasil menambahkan antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
            return;
        }
        Mahasiswa10 dataKeluar = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Memanggil antrian:");
        dataKeluar.tampilData();
    }

    public void printFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian terdepan:");
        head.data.tampilData();
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian paling akhir:");
        tail.data.tampilData();
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node10 temp = head;
        int i = 1;
        System.out.println("--- Daftar Antrian ---");
        while (temp != null) {
            System.out.print(i + ". ");
            temp.data.tampilData();
            temp = temp.next;
            i++;
        }
    }

    public void getJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}
