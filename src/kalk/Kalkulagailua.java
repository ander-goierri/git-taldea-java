package kalk;

public class Kalkulagailua {
    public static int zatiketaZeroKontutanEdukita(int zatikizuna, int zatitzailea) {
        if (zatitzailea == 0 ) {
            return 0;   
        } else {
            return zatikizuna / zatitzailea;      
        }   
    }

    public static int biderketa(int a, int b) {
        return a * b;
    }
}