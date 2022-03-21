package soru5;

public class Otoparkk {
	private int[][] bosYer = null;
	private int satir;
	private int sutun;
	public int minibusYeriSayisi;
	public int arabaSayisi;
	public int minibusSayisi;
	private int sayac = 0;
	public int i = 1;

	public int minibusYeriAyarla() {

		int satir = (int) (Math.random() * 4);
		int sutun = (int) (Math.random() * 5);
		if (bosYer[satir][sutun] == 0) {
			return bosYer[satir][sutun] = 2;
		} else if ((bosYer[satir][sutun] == 2) && (yerBul() != 0)) {
			return minibusYeriAyarla();
		} else {
			return 0;
		}

	}

	public int arabaYerlestir() {
		int satir = (int) (Math.random() * 4);
		int sutun = (int) (Math.random() * 5);
		if (bosYer[satir][sutun] == 0) {
			return bosYer[satir][sutun] = 1;
		} else if (((bosYer[satir][sutun] == 1) || (bosYer[satir][sutun] == 2)) && (yerBul() != 0)) {
			return arabaYerlestir();
		} else {
			System.out.println(i + ".otomobil icin park yeri yok.");
			i++;
			return 1;
		}
 
	}

	int minibusYerlestir() {
		int satir = (int) (Math.random() * 4);
		int sutun = (int) (Math.random() * 5);
		if (bosYer[satir][sutun] == 2) {
			return bosYer[satir][sutun] = 3;
		} else if (((bosYer[satir][sutun] == 1) || (bosYer[satir][sutun] == 0)) || (bosYer[satir][sutun] == 3)) {
			return minibusYerlestir();
		} else {
			System.out.println("Yer yok");
			return 1;
		}

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

	public void otoparkBosYer() {
		System.out.println("-------------------------");
		for (int satir = 0; satir < bosYer.length; satir++) {
			for (int sutun = 0; sutun < bosYer[satir].length; sutun++) {
				if (bosYer[satir][sutun] == 0) {
					System.out.print(" Bos  (A) ");
				} else if (bosYer[satir][sutun] == 2) {
					System.out.print(" Bos  (M) ");
				} else if (bosYer[satir][sutun] == 3) {
					System.out.print(" Dolu (M) ");
				} else {
					System.out.print(" Dolu (A) ");
				}

			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public Otoparkk(int satir, int sutun, int minibusYeriSayisi) {
		bosYer = new int[satir][sutun];
		this.satir = satir;
		this.sutun = sutun;
		this.minibusYeriSayisi = minibusYeriSayisi;
	}

}

class Araba {
	private String[] tur = { "otomobil", "minibus" };
	public int minibusSayisi;
	public int arabaSayisi;

	public Araba(int minibusSayisi, int arabaSayisi) {
		this.minibusSayisi = minibusSayisi;
		this.arabaSayisi = arabaSayisi;
	}

}
