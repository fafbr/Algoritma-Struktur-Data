import java.util.Scanner;
public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen10[] arrayOfDosen = new Dosen10[3];
        String kode,nama, inputJk;
        boolean jenisKelamin;
        int usia;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-"+ (i+1));
            System.out.print("Kode            : ");
            kode = sc.nextLine();
            System.out.print("Nama            : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            inputJk = sc.nextLine();
            jenisKelamin = inputJk.equalsIgnoreCase("Pria");
            System.out.print("Usia            : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------------------");
            
            arrayOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }
        
        int i = 1;
        for (Dosen10 dosen10 : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+ (i));
            System.out.println("Kode            : " + dosen10.kode);
            System.out.println("Nama            : " + dosen10.nama);
            System.out.println("Jenis Kelamin   : " + (dosen10.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen10.usia);
            System.out.println("-------------------------------------");

            i++;
        }

        System.out.println("\n===Data Semua Dosen===");
        DataDosen10.dataSemuaDosen(arrayOfDosen);
    }
}
