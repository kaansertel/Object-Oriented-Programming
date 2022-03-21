package soru4;

public class Otopark {
	private int[][] bosYer = null;
	private int satir;
	private int sutun;
	private int sayac = 0;
	public int i = 1;

	public Otopark(int satir, int sutun) {
		bosYer = new int[satir][sutun];
		this.satir = satir;
		this.sutun = sutun;
	}

	public void otoparkBosYer() {
		System.out.println("-------------------------");
		for (int satir = 0; satir < bosYer.length; satir++) {
			for (int sutun = 0; sutun < bosYer[satir].length; sutun++) {
				if (bosYer[satir][sutun] == 0) {
					System.out.print("Bos ");
				} else {
					System.out.print("Dolu ");
				}

			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	int yerBul() {
		sayac = 0;
		for (int satir = 0; satir < bosYer.length; satir++) {
			for (int sutun = 0; sutun < bosYer[satir].length; sutun++) {
				if (bosYer[satir][sutun] == 0) {
					sayac++;
				}
			}
		}
		return sayac;

	}

	int arabaYerlestir() {
		int satir = (int) (Math.random() * 4);
		int sutun = (int) (Math.random() * 5);
		if (bosYer[satir][sutun] == 0) {
			return bosYer[satir][sutun] = 1;
		} else if ((bosYer[satir][sutun] == 1) && (yerBul() != 0)) {
			return arabaYerlestir();
		} else {
			System.out.println("20.aractan sonraki " + i + ". arac icin otoparkta bos yer kalmadi");
			i++;
			return 1;
		}

	}

}

class Araba {
	private String[] tur = { "otomobil" };
	private int arabaSayisi;

	public Araba(int arabaSayisi) {
		this.arabaSayisi = arabaSayisi;
	}

	public Araba(String[] tur) {
		this.tur = tur;
	}

	public String[] getTur() {
		return tur;
	}

	public void setTur(String[] tur) {
		this.tur = tur;
	}

	public int getArabaSayisi() {
		return arabaSayisi;
	}

	public void setArabaSayisi(int arabaSayisi) {
		this.arabaSayisi = arabaSayisi;
	}

}
