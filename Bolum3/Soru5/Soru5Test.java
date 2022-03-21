package Soru5;

import java.util.Scanner;

public class Soru5Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {

		System.out.print("Lutfen oynanacak tur sayisini giriniz: ");
		Scanner klavye = new Scanner(System.in);
		int turSayisi = klavye.nextInt();
		Kisi kisi1 = new Kisi(30, turSayisi);
	}

}
