package soru2;

public class Soru2 {
	String adSoyad = "Kaan Sertel";

	public static void main(String[] args) {
		/*
		 * For d�ng�s� kullanarak bir integer matrisinin elemanlar�n� tek sat�rlar i�in
		 * 1 �ift say�ya kar��l�k gelen sat�rlar i�in -1 yapan fonksiyonu yaz�n�z. Bu
		 * matrisin t�m elemanlar�n� (de�erleri) bulunduklar� sat�r ve s�t�n ile
		 * birlikte ekrana yazan fonksiyonu yaz�n�z.
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
