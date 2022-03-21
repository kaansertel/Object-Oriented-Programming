package soru3;

public class Doktor extends Personel {

	public Doktor(String isim, String soyisim, String departman) {
		super(isim, soyisim, departman);
	}

	@Override
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("Departman: Doktor");
	}

}
