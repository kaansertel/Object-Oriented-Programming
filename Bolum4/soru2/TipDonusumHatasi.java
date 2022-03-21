package soru2;

public class TipDonusumHatasi {

	public void donusturTest(String deger1) {
		try {
			donusum(deger1);

		} 
		catch (NumberFormatException e) {
			try {
				long sayi = Long.valueOf(deger1);
				if (sayi > 2147483647) {
					System.out.println("Donusturulmek istenen sayi cok buyuk - (Buyuk Sayi Hatasi)");
				}

			} catch (NumberFormatException ne) {
				System.out.println("Donusturulmek istenen sayi aslinda floating point sayisi - (Kayan Nokta Hatasi) ");
			}
		}

	}

	private void donusum(String deger1) {
		Integer.valueOf(deger1);
	}

}
