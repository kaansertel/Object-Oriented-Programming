package soru1;

public class Soru1 {
	String adSoyad = "Kaan Sertel";

	public static void main(String[] args) {

		// 1) For d�ng�s� kullanarak
		// a) bir String dizinin t�m elemanlar�n� ekrana yaz�n�z.

		String[] isim = new String[] { "Ahmet", "Mehmet", "Ali", "Ay�e", "Fatma", "Ece", "Kaan" };
		diziyiYazdir(isim);

		System.out.println("\n--------------------------------------");

		// b) bir double matrisinin elemanlar�n� ekrana yaz�n�z.

		double[][] matris = { { 1.0, 2.3 }, { 4.5, 5.1 } };
		matrisYazdir(matris);

		System.out.println("--------------------------------------");

		// 2) While d�ng�s� kullanarak
		// a) bir String dizinin 5. eleman�na kadar olan de�erleri ekrana yaz�n�z

		besinciElemanaKadarYazd�r(isim);

		System.out.println("\n--------------------------------------");

		// b) bir double dizisinin ilk 4 eleman�n�n toplam�n� ekrana yaz�n�z

		double[] doubleDizi = new double[] { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		doubleToplam(doubleDizi);

	}

	public static void diziyiYazdir(String[] isim) {
		System.out.println("String dizinin t�m elemanlar�: ");
		for (int i = 0; i < isim.length; i++) {
			System.out.print(isim[i] + " ");
		}

	}

	public static void matrisYazdir(double[][] matris) {
		System.out.println("Double matrisinin elemanlar�: ");
		for (int satir = 0; satir < matris.length; satir++) {
			for (int sutun = 0; sutun < matris[satir].length; sutun++) {
				System.out.print(" " + matris[satir][sutun]);
			}
			System.out.println();
		}

	}

	public static void besinciElemanaKadarYazd�r(String[] isim) {
		System.out.println("String dizinin 5. eleman�na kadar olan de�erleri: ");
		int sayac = 0;
		while (sayac < 4) {
			System.out.print(isim[sayac] + " ");
			sayac++;

		}

	}

	public static void doubleToplam(double[] doubleDizi) {
		int sayac = 0;
		double toplam = 0.0;
		while (sayac < 4) {
			toplam += doubleDizi[sayac];
			sayac++;
		}
		System.out.println("Bir double dizisinin ilk 4 eleman�n�n toplam�:\n" + toplam);
	}
}
