package minggu5;
public class Faktorial {
    // public static int faktorialBF(int n) {
    //     int fakto = 1;
    //     for(int i = 1; i <= n; i++) {
    //         fakto *= i;
    //     }
    //     return fakto;
    // }

    public int faktorialBF_while(int n) {
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto *= i;
        i++;
    }
    return fakto;
}

    public static int faktorialDC(int n) {
        if(n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}