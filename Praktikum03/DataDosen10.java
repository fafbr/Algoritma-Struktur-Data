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

    public static void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for(Dosen10 dosen: arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else{
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : "+pria);
        System.out.println("Jumlah Dosen Wanita : "+wanita);
    }
}
