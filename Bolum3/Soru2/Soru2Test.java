package Soru2;

public class Soru2Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {

		Hesap hesap1 = new Hesap("Altan", "Ernas", 0, "CDD", "ABB");
		Hesap hesap2 = new Hesap("Can", "Durgun", 1, "ABB", "CDD");
		Hesap hesap3 = new Hesap("Uzay", "Kaya", 2, "CDD", "ABB");

		tumHesapBilgisiYazdir(hesap1, hesap2, hesap3);

	}

	public static void tumHesapBilgisiYazdir(Hesap hesap1, Hesap hesap2, Hesap hesap3) {
		hesap1.bilgiYazdir();
		System.out.println();
		hesap2.bilgiYazdir();
		System.out.println();
		hesap3.bilgiYazdir();
		System.out.println();
	}
}
