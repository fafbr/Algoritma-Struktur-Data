import java.util.Scanner;
public class Pemilihan_ProgramMenghitungNilaiAkhir {

    public static String konversiNilai(double nilaiMutu) {
        if(nilaiMutu > 80 && nilaiMutu <= 100) return "A";
        else if(nilaiMutu > 73 && nilaiMutu <=80) return"B+";
        else if(nilaiMutu > 65 && nilaiMutu <=73) return"B";
        else if(nilaiMutu > 60 && nilaiMutu <=65) return"C+";
        else if(nilaiMutu > 50 && nilaiMutu <=60) return"C";
        else if(nilaiMutu > 39 && nilaiMutu <=50) return"D";
        else return"E";
    }

    public static boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        // if(!tugas == )
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("====================");
        System.out.println("====================");

        if(!isValid(tugas)||!isValid(kuis)||!isValid(uts)||!isValid(uas)){
            System.out.println("nilai tidak valid");
        } else { 
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            String nilaiHuruf = konversiNilai(nilaiAkhir);
            String status = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "Anda TIDAK LULUS" : "Selamat Anda LULUS";

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("================");
            System.out.println("================");
            System.out.println(status);
        }
        sc.close();
    }
}