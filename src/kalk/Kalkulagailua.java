package kalk;

public class Kalkulagailua {
	int emaitza=0;
	
	public static int zatiketa(int zatidura, int zatitzailea, int emaitza) {
		emaitza=zatidura/zatitzailea;
		if (zatitzailea!=0) {
			emaitza=emaitza;
		}else{
			emaitza=0;
			
		}
		return emaitza;
	}
	public int zatiketaZeroKontutanEdukita() {
		return zatiketa(emaitza, emaitza, emaitza);
	}
	
}
