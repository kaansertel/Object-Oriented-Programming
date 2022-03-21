package soru3;

import java.util.ArrayList;

public class Kisi {
	public String adý;
	public int telNo;
	public String eMail;

	public boolean yemekAl() {
		return true;
	}

}

class Adres {
	public String cadde;
	public String sehir;
	public int postaKodu;

	ArrayList<Kisi> kisiler = new ArrayList<>();

	public void ekranaYaz() {
		System.out.println(cadde + sehir + postaKodu);
	}
}
