package soru2;

public class Araba {
	private static Araba arabaInstance = null;
	public String s;
	
	private Araba() {
		s = "Araba yaraticisi! ";
	}

	public static Araba yarat() {

		if (arabaInstance == null) {
			arabaInstance = new Araba();
		}
		return arabaInstance;
	}
}
