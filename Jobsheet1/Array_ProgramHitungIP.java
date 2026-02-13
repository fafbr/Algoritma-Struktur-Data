import java.util.Scanner;
public class Array_ProgramHitungIP {

    public static String konversiHuruf(double nilai) {
        if(nilai > 80 && nilai <= 100) return "A";
        else if(nilai > 73 && nilai <=80) return"B+";
        else if(nilai > 65 && nilai <=73) return"B";
        else if(nilai > 60 && nilai <=65) return"C+";
        else if(nilai > 50 && nilai <=60) return"C";
        else if(nilai > 39 && nilai <=50) return"D";
        else return"E";
    } 
    
    public static double konversiSetara(double nilai) {
        if(nilai > 80 && nilai <= 100) return 4.0;
        else if(nilai > 73 && nilai <=80) return 3.5;
        else if(nilai > 65 && nilai <=73) return 3.0;
        else if(nilai > 60 && nilai <=65) return 2.5;
        else if(nilai > 50 && nilai <=60) return 2.0;
        else if(nilai > 39 && nilai <=50) return 1.0;
        else return 0;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan Kerja"};

        int[] sks = {2, 2, 3, 3, 2, 3 , 3 , 2}; 

        double[] nilaiAngka =  new double[matkul.length];
        double totBobotSKS = 0;
        double totSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for(int i = 0; i < matkul.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + matkul[i] +": ");
            nilaiAngka[i] = sc.nextDouble();

            double nilaiSetara = konversiSetara(nilaiAngka[i]);
            totBobotSKS += (nilaiSetara * sks[i]);
            totSKS += sks[i];
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        
        System.out.printf("%-35s %-12s %-12s %-12s\n" ,"MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for(int i = 0; i < matkul.length; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-12.2f\n", matkul[i], nilaiAngka[i], konversiHuruf(nilaiAngka[i]), konversiSetara(nilaiAngka[i]));
        }
        
        System.out.println("===============================================");
        
        double ipSem = totBobotSKS / totSKS;
        System.out.printf("IP: %.2f\n", ipSem);

        sc.close();
    }
}