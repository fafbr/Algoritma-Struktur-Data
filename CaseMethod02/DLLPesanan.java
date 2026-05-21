public class DLLPesanan {
    NodePesanan head;
    NodePesanan tail;

    public DLLPesanan() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Pesanan data) {
        NodePesanan newNode =  new NodePesanan(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortPesanan() {
        if (isEmpty() || head == tail) return;
        NodePesanan current = head.next;
        while (current != null) {
            Pesanan key = current.data;
            NodePesanan searchNode = current.prev;
            while (searchNode != null && searchNode.data.namaPesanan.compareToIgnoreCase(key.namaPesanan) > 0) {
                searchNode.next.data = searchNode.data;
                searchNode = searchNode.prev;
            }
            if (searchNode == null) {
                head.data = key;
            } else {
                searchNode.next.data = key;
            }
            current = current.next;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
        }
        sortPesanan();
        System.out.println("====================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("====================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pelanggan", "Harga");
        NodePesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            current = current.next;
        }
    }
}
