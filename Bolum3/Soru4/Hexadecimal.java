package Soru4;

import java.util.ArrayList;

public class Hexadecimal {
	public String s;
	public long decimalnumerics;
	ArrayList<Bilgiler> bilgiler = new ArrayList<>();

	public Hexadecimal(String s) {
		this.s = s;
		this.decimalnumerics = longDeger(s);

	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public long getDecimalnumerics() {
		return decimalnumerics;
	}

	public void setDecimalnumerics(long decimalnumerics) {
		this.decimalnumerics = decimalnumerics;
	}

	public Hexadecimal(Hexadecimal x) {

	}

	public long longDeger(String s) {
		String hexanumeric = s;

		long decimalnumeric = 0L;
		for (int i = 0; i < hexanumeric.length(); i++) {
			decimalnumeric = decimalnumeric * 16 + hexChar(hexanumeric.charAt(i));
		}
		return decimalnumeric;
	}

	public int hexChar(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else {
			return ch - '0';
		}

	}

	public void cikar(long x) {
		long sonuc = decimalnumerics - x;
		String s = Long.toHexString(sonuc);
		String buyukYazim = s.toUpperCase();
		Bilgiler bilgiler1 = new Bilgiler(decimalnumerics, "-", x, sonuc, buyukYazim);
		bilgiler.add(bilgiler1);
	}

	public void cikar(Hexadecimal hexa2) {
		String hexa3 = hexa2.getS();
		long y = longDeger(hexa3);
		long sonuc = decimalnumerics - y;
		String s = Long.toHexString(sonuc);
		String buyukYazim = s.toUpperCase();
		Bilgiler bilgiler1 = new Bilgiler(decimalnumerics, "-", y, sonuc, buyukYazim);
		bilgiler.add(bilgiler1);
	}

	public void topla(long x) {
		long sonuc = decimalnumerics + x;
		String s = Long.toHexString(sonuc);
		String buyukYazim = s.toUpperCase();
		Bilgiler bilgiler1 = new Bilgiler(decimalnumerics, "+", x, sonuc, buyukYazim);
		bilgiler.add(bilgiler1);
	}

	public void topla(Hexadecimal hexa2) {
		String hexa3 = hexa2.getS();
		long y = longDeger(hexa3);
		long sonuc = decimalnumerics + y;
		String s = Long.toHexString(sonuc);
		String buyukYazim = s.toUpperCase();
		Bilgiler bilgiler1 = new Bilgiler(decimalnumerics, "+", y, sonuc, buyukYazim);
		bilgiler.add(bilgiler1);
	}

	public void ekranaBas() {
		for (int i = 0; i < bilgiler.size(); i++) {
			System.out.println(bilgiler.get(i).getIlkSayi() + " " + bilgiler.get(i).islem + " "
					+ bilgiler.get(i).ikinciSayi + " = " + bilgiler.get(i).sonuc + ", Hexadecimal sonuc : \""
					+ bilgiler.get(i).hexSonuc + "\"");
		}

	}
}

class Bilgiler {
	public long ilkSayi;
	public String islem;
	public long ikinciSayi;
	public long sonuc;
	public String hexSonuc;

	public Bilgiler(long ilkSayi, String islem, long ikinciSayi, long sonuc, String hexSonuc) {
		super();
		this.ilkSayi = ilkSayi;
		this.islem = islem;
		this.ikinciSayi = ikinciSayi;
		this.sonuc = sonuc;
		this.hexSonuc = hexSonuc;
	}

	public long getIlkSayi() {
		return ilkSayi;
	}

	public void setIlkSayi(long ilkSayi) {
		this.ilkSayi = ilkSayi;
	}

	public String getIslem() {
		return islem;
	}

	public void setIslem(String islem) {
		this.islem = islem;
	}

	public long getIkinciSayi() {
		return ikinciSayi;
	}

	public void setIkinciSayi(long ikinciSayi) {
		this.ikinciSayi = ikinciSayi;
	}

	public long getSonuc() {
		return sonuc;
	}

	public void setSonuc(long sonuc) {
		this.sonuc = sonuc;
	}

	public String getHexSonuc() {
		return hexSonuc;
	}

	public void setHexSonuc(String hexSonuc) {
		this.hexSonuc = hexSonuc;
	}

}
