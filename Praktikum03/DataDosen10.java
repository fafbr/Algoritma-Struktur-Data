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

    public static void rerataUsiaDosenPengajar(Dosen10[] arrayOfDosen) {
        int usiaPria = 0, usiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for(Dosen10 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin) {
                usiaPria += dosen.usia;
                countPria++;
            } else {
                usiaWanita += dosen.usia;
                countWanita++;
            }
        }
        System.out.printf("Rerata Usia Dosen Pria: %.2f\n", (countPria == 0 ? 0 : (double) usiaPria / countPria));
        System.out.printf("Rerata Usia Dosen Wanita: %.2f\n", (countWanita == 0 ? 0 : (double) usiaWanita / countWanita));
    }

    public static void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 tertua = arrayOfDosen[0];
        for(Dosen10 dosen : arrayOfDosen) {
            if(dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen paling tua: "+ tertua.nama+ " (usia"+ tertua.usia+")");
    }

    public static void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 termuda = arrayOfDosen[0];
        for(Dosen10 dosen : arrayOfDosen) {
            if(dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen paling muda: "+ termuda.nama+ " (usia"+ termuda.usia+")");
    }
}