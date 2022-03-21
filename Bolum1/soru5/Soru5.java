package soru5;

import java.util.Scanner;

public class Soru5 { 
	String adSoyad = "Kaan Sertel";

	/*
	 * Yukarýda bahsedilen otopark problemi (soru 4) için iki türde araç mevcuttur.
	 * Birinci tür araç minibüs, ikinci tür araç otomobildir. Otoparkta belirli bir
	 * sayýda minibüs için yer ayrýlmýþtýr. Bu sayý kullanýcý tarafýndan
	 * belirlenecektir. Maksimum 20 araçlýk bu otopark için belirli bir sayýda
	 * minibüs yada otomobil parka geldiði zaman oluþan dolu ve boþ yerlerin
	 * indislerini ekrana basan fonksiyonu yazýnýz.
	 * 
	 * a) Bu otoparkta 5 minibüs için yer almýþtýr ve 3 minibüs ve 15 otomobil
	 * geldiðinde dolu ve boþ olan alanlarýn indislerini ekrana yazýnýz.
	 * 
	 * a) Bu otoparkta 20 minibüs için yer almýþtýr ve 10 minibüs ve 2 otomobil
	 * geldiðinde dolu ve boþ olan alanlarýn indislerini ekrana yazýnýz.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int minibusYeriSayisi = minibusYeriAl();
		Otoparkk otopark = new Otoparkk(4, 5, minibusYeriSayisi);

		int minibusSayisi = parkEdecekMinibusSayisi();
		int arabaSayisi = parkEdecekArabaSayisi();

		if ((minibusYeriSayisi < minibusSayisi) || (minibusSayisi > 20)) {
			System.out.println("Minibus sayýsý otopark kapasitesinden fazladir.Lutfen yeni degerler giriniz.");
			System.exit(0);
		}

		Araba araba = new Araba(minibusSayisi, arabaSayisi);
		otopark.minibusSayisi = araba.minibusSayisi;
		otopark.arabaSayisi = araba.arabaSayisi;
		for (int i = 0; i < minibusYeriSayisi; i++) {
			otopark.minibusYeriAyarla();
		}
		System.out.println("Otoparkýn guncel durumu: ");
		otopark.otoparkBosYer();
		for (int i = 0; i < arabaSayisi; i++) {
			otopark.arabaYerlestir();
		}
		for (int i = 0; i < minibusSayisi; i++) {
			otopark.minibusYerlestir();
		}
		System.out.println("Otoparkýn Son durumu: ");
		otopark.otoparkBosYer();
	}

	public static int minibusYeriAl() {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lutfen park yeri ayrilacak minibüs sayisini giriniz: ");
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
