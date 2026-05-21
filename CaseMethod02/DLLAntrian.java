public class DLLAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int size;
    int totAntrian;

    public DLLAntrian() {
        head = tail = null;
        size = 0;
        totAntrian = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli data) {
        totAntrian++;
        data.noAntrian = totAntrian;
        NodeAntrian newNode = new NodeAntrian(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public Pembeli removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return null;
        }
        Pembeli removedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedData;
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        }
        System.out.println("=====================================");
        System.out.println("Daftar Antrian Pembeli:");
        System.out.println("=====================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.data.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }
}
