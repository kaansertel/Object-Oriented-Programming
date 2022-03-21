package soru6;

public class Neo extends Kisi {
	public String[] neoHareket = { "", "" };
	public int neoToplamKazanma;

	public Neo(String hareket1, String hareket2) {
		this.neoHareket[0] = hareket1; // tas
		this.neoHareket[1] = hareket2; // makas

	}

	public Neo(int turSayisi, int neoToplamKazanma) {
		this.neoToplamKazanma = neoToplamKazanma;
	}

	public Neo(int turSayisi) {
		super(turSayisi);
	}

	public String[] getNeoHareket() {
		return neoHareket;
	}

	public int getNeoToplamKazanma() {
		return neoToplamKazanma;
	}

}
