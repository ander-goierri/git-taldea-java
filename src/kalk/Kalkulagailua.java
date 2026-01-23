package kalk;

public class Kalkulagailua {
	
	public static int zatiketa(int zatidura, int zatitzailea) {
		if(zatitzailea == 0) {
		return 0;
		}
		return zatidura/zatitzailea;
	}
	
	public void zatiketaZeroKontuanEdukita(int zatidura, int zatitzailea) {
		if(zatitzailea == 0) {
			int zatiketa = 0;
		}
		int zatiketa = zatidura/zatidura;
	}
	
}
