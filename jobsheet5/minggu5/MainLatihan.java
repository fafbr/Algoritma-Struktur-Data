package minggu5;

public class MainLatihan {
    public static int maxUts(Mahasiswa[] arr, int l, int r) {
        if(l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l+r)/2;
        int lMax = maxUts(arr, l, mid);
        int rMax = maxUts(arr, mid + 1, r);

        return Math.max(lMax, rMax);
    }

    public static int minUts(Mahasiswa[] arr, int l, int r) {
        if(l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r)/2;
        int lMin = minUts(arr, l, mid);
        int rMin =minUts(arr, mid + 1, r);
        return Math.min(lMin, rMin);
    }

    public static double rataRataUAS(Mahasiswa[] arr) {
        double total = 0;
        for(int i=0; i<arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[8];
        mhs[0] = new Mahasiswa("Ahmad", 220101001, 2022, 78, 82);
        mhs[1] = new Mahasiswa("Budi", 220101002, 2022, 85, 88);
        mhs[2] = new Mahasiswa("Cindy", 220101003, 2021, 90, 87);
        mhs[3] = new Mahasiswa("Dian", 220101004, 2021, 76, 79);
        mhs[4] = new Mahasiswa("Eko", 220101005, 2023, 92, 95);
        mhs[5] = new Mahasiswa("Fajar", 220101006, 2020, 88, 85);
        mhs[6] = new Mahasiswa("Gina", 220101007, 2023, 80, 83);
        mhs[7] = new Mahasiswa("Hadi", 220101008, 2020, 82, 84);

        System.out.println("--- Hasil Evaluasi Nilai Mahasiswa ---");
        int batasKanan = mhs.length -1;
        int tertinggiUts = maxUts(mhs, 0, batasKanan);
        System.out.println("a) Nilai UTS Tertinggi (DC): "+tertinggiUts);
        int terendahUts = minUts(mhs, 0, batasKanan);
        System.out.println("b) Nilai UTS Terendah (DC): "+terendahUts);
        double rataUas = rataRataUAS(mhs);
        System.out.println("c) Rata-rata Nilai UAS (BF): "+rataUas);
    }
}