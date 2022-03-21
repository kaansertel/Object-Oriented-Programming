package soru4;

import java.util.Collections;
import java.util.Comparator;

public class KisiListesi extends Kisi {

	public void kisiEkle(String adSoyad, String yer, int yil) {
		Kisi kisi1 = new Kisi(adSoyad, yer, yil);
		kisiListesi.add(kisi1);

	}

	public void kisiEkle(String adSoyad, String yer, int yil, String siralamaTipi) {
		Kisi kisi1 = new Kisi(adSoyad, yer, yil);
		kisiListesi.add(kisi1);

		if ("YER".equals(siralamaTipi)) {
			Collections.sort(kisiListesi, new KisiYerSirali());
			System.out.println("Yere gore siralama:");
		} else if ("YIL".equals(siralamaTipi)) {
			Collections.sort(kisiListesi, new KisiYilSirali());
			System.out.println("Yila gore siralama:");
		} else if ("YERYIL".equals(siralamaTipi)) {
			Collections.sort(kisiListesi, new KisiYerYilSirali());
			System.out.println("Once yere sonra yila gore siralama: ");
		}
		goster();
		System.out.println();

	}
	
	public void kisiEkle(String siralamaTipi) {
		if ("YER".equals(siralamaTipi)) {
			Collections.sort(kisiListesi, new KisiYerSirali());
			System.out.println("Yere gore siralama:");
		} else if ("YIL".equals(siralamaTipi)) {
			Collections.sort(kisiListesi, new KisiYilSirali());
			System.out.println("Yila gore siralama:");
		} else if ("YERYIL".equals(siralamaTipi)) {
			Collections.sort(kisiListesi, new KisiYerYilSirali());
			System.out.println("Once yere sonra yila gore siralama: ");
		}
		goster();
		System.out.println();
	}

	public void sirala() {
		Collections.sort(kisiListesi, new KisiYerSirali());
		System.out.println("Yere gore siralama:");
		goster();
		System.out.println();
		Collections.sort(kisiListesi, new KisiYilSirali());
		System.out.println("Yila gore siralama:");
		goster();
		System.out.println();
		Collections.sort(kisiListesi, new KisiYerYilSirali());
		System.out.println("Once yere sonra yila gore siralama: ");
		goster();
		System.out.println();
	}

	@Override
	public void goster() {
		super.goster();
	}

}

class KisiYilSirali implements Comparator<Kisi> {

	@Override
	public int compare(Kisi o1, Kisi o2) {
		if (o1.getYil() > o2.getYil()) {
			return 1;
		} else if (o1.getYil() < o2.getYil()) {
			return -1;
		} else
			return 0;
	}

}

class KisiYerSirali implements Comparator<Kisi> {

	@Override
	public int compare(Kisi o1, Kisi o2) {

		return o1.getYer().compareTo(o2.getYer());
	}

}

class KisiYerYilSirali implements Comparator<Kisi> {

	@Override
	public int compare(Kisi o1, Kisi o2) {

		int compareYer = o1.getYer().compareTo(o2.getYer());
		if (compareYer < 0)
			return -1;
		if (compareYer > 0)
			return 1;
		if (compareYer == 0) {
			if (o1.getYil() > o2.getYil()) {
				return 1;
			} else if (o1.getYil() < o2.getYil()) {
				return -1;
			} else
				return 0;

		}
		return 0;
	}

}
