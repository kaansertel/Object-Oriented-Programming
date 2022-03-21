package soru5;

import java.util.Scanner;

public class Soru5 { 
	String adSoyad = "Kaan Sertel";

	/*
	 * Yukar�da bahsedilen otopark problemi (soru 4) i�in iki t�rde ara� mevcuttur.
	 * Birinci t�r ara� minib�s, ikinci t�r ara� otomobildir. Otoparkta belirli bir
	 * say�da minib�s i�in yer ayr�lm��t�r. Bu say� kullan�c� taraf�ndan
	 * belirlenecektir. Maksimum 20 ara�l�k bu otopark i�in belirli bir say�da
	 * minib�s yada otomobil parka geldi�i zaman olu�an dolu ve bo� yerlerin
	 * indislerini ekrana basan fonksiyonu yaz�n�z.
	 * 
	 * a) Bu otoparkta 5 minib�s i�in yer alm��t�r ve 3 minib�s ve 15 otomobil
	 * geldi�inde dolu ve bo� olan alanlar�n indislerini ekrana yaz�n�z.
	 * 
	 * a) Bu otoparkta 20 minib�s i�in yer alm��t�r ve 10 minib�s ve 2 otomobil
	 * geldi�inde dolu ve bo� olan alanlar�n indislerini ekrana yaz�n�z.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int minibusYeriSayisi = minibusYeriAl();
		Otoparkk otopark = new Otoparkk(4, 5, minibusYeriSayisi);

		int minibusSayisi = parkEdecekMinibusSayisi();
		int arabaSayisi = parkEdecekArabaSayisi();

		if ((minibusYeriSayisi < minibusSayisi) || (minibusSayisi > 20)) {
			System.out.println("Minibus say�s� otopark kapasitesinden fazladir.Lutfen yeni degerler giriniz.");
			System.exit(0);
		}

		Araba araba = new Araba(minibusSayisi, arabaSayisi);
		otopark.minibusSayisi = araba.minibusSayisi;
		otopark.arabaSayisi = araba.arabaSayisi;
		for (int i = 0; i < minibusYeriSayisi; i++) {
			otopark.minibusYeriAyarla();
		}
		System.out.println("Otopark�n guncel durumu: ");
		otopark.otoparkBosYer();
		for (int i = 0; i < arabaSayisi; i++) {
			otopark.arabaYerlestir();
		}
		for (int i = 0; i < minibusSayisi; i++) {
			otopark.minibusYerlestir();
		}
		System.out.println("Otopark�n Son durumu: ");
		otopark.otoparkBosYer();
	}

	public static int minibusYeriAl() {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lutfen park yeri ayrilacak minib�s sayisini giriniz: ");
		int minibusYeriSayisi = klavye.nextInt();
		return minibusYeriSayisi;
	}

	public static int parkEdecekMinibusSayisi() {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lutfen park edecek minibus sayisini giriniz: ");
		int minibusSayisi = klavye.nextInt();
		return minibusSayisi;
	}

	public static int parkEdecekArabaSayisi() {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lutfen park edecek otomobil sayisini giriniz: ");
		int arabaSayisi = klavye.nextInt();
		return arabaSayisi;
	}
}
