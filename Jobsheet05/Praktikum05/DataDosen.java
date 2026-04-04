package Praktikum05;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data berhasil ditambahakan!");
        } else {
            System.out.println("Kapasitas array penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data masih kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
        System.out.println("Berhasil sorting ASC (bubble sort");
    }

    public void SortDSC() {
        
        System.out.println("Berhasil sorting DSC (insertion Sort");
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
