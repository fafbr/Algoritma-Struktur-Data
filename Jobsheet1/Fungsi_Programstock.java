public class Fungsi_Programstock {
    public static void tampilPendapatan(int[][] stok, int[] harga) {
        System.out.println("=====================================================================");
        System.out.printf("%-15s | %-15s | %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("=====================================================================");
        
        for(int i = 0; i < stok.length; i++) {
            int totPendapatan = 0;
            
            for(int j = 0; j < harga.length; j++) {
                totPendapatan += stok[i][j] * harga[j];
            }
            
            String status = (totPendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            
            System.out.printf("Royal Garden %-2d | Rp%,-13d | %s\n", (i+1), totPendapatan, status);
        }
        System.out.println("=====================================================================");
    }

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        int[] harga = {75000, 50000, 60000, 10000};

        tampilPendapatan(stok, harga);
    }
}