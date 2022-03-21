package soru3;

import java.util.ArrayList;
import java.util.Collections;

public class Soru3Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {
		ArrayList<Personel> personeller = new ArrayList<>();

		TemizlikPersoneli temizlikPersoneli1 = new TemizlikPersoneli("Mahmut", "Yildiz", "TemizlikPersoneli");
		TemizlikPersoneli temizlikPersoneli2 = new TemizlikPersoneli("Merve", "Demir", "TemizlikPersoneli");
		TemizlikPersoneli temizlikPersoneli3 = new TemizlikPersoneli("Ahmet", "Tas", "TemizlikPersoneli");
		TemizlikPersoneli temizlikPersoneli4 = new TemizlikPersoneli("Fatma", "Bulut", "TemizlikPersoneli");

		Hemsire hemsire1 = new Hemsire("Alara", "Durmaz", "Hemsire");
		Hemsire hemsire2 = new Hemsire("Burak", "Tas", "Hemsire");
		Hemsire hemsire3 = new Hemsire("Bilal", "Kefir", "Hemsire");
		Hemsire hemsire4 = new Hemsire("Nalan", "Kurt", "Hemsire");
		Hemsire hemsire5 = new Hemsire("Duygu", "Biber", "Hemsire");
		Hemsire hemsire6 = new Hemsire("Hasan", "Yilmaz", "Hemsire");
		Hemsire hemsire7 = new Hemsire("Mert", "Kaya", "Hemsire");
		Hemsire hemsire8 = new Hemsire("Ece", "Kurt", "Hemsire");
		Hemsire hemsire9 = new Hemsire("Sarp", "Durmaz", "Hemsire");
		Hemsire hemsire10 = new Hemsire("Fazilet", "Burcay", "Hemsire");
		Hemsire hemsire11 = new Hemsire("Ahmet", "Hanci", "Hemsire");
		Hemsire hemsire12 = new Hemsire("Dilara", "Yurt", "Hemsire");
		Hemsire hemsire13 = new Hemsire("Berke", "Tekin", "Hemsire");
		Hemsire hemsire14 = new Hemsire("Sude", "Pekin", "Hemsire");
		Hemsire hemsire15 = new Hemsire("Cagatay", "Ferit", "Hemsire");
		Hemsire hemsire16 = new Hemsire("Ferit", "Yilmaz", "Hemsire");
		Hemsire hemsire17 = new Hemsire("Beril", "Bulmaz", "Hemsire");
		Hemsire hemsire18 = new Hemsire("Talha", "Koc", "Hemsire");
		Hemsire hemsire19 = new Hemsire("Yagmur", "Sonmez", "Hemsire");
		Hemsire hemsire20 = new Hemsire("Nezir", "Durmaz", "Hemsire");

		Doktor doktor1 = new Doktor("Ali", "Vefa", "Doktor");
		Doktor doktor2 = new Doktor("Nazmi", "Mitko", "Doktor");
		Doktor doktor3 = new Doktor("Fatih", "Ernas", "Doktor");
		Doktor doktor4 = new Doktor("Efe", "Oren", "Doktor");
		Doktor doktor5 = new Doktor("Baris", "Incesoz", "Doktor");
		Doktor doktor6 = new Doktor("Berke", "Sama", "Doktor");
		Doktor doktor7 = new Doktor("Kaan", "Sertel", "Doktor");
		Doktor doktor8 = new Doktor("Ceren", "Durmaz", "Doktor");
		Doktor doktor9 = new Doktor("Buse", "Kalay", "Doktor");
		Doktor doktor10 = new Doktor("Merve", "Tekin", "Doktor");

		Personel personel1 = new Personel("Mahmut", "Yildiz", "TemizlikPersoneli");
		Personel personel2 = new Personel("Merve", "Demir", "TemizlikPersoneli");
		Personel personel3 = new Personel("Ahmet", "Tas", "TemizlikPersoneli");
		Personel personel4 = new Personel("Fatma", "Bulut", "TemizlikPersoneli");
		Personel personel5 = new Personel("Alara", "Durmaz", "Hemsire");
		Personel personel6 = new Personel("Burak", "Tas", "Hemsire");
		Personel personel7 = new Personel("Bilal", "Kefir", "Hemsire");
		Personel personel8 = new Personel("Nalan", "Kurt", "Hemsire");
		Personel personel9 = new Personel("Duygu", "Biber", "Hemsire");
		Personel personel10 = new Personel("Hasan", "Yilmaz", "Hemsire");
		Personel personel11 = new Personel("Mert", "Kaya", "Hemsire");
		Personel personel12 = new Personel("Ece", "Kurt", "Hemsire");
		Personel personel13 = new Personel("Sarp", "Durmaz", "Hemsire");
		Personel personel14 = new Personel("Fazilet", "Burcay", "Hemsire");
		Personel personel15 = new Personel("Ahmet", "Hanci", "Hemsire");
		Personel personel16 = new Personel("Dilara", "Yurt", "Hemsire");
		Personel personel17 = new Personel("Berke", "Tekin", "Hemsire");
		Personel personel18 = new Personel("Sude", "Pekin", "Hemsire");
		Personel personel19 = new Personel("Cagatay", "Ferit", "Hemsire");
		Personel personel20 = new Personel("Ferit", "Yilmaz", "Hemsire");
		Personel personel21 = new Personel("Beril", "Bulmaz", "Hemsire");
		Personel personel22 = new Personel("Talha", "Koc", "Hemsire");
		Personel personel23 = new Personel("Yagmur", "Sonmez", "Hemsire");
		Personel personel24 = new Personel("Nezir", "Durmaz", "Hemsire");
		Personel personel25 = new Personel("Ali", "Vefa", "Doktor");
		Personel personel26 = new Personel("Nazmi", "Mitko", "Doktor");
		Personel personel27 = new Personel("Fatih", "Ernas", "Doktor");
		Personel personel28 = new Personel("Efe", "Oren", "Doktor");
		Personel personel29 = new Personel("Baris", "Incesoz", "Doktor");
		Personel personel30 = new Personel("Berke", "Sama", "Doktor");
		Personel personel31 = new Personel("Kaan", "Sertel", "Doktor");
		Personel personel32 = new Personel("Ceren", "Durmaz", "Doktor");
		Personel personel33 = new Personel("Buse", "Kalay", "Doktor");
		Personel personel34 = new Personel("Merve", "Tekin", "Doktor");

		personeller.add(personel1);
		personeller.add(personel2);
		personeller.add(personel3);
		personeller.add(personel4);
		personeller.add(personel5);
		personeller.add(personel6);
		personeller.add(personel7);
		personeller.add(personel8);
		personeller.add(personel9);
		personeller.add(personel10);
		personeller.add(personel11);
		personeller.add(personel12);
		personeller.add(personel13);
		personeller.add(personel14);
		personeller.add(personel15);
		personeller.add(personel16);
		personeller.add(personel17);
		personeller.add(personel18);
		personeller.add(personel19);
		personeller.add(personel20);
		personeller.add(personel21);
		personeller.add(personel22);
		personeller.add(personel23);
		personeller.add(personel24);
		personeller.add(personel25);
		personeller.add(personel26);
		personeller.add(personel27);
		personeller.add(personel28);
		personeller.add(personel29);
		personeller.add(personel30);
		personeller.add(personel31);
		personeller.add(personel32);
		personeller.add(personel33);
		personeller.add(personel34);

		// a) Bu personellerin adýný ve soyadýný ekrana yazan programý yazýnýz.
		System.out.println("A) icin ");
		personel1.bilgiYazdir();
		System.out.println("----------------------");
		// b) Bu personellerin adýný, soyadýný ve kadrosunu (temizlik, hemþire veya
		// doktor) bir önceki fonksiyonu override ederek (miras üzerine yazarak)
		// uygulayýnýz.
		System.out.println("B) icin ");
		System.out.println("----------------------");
		temizlikPersoneli1.bilgiYazdir();
		System.out.println("----------------------");
		hemsire1.bilgiYazdir();
		System.out.println("----------------------");
		doktor1.bilgiYazdir();
		System.out.println("----------------------");
		// c) Bu personellerin adýný, soyadýný ve kadrosunu override iþlemi yapmadan
		// Personel sýnýfý içerinde yazan programý yazýnýz.
		System.out.println("C) icin");
		personel23.tumBilgileriYazdir();
		System.out.println("----------------------");
		// d) Bu personelleri ad ve soyada göre sýralayan programý yazýnýz. Bu programda
		// sýralama yapmak için aþaðýdaki static fonksiyonu yazýnýz.
		System.out.println("D) icin");
		sirala(personeller);
	}

	public static void sirala(ArrayList<Personel> personeller) {
		ArrayList<Personel> personeller1 = new ArrayList<>();
		personeller1 = personeller;

		Collections.sort(personeller1);
		for (int i = 0; i <personeller1.size(); i++) {
			System.out.print("Isim: " + personeller1.get(i).getIsim());
			System.out.print(" - Soyisim: " + personeller1.get(i).getSoyisim());
			System.out.println(" ");
		}

	}

}
