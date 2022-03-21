package soru1;

import java.util.ArrayList;

public class HayvanatBahcesi implements Hayvan {
	public int x;
	public int y;
	public int z;
	ArrayList<Hayvan> hayvanlar = new ArrayList<>();

	@Override
	public void sesCikar() {
		Kus kus = new Kus();
		kus.sesCikar();

		Koala koala = new Koala();
		koala.sesCikar();

		Zebra zebra = new Zebra();
		zebra.sesCikar();
	}

	public HayvanatBahcesi(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		for (int i = 0; i < x; i++) {
			Kus kus = new Kus();
			hayvanlar.add(kus);
		}
		for (int i = 0; i < y; i++) {
			Koala koala = new Koala();
			hayvanlar.add(koala);
		}
		for (int i = 0; i < z; i++) {
			Zebra zebra = new Zebra();
			hayvanlar.add(zebra);
		}
	}

}

class Kus implements Hayvan {

	@Override
	public void sesCikar() {
		System.out.println("Kus sesi: Cik cik");
	}

}

class Zebra implements Hayvan {

	@Override
	public void sesCikar() {
		System.out.println("Zebra sesi: Whooa Whooa");
	}

}

class Koala implements Hayvan {

	@Override
	public void sesCikar() {
		System.out.println("Koala sesi: Woag Woag");
	}

}