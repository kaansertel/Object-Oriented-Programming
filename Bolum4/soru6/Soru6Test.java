package soru6;

import java.util.Scanner;

public class Soru6Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {
		System.out.print("Lutfen oynanacak tur sayisini giriniz: ");
		Scanner klavye = new Scanner(System.in);
		int turSayisi = klavye.nextInt();
		Hareket hareket = new Hareket();
		String tas = hareket.getHareket1();
		String kagit = hareket.getHareket2();
		String makas = hareket.getHareket3();

		Kisi kisiler = new Kisi(tas, kagit, makas, turSayisi);
	}
}
