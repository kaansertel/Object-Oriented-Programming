package soru2;

public class Soru2Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {
		TipDonusumHatasi tipHatalari = new TipDonusumHatasi();
		String deger1 = "10000";
		String deger2 = "10000.0";
		String deger3 = "10000000000000000";
		
		
			tipHatalari.donusturTest(deger1);
			tipHatalari.donusturTest(deger2);
			tipHatalari.donusturTest(deger3);
			
		
		
	}

}
