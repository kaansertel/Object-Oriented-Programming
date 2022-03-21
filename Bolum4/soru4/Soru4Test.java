package soru4;

import java.util.Collections;

public class Soru4Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {
		KisiListesi liste = new KisiListesi();
		liste.kisiEkle("Ahmet", "Ankara", 1980);
		liste.kisiEkle("Ahu", "Konya", 1992);
		liste.kisiEkle("Yusuf", "Ankara", 1977);
		liste.kisiEkle("Ece", "Bursa", 1998);
		liste.kisiEkle("Tarkan", "Bursa", 1968);
		liste.sirala();
		liste.kisiEkle("YER"); // Degiskene gore siralama, method ismi degisebilir, kisi eklenmedigi icin 
		liste.kisiEkle("YIL");
		liste.kisiEkle("YERYIL");
		liste.kisiEkle("Ahmet", "Istanbul", 1958, "YIL");

	}
}
