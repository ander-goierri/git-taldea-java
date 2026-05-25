package kalk;

public class Kalkulagailua {
	
	public static int zatiketa(int zatidura, int zatitzailea) {
		if (zatitzailea == 0) {
			System.out.println("Ezin da zeroz zatitu, INDETERMINAZIOA");
			return 0;
		}

		return zatidura/zatitzailea;
	}

	
	
}
