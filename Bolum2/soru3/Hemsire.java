package soru3;

public class Hemsire extends Personel {

	public Hemsire(String isim, String soyisim, String departman) {
		super(isim, soyisim, departman);
	}

	@Override
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("Departman: Hemsire");
	}

}
