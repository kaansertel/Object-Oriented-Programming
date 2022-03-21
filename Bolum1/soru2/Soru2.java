package soru2;

public class Soru2 {
	String adSoyad = "Kaan Sertel";

	public static void main(String[] args) {
		/*
		 * For döngüsü kullanarak bir integer matrisinin elemanlarýný tek satýrlar için
		 * 1 çift sayýya karþýlýk gelen satýrlar için -1 yapan fonksiyonu yazýnýz. Bu
		 * matrisin tüm elemanlarýný (deðerleri) bulunduklarý satýr ve sütün ile
		 * birlikte ekrana yazan fonksiyonu yazýnýz.
		 */
		int[][] matris = new int[5][5];
		matrisHesapla(matris);

	}

	public static void matrisHesapla(int[][] matris) {
		for (int satir = 0; satir < matris.length; satir += 2) {
			for (int sutun = 0; sutun < matris[satir].length; sutun++) {
				matris[satir][sutun] = -1;
			}
		}
		for (int satir = 1; satir < matris.length; satir += 2) {
			for (int sutun = 0; sutun < matris[satir].length; sutun++) {
				matris[satir][sutun] = 1;
			}

		}
		for (int satir = 0; satir < matris.length; satir++) {
			for (int sutun = 0; sutun < matris[satir].length; sutun++) {
				System.out.printf("%2d ", matris[satir][sutun]);

			}
			System.out.println();
		}

	}
}
