import java.util.Scanner;
public class ProgramTugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void inputDataJadwal(String[][] jadwal) {
        for(int i = 0; i < jadwal.length; i++) {
            System.out.println("\nData Jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah  : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang             : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari              : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah        : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSeluruhJadwal(String[][] jadwal) {
        System.out.println("\n===================================");
        System.out.printf("%-20s | %-10s | %-10s | %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===================================");
    }

    public static void tampilkanBerdasarkanHari(String[][] jadwal, String hari) {
        System.out.println("\nHasil Pencarian Hari: " + hari);
        boolean isValid = false;
        for(int i = 0; i < jadwal.length; i++) {
            if(jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("Mata Kuliah: %s | Jam: %s | Ruang: %s\n", jadwal[i][0], jadwal[i][3], jadwal[i][1]);
                isValid = true;
            }
        }
        if(!isValid) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }
    
    public static void tampilkanBerdasarkanMK(String[][] jadwal, String mk) {
        System.out.println("\nHasil Pencarian Mata Kuliah: " + mk);
        boolean isValid = false;
        for(int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("Hari: %s | Jam: %s | Ruang %s\n", jadwal[i][2], jadwal[i][3], jadwal[i][1]);
            }
            isValid = true;
        }
        if(!isValid) System.out.println("Mata Kuliah tidak ditemukan.");
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        

        String[][] jadwal = new String[n][4];
        inputDataJadwal(jadwal);
        tampilkanSeluruhJadwal(jadwal);
        
        System.out.print("\nMasukkan hari yg ingin dicari: ");
        String hariCari = sc.nextLine();
        tampilkanBerdasarkanHari(jadwal, hariCari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String mkCari = sc.nextLine();
        tampilkanBerdasarkanMK(jadwal, mkCari);
    }
}