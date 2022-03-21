package soru4;

import java.util.Scanner;

public class Soru4 {
	String adSoyad = "Kaan Sertel";
	/*
	 * Bir otoparkta dolu ve bo� yerler mevcuttur. Bir ara� geldi�inde otoparktaki
	 * rastgele bo� olan alana park edecek �ekilde bir Otopark ve Araba nesnesi
	 * etkile�imi yaz�n�z. Bu otoparka maksimum 20 adet ara� park edebilir.
	 * 
	 * a) Bu otopark nesnesi i�in 5 ara� parka geldikten sonra bo� ve dolu yerlerin
	 * indislerini ekrana basan fonksiyonu ekleyiniz.
	 * 
	 * b) Bu otopark nesnesi i�in 3 ara� parka geldikten sonra bo� ve dolu yerlerin
	 * indislerini ekrana basan fonksiyonu ekleyiniz.
	 * 
	 * c) Bu otopark nesnesi i�in 25 ara� parka geldikten sonra bo� ve dolu yerlerin
	 * indislerini ekrana basan fonksiyonu ekleyiniz
	 * 
	 */

	public static void main(String[] args) {
		int gelenArac = 0;
		Scanner klavye = new Scanner(System.in);
		Otopark otopark = new Otopark(4, 5);
		System.out.println("Otopark�n guncel durumu: ");
		otopark.otoparkBosYer();
		System.out.print("Otoparka kac tane arac geldi: ");
		gelenArac = klavye.nextInt();
		Araba araba = new Araba(gelenArac);

		for (int i = 0; i < gelenArac; i++) {
			otopark.arabaYerlestir();
		}
		otopark.otoparkBosYer();

	}
}
