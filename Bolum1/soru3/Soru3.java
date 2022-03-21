package soru3;

import java.util.Scanner;

public class Soru3 {
	String adSoyad = "Kaan Sertel";

	public static void main(String[] args) {
		/*
		 * Ýki rasyonel sayýyý üzerinde çýkarma, çarpma, ve bölme yapan programý
		 * yazýnýz. Bir rasyonel sayý pay ve paydan oluþmaktadýr. Örneðin ½ için pay 1
		 * ve payda 2 olur.
		 */
		int[] paylar = new int[2];
		int[] paydalar = new int[2];

		rasyonelToplama(paylar, paydalar);
		rasyonelCikarma(paylar, paydalar);
		rasyonelCarpma(paylar, paydalar);
		rasyonelBolme(paylar, paydalar);

	}

	public static void rasyonelToplama(int[] paylar, int[] paydalar) {
		paylar[0] = 1;
		paydalar[0] = 2;
		paylar[1] = 4;
		paydalar[1] = 2;
		int index1 = 0;
		int index2 = 1;
		int paySonuc = paylar[index1] * paydalar[index2] + paylar[index2] * paydalar[index1];
		int paydaSonuc = paydalar[index1] * paydalar[index2];
		double toplama = (paySonuc + 0.0) / paydaSonuc;
		System.out.println("Toplama isleminin cevabi: " + paylar[0] + "/" + paydalar[0] + " + " + paylar[1] + "/"
				+ paydalar[1] + " = " + paySonuc + "/" + paydaSonuc + " = " + toplama);

	}

	public static void rasyonelCikarma(int[] paylar, int[] paydalar) {
		paylar[0] = 7;
		paydalar[0] = 4;
		paylar[1] = 5;
		paydalar[1] = 6;
		int index1 = 0;
		int index2 = 1;
		int paySonuc = paylar[index1] * paydalar[index2] - paylar[index2] * paydalar[index1];
		int paydaSonuc = paydalar[index1] * paydalar[index2];
		double cikarma = (paySonuc + 0.0) / paydaSonuc;
		System.out.println("Cikarma isleminin cevabi: " + paylar[0] + "/" + paydalar[0] + " - " + paylar[1] + "/"
				+ paydalar[1] + " = " + paySonuc + "/" + paydaSonuc + " = " + cikarma);
	}

	public static void rasyonelCarpma(int[] paylar, int[] paydalar) {
		Scanner klavye = new Scanner(System.in);
		paylar[0] = 5;
		paylar[1] = 4;
		int i = 0;
		System.out.println("Lutfen (5/x) * (4/x) islemi icin x degerini giriniz (0 haric): ");
		paydalar[i] = paydalar[i + 1] = klavye.nextInt();
		int index1 = 0;
		int index2 = 1;
		int paySonuc = paylar[index1] * paylar[index2];
		int paydaSonuc = paydalar[index1] * paydalar[index2];
		double carpma = (paySonuc + 0.0) / paydaSonuc;
		System.out.println("Carpma isleminin cevabi: " + "(" + paylar[0] + "/" + paydalar[0] + ")" + " * " + "("
				+ paylar[1] + "/" + paydalar[1] + ")" + " = " + paySonuc + "/" + paydaSonuc + " = " + carpma);

	}

	public static void rasyonelBolme(int[] paylar, int[] paydalar) {
		Scanner klavye = new Scanner(System.in);
		paylar[0] = 5;
		paylar[1] = 4;
		int i = 0;
		System.out.println("Lutfen (5/x) / (4/x) islemi icin x degerini giriniz (0 haric): ");
		paydalar[i] = paydalar[i + 1] = klavye.nextInt();
		int index1 = 0;
		int index2 = 1;
		int paySonuc = paylar[index1] * paydalar[index2];
		int paydaSonuc = paylar[index2] * paydalar[index1];
		double bolme = (paySonuc + 0.0) / paydaSonuc;
		System.out.println("Bolme isleminin cevabi: " + "(" + paylar[0] + "/" + paydalar[0] + ")" + " / " + "("
				+ paylar[1] + "/" + paydalar[1] + ")" + " = " + paySonuc + "/" + paydaSonuc + " = " + bolme);

	}
}
