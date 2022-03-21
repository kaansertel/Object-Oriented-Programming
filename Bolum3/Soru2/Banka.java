package Soru2;

public class Banka {
	private String ad;
	private String soyAd;
	private int bakiye = 0;
	Hesap[] hesaplar = new Hesap[3];
	String[] referansKodlari = new String[5];
	Boolean[][] matrix = new Boolean[3][5];

	public Banka(String ad, String soyAd, int hesapNumarasi, String referansKodu1, String referansKodu2) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		int eklenecekBakiye;
		referansKodlari[0] = "ABB"; // 50TL
		referansKodlari[1] = "BCC"; // 20TL
		referansKodlari[2] = "CDD"; // 10TL
		referansKodlari[3] = "DEE"; // 5TL
		referansKodlari[4] = "EFF"; // 1TL

		for (int i = 0; i < referansKodlari.length; i++) {
			if (referansKodlari[i] == referansKodu1) {
				matrix[hesapNumarasi][i] = true;
			} else {
				matrix[hesapNumarasi][i] = false;
			}
			if (referansKodlari[i] == referansKodu2) {
				matrix[hesapNumarasi][i] = true;
			}

		}

		for (int satir = hesapNumarasi; satir < (hesapNumarasi + 1); satir++) {
			for (int sutun = 0; sutun < matrix[satir].length; sutun++) {
				if (matrix[satir][sutun]) {
					eklenecekBakiye = sutun;
					bakiyeEkle(eklenecekBakiye);
				}
			}

		}

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public int bakiyeEkle(int eklenecekBakiye) {
		if (eklenecekBakiye == 0) {
			return bakiye += 50;
		} else if (eklenecekBakiye == 1) {
			return bakiye += 20;
		} else if (eklenecekBakiye == 2) {
			return bakiye += 10;
		} else if (eklenecekBakiye == 3) {
			return bakiye += 5;
		} else {
			return bakiye += 1;
		}
	}

	public void bilgiYazdir() {
		System.out.println("Bilgiler...");
		System.out.println("Isim: " + this.ad);
		System.out.println("Soyisim: " + this.soyAd);
		System.out.println("Bakiye: " + this.bakiye + "TL");
	}

}
