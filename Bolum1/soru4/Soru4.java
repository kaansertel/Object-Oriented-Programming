package soru4;

import java.util.Scanner;

public class Soru4 {
	String adSoyad = "Kaan Sertel";
	/*
	 * Bir otoparkta dolu ve boþ yerler mevcuttur. Bir araç geldiðinde otoparktaki
	 * rastgele boþ olan alana park edecek þekilde bir Otopark ve Araba nesnesi
	 * etkileþimi yazýnýz. Bu otoparka maksimum 20 adet araç park edebilir.
	 * 
	 * a) Bu otopark nesnesi için 5 araç parka geldikten sonra boþ ve dolu yerlerin
	 * indislerini ekrana basan fonksiyonu ekleyiniz.
	 * 
	 * b) Bu otopark nesnesi için 3 araç parka geldikten sonra boþ ve dolu yerlerin
	 * indislerini ekrana basan fonksiyonu ekleyiniz.
	 * 
	 * c) Bu otopark nesnesi için 25 araç parka geldikten sonra boþ ve dolu yerlerin
	 * indislerini ekrana basan fonksiyonu ekleyiniz
	 * 
	 */

	public static void main(String[] args) {
		int gelenArac = 0;
		Scanner klavye = new Scanner(System.in);
		Otopark otopark = new Otopark(4, 5);
		System.out.println("Otoparkýn guncel durumu: ");
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
