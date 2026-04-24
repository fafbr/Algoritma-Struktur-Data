public class StackSurat10 {
    Surat10[] stack;
    int size;
    int top;

    public StackSurat10(int size) {
        this.size = size;
        this.stack = new Surat10[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat10 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Belum ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String namaMhs) {
        if (!isEmpty()) {
            boolean ditemukan = false;
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                    System.out.println("Surat ditemukan pada tumpukan ke-" +(top - i + 1) + " dari atas.");
                    System.out.println("ID Surat    : " + stack[i].idSurat);
                    System.out.println("Nama        : " + stack[i].namaMahasiswa);
                    System.out.println("Jenis       : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Lainnya"));
                    System.out.println("Durasi      : " + stack[i].durasi + " hari");
                    System.out.println("-------------------------------------------------");
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Surat atas nama " + namaMhs + " tidak ditemukan di dalam Stack.");
            }
        } else {
            System.out.println("Stack kosong! Belum ada data surat.");
        }
    }
}