public class DataDosen10 {
    public static void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        int i = 1;
        for(Dosen10 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+i);
            System.out.println("Kode            :" + dosen.kode);
            System.out.println("Nama            :" + dosen.nama);
            System.out.println("Jenis Kelamin   :" + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            :" + dosen.usia);
            System.out.println("-------------------------------------");
            i++;
        }
    }
}
