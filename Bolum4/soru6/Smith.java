package soru6;

public class Smith extends Kisi {
	public String[] smithHareket = { "", "" };
	public int smithToplamKazanma;

	public Smith(int turSayisi) {
		super(turSayisi);
	}

	public Smith(int turSayisi, int smithToplamKazanma) {
		this.smithToplamKazanma = smithToplamKazanma;
	}

	public Smith(String hareket1, String hareket2) {
		this.smithHareket[0] = hareket1; // tas
		this.smithHareket[1] = hareket2; // kagit
	}

	public String[] getSmithHareket() {
		return smithHareket;
	}

	public int getSmithToplamKazanma() {
		return smithToplamKazanma;
	}

}
