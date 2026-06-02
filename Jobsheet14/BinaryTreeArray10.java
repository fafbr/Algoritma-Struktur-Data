public class BinaryTreeArray10 {
    Mahasiswa10[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray10() {
        this.dataMahasiswa = new Mahasiswa10[10];
    }

    void populateData (Mahasiswa10 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public void add(Mahasiswa10 data) {
        if (data == null) {
            return;
        }
        int currentIdx = 0;
        while (true) {
            if (dataMahasiswa[currentIdx] == null) {
                dataMahasiswa[currentIdx] = data;
                idxLast = Math.max(idxLast, currentIdx);
                break;
            }

            if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                currentIdx = 2 * currentIdx + 1;
            } else {
                currentIdx = 2 * currentIdx + 2;
            }

            if (currentIdx >= dataMahasiswa.length) {
                System.out.print("Gagal, kapasitas array tidak mencukupi: " + currentIdx);
                break;
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
