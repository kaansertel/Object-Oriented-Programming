package soru6;

/*
 * Bir dersin toplam mevcudu 30 dur. Tüm öðrenciler bir biri arasýnda verilen ödevin cevaplarýný paylaþabilmektedir. 
 * Bu þekilde bir kopya çekildiðinde ayný kiþiden kopya çeken öðrencilerin ödevlerinde ayný hata mevcuttur. 
 * Bu hata sayýsal bir rakama karþýlýk gelmektedir. Bu düzende öðrenciler rastgele birbirlerinden kopya çeksinler. 
 * Örneðin Ahmet Mehmet’ten, Özge Mert’ten, Mert’te Ahmet’ten, Can ise Hakan’dan kopya çekin. Bu þekilde 30 öðrencinin yarýsýnýn (15) rastgele baþka bir kiþiden kopya çekitiðini düþünün. 
 * En çok kopya çekilen öðrenciyi bulan programý yazýnýz. 
 */

public class Soru6 {
	String adSoyad = "Kaan Sertel";

	public static void main(String[] args) {
		String[] ogrenciIsim = new String[30];
		int[] ogrenciSayisi = new int[30];
		int[] kopyaCekenOgrenciler = new int[15]; 
		isimYerlestir(ogrenciIsim);
		ogrenciYerlestir(ogrenciSayisi);
		rastGeleSayiYerlestir(kopyaCekenOgrenciler);
		System.out.println("Kopye ceken ogrenciler: ");
		System.out.print("           ");
		for (int x = 0; x < kopyaCekenOgrenciler.length; x++) {
			int sayi = kopyaCekenOgrenciler[x];
			System.out.printf("%2s   ", ogrenciIsim[sayi]);

		}
		System.out.println();

		kopyaCek(ogrenciSayisi, kopyaCekenOgrenciler);
		System.out.print("KopyaKod: ");

		for (int i = 0; i < kopyaCekenOgrenciler.length; i++) {
			System.out.printf("%3d     ", kopyaCekenOgrenciler[i]);
		}
		System.out.println();
		int indeks = enCokKopyaCekilenOgrenci(kopyaCekenOgrenciler);
		System.out.print("En cok kopya cekilen ogrenci: ");
		System.out.println(ogrenciIsim[indeks] + "!!! Hata Kodu: " + indeks);

	}

	public static void isimYerlestir(String[] ogrenciIsim) {
		ogrenciIsim[0] = "Ali";
		ogrenciIsim[1] = "Mehmet";
		ogrenciIsim[2] = "Ayse";
		ogrenciIsim[3] = "Duygu";
		ogrenciIsim[4] = "Ece";
		ogrenciIsim[5] = "Kaan";
		ogrenciIsim[6] = "Sena";
		ogrenciIsim[7] = "Orkun";
		ogrenciIsim[8] = "Burak";
		ogrenciIsim[9] = "Ozge";
		ogrenciIsim[10] = "Fatma";
		ogrenciIsim[11] = "Kadir";
		ogrenciIsim[12] = "Yavuz";
		ogrenciIsim[13] = "Talha";
		ogrenciIsim[14] = "Kubilay";
		ogrenciIsim[15] = "Beyza";
		ogrenciIsim[16] = "Bilge";
		ogrenciIsim[17] = "Melisa";
		ogrenciIsim[18] = "Yasin";
		ogrenciIsim[19] = "Baris";
		ogrenciIsim[20] = "Atakan";
		ogrenciIsim[21] = "Damla";
		ogrenciIsim[22] = "Semih";
		ogrenciIsim[23] = "Volkan";
		ogrenciIsim[24] = "Zekeriya";
		ogrenciIsim[25] = "Halil";
		ogrenciIsim[26] = "Fatih";
		ogrenciIsim[27] = "Efe";
		ogrenciIsim[28] = "Berke";
		ogrenciIsim[29] = "Nazmi";

	}

	public static int enCokKopyaCekilenOgrenci(int[] enCokKopyaCekilenOgrenci) {
		int sayi = 0;
		int tekrarSayisi = 0;
		int geciciTekrar = 1;

		for (int i = 0; i < enCokKopyaCekilenOgrenci.length; i++) {
			for (int j = i + 1; j < enCokKopyaCekilenOgrenci.length; j++) {
				if (enCokKopyaCekilenOgrenci[i] == enCokKopyaCekilenOgrenci[j]) {
					geciciTekrar++;
				}
				if (geciciTekrar > tekrarSayisi) {
					tekrarSayisi = geciciTekrar;
					sayi = enCokKopyaCekilenOgrenci[i];
				}
			}
			geciciTekrar = 1;
		}

		return sayi;

	}

	public static void kopyaCek(int[] ogrenciSayisi, int[] kopyaCekenOgrenciler) {
		for (int i = 0; i < kopyaCekenOgrenciler.length; i++) {
			int indis = (int) (Math.random() * 30);
			if (indis == kopyaCekenOgrenciler[i]) {
				indis = (int) (Math.random() * 30);
			}
			kopyaCekenOgrenciler[i] = ogrenciSayisi[indis];
		}

	}

	public static void rastGeleSayiYerlestir(int[] kopyaCekenOgrenciler) {
		int sayi;
		kopyaCekenOgrenciler[0] = 0;

		for (int i = 0; i < kopyaCekenOgrenciler.length; i++) {
			sayi = (int) (Math.random() * 30);
			for (int j = 0; j <= i; j++) {
				if (kopyaCekenOgrenciler[j] == sayi) {
					sayi = (int) (Math.random() * 30);
					j = 0;
				}

			}
			kopyaCekenOgrenciler[i] = sayi;

		}
		kopyaCekenOgrenciler[0] = 0;

	}

	public static void ogrenciYerlestir(int[] ogrenciSayisi) {
		for (int i = 0; i < ogrenciSayisi.length; i++) {
			ogrenciSayisi[i] = i;

		}

	}
}
