package soru1;

import java.util.Scanner;

public class Soru1Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lutfen kus sayisini giriniz: ");
		int x = klavye.nextInt();
		System.out.print("Lutfen koala sayisini giriniz: ");
		int y = klavye.nextInt();
		System.out.print("Lutfen zebra sayisini giriniz: ");
		int z = klavye.nextInt();

		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi(x, y, z);
		Kus kus = new Kus();
		System.out.println("B þýkký için");
		kus.sesCikar();
		System.out.println("--------------------------");
		hayvanatBahcesi.sesCikar();
	}

}
