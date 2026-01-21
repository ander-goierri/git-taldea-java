package kalk;

public class Kalkulagailua {
	
	public static double zatiketa(double zatidura, double zatitzailea) {
		if (zatidura == 0 && zatitzailea == 0) {
			System.out.println("0 zatitu da");
			return 0.0;
		} else {
			return zatidura/zatitzailea;
		}

		
		}
	}
