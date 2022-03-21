package soru3;

public class Personel implements Comparable<Personel> {
	private String isim;
	private String soyisim;
	private String departman;

	public Personel(String isim, String soyisim, String departman) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.departman = departman;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public void bilgiYazdir() {
		System.out.println("Bilgiler...");
		System.out.println("Isim: " + this.isim);
		System.out.println("Soyisim: " + this.soyisim);

	}

	public void tumBilgileriYazdir() {
		System.out.println("Bilgiler...");
		System.out.println("Isim: " + this.isim);
		System.out.println("Soyisim: " + this.soyisim);
		System.out.println("Departman: " + this.departman);
	}

	@Override
	public int compareTo(Personel o) {
		int compareSoyisim = this.soyisim.compareTo(o.soyisim);
		int compareInt = this.isim.compareTo(o.isim);
		if (compareInt < 0)
			return -1;
		if (compareInt > 0)
			return 1;
		if (compareInt == 0) {
			if (compareSoyisim < 0) {
				return -1;
			} else if (compareSoyisim > 0) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
}
