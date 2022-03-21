package soru6;

public class Kisi {
	public String isim;
	public int turSayisi;
	public String[] hareket = { " ", " ", " " };

	public Kisi(int turSayisi) {
		this.turSayisi = turSayisi;

		oyunbaslasin();

	}

	public Kisi(String hareket1, String hareket2, String hareket3, int turSayisi) {
		this.turSayisi = turSayisi;
		this.hareket[0] = hareket1;
		this.hareket[1] = hareket2;
		this.hareket[2] = hareket3;
		oyunbaslasin();
	}

	public Kisi() {
		super();
	}

	private void oyunbaslasin() {
		int neoKazanmaSayisi = 0;
		int smithKazanmaSayisi = 0;
		int toplamBerabere = 0;

		Smith smith = new Smith(hareket[0], hareket[1]);
		Neo neo = new Neo(hareket[0], hareket[2]);

		for (int i = 0; i < turSayisi; i++) {

			int secim1 = (int) (Math.random() * 2);
			int secim2 = (int) (Math.random() * 2);

			String smithHareket = smith.smithHareket[secim1];
			String neoHareket = neo.neoHareket[secim2];

			String durum;
			int sayac;
			String kazanan;

			if (secim1 == 0 && secim2 == 0) {
				durum = "Berabere";
				sayac = 0;
				toplamBerabere += 1;
			} else {
				durum = "Kazanan var";
				sayac = 1;
			}

			if (secim1 == 0 && secim2 == 1) {
				kazanan = "Smith";
				smithKazanmaSayisi += 1;
			} else if (secim1 == 1 && secim2 == 0) {
				kazanan = "Smith";
				smithKazanmaSayisi += 1;
			} else if (secim1 == 1 && secim2 == 1) {
				kazanan = "Neo";
				neoKazanmaSayisi += 1;
			} else {
				kazanan = "Neo";
			}

			if (sayac == 0) {
				System.out.println("Smith" + " (" + smithHareket + ") " + "VS" + " (" + neoHareket + ") " + "Neo, "
						+ "----> Durum: " + durum);
			} else {
				System.out.println("Smith" + " (" + smithHareket + ") " + "VS" + " (" + neoHareket + ") " + "Neo, "
						+ "----> Durum: " + durum + "-------> Kazanan kisi: " + kazanan);
			}
		}

		Smith smith2 = new Smith(turSayisi, smithKazanmaSayisi);
		Neo neo2 = new Neo(turSayisi, neoKazanmaSayisi);
		System.out.println();
		System.out.println("---------------Sonuc---------------");
		System.out.println("Toplam Oyanan Tur Sayisi: " + turSayisi);
		System.out.println("Smith'in Kazanma Sayisi: " + smith2.getSmithToplamKazanma());
		System.out.println("Neo'nun Kazanma Sayisi: " + neo2.getNeoToplamKazanma());
		System.out.println("Berabere Sayisi: " + toplamBerabere);
		
		System.out.println("--Genel Durum--");
		if(smith2.getSmithToplamKazanma() > neo2.getNeoToplamKazanma()) {
			System.out.println("Kazanan : Smith");
		}else if (smith2.getSmithToplamKazanma() < neo2.getNeoToplamKazanma() ) {
			System.out.println("Kazanan : Neo");
		}else {
			System.out.println("BERABERE");
		}

	}

}
