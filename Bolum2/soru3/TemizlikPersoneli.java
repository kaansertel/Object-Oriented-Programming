package soru3;

public class TemizlikPersoneli extends Personel {

	public TemizlikPersoneli(String isim, String soyisim, String departman) {
		super(isim, soyisim, departman);
	}

	@Override
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("Departman: TemizlikPersoneli");
	}

}
