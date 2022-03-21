package Soru5;

import java.util.ArrayList;

public class Kisi extends Hareket {
	public String isim;
	public int kisiSayisi;
	public int turSayisi;
	public int sonuc = 0;
	ArrayList<Kisi> kisiler = new ArrayList<>();

	public Kisi() {
		super();
	}

	public Kisi(String isim) {
		super();
		this.isim = isim;
	}

	public Kisi(int kisiSayisi, int turSayisi) {
		this.kisiSayisi = kisiSayisi;
		this.turSayisi = turSayisi;
		kisiEkle(kisiSayisi);
		oyunBaslasin(turSayisi);

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getKisiSayisi() {
		return kisiSayisi;
	}

	public void setKisiSayisi(int kisiSayisi) {
		this.kisiSayisi = kisiSayisi;
	}

	public int getTurSayisi() {
		return turSayisi;
	}

	public void setTurSayisi(int turSayisi) {
		this.turSayisi = turSayisi;
	}

	public int getSonuc() {
		return sonuc;
	}

	public void setSonuc(int sonuc) {
		this.sonuc = sonuc;
	}

	public void oyunBaslasin(int turSayisi) {
		for (int i = 0; i < turSayisi; i++) {
			int birinciKisi = rastGeleSayi();
			int ikinciKisi = rastGeleSayi();
			if (birinciKisi == ikinciKisi) {
				ikinciKisi = rastGeleSayi();
			}
			int secim1 = (int) (Math.random() * 3);
			int secim2 = (int) (Math.random() * 3);

			String birinciOyuncu = hareket[secim1];
			String ikinciOyuncu = hareket[secim2];

			String durum;
			int sayac;
			int index = 0;

			if (secim1 == 0 && secim2 == 0) {
				durum = "Berabere";
				sayac = 0;
			} else if (secim1 == 1 && secim2 == 1) {
				durum = "Berabere";
				sayac = 0;
			} else if (secim1 == 2 && secim2 == 2) {
				durum = "Berabere";
				sayac = 0;
			} else {
				durum = "Kazanan Var";
				sayac = 1;
			}

			if (secim1 == 0 && secim2 == 1) {
				index = ikinciKisi;
			} else if (secim1 == 0 && secim2 == 2) {
				index = birinciKisi;
			} else if (secim1 == 1 && secim2 == 0) {
				index = birinciKisi;
			} else if (secim1 == 1 && secim2 == 2) {
				index = ikinciKisi;
			} else if (secim1 == 2 && secim2 == 0) {
				index = ikinciKisi;
			} else if (secim1 == 2 && secim2 == 1) {
				index = birinciKisi;
			}
			if (sayac == 0) {
				System.out.println(kisiler.get(birinciKisi).getIsim() + " (" + birinciOyuncu + ")" + "vs" + "("
						+ ikinciOyuncu + ") " + kisiler.get(ikinciKisi).getIsim() + ", Durum = " + durum);
			} else if (sayac == 1) {
				System.out.println(kisiler.get(birinciKisi).getIsim() + " (" + birinciOyuncu + ")" + "vs" + "("
						+ ikinciOyuncu + ") " + kisiler.get(ikinciKisi).getIsim() + ", Durum = " + durum
						+ " ---> Kazanan kisi: " + kisiler.get(index).getIsim());
			}

		}

	}

	private int rastGeleSayi() {
		int sayi = (int) (Math.random() * 30);
		return sayi;
	}

	public void kisiEkle(int kisiSayisi) {
		String[] isim = new String[30];
		isim[0] = "Ali";
		isim[1] = "Mehmet";
		isim[2] = "Ayse";
		isim[3] = "Duygu";
		isim[4] = "Ece";
		isim[5] = "Kaan";
		isim[6] = "Sena";
		isim[7] = "Orkun";
		isim[8] = "Burak";
		isim[9] = "Ozge";
		isim[10] = "Fatma";
		isim[11] = "Kadir";
		isim[12] = "Yavuz";
		isim[13] = "Talha";
		isim[14] = "Kubilay";
		isim[15] = "Beyza";
		isim[16] = "Bilge";
		isim[17] = "Melisa";
		isim[18] = "Yasin";
		isim[19] = "Baris";
		isim[20] = "Atakan";
		isim[21] = "Damla";
		isim[22] = "Semih";
		isim[23] = "Volkan";
		isim[24] = "Zekeriya";
		isim[25] = "Halil";
		isim[26] = "Fatih";
		isim[27] = "Efe";
		isim[28] = "Berke";
		isim[29] = "Nazmi";
		for (int i = 0; i < kisiSayisi; i++) {
			String x = isim[i];
			Kisi kisi1 = new Kisi(x);
			kisiler.add(kisi1);
		}
	}
}
