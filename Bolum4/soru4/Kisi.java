package soru4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kisi {
	private String adSoyad;
	private String yer;
	private int yil;

	ArrayList<Kisi> kisiListesi = new ArrayList<Kisi>();

	public Kisi() {
	}

	public Kisi(String adSoyad, String yer, int yil) {
		this.adSoyad = adSoyad;
		this.yer = yer;
		this.yil = yil;
	}

	public void goster() {
		for (int i = 0; i < kisiListesi.size(); i++) {
			System.out.print("Isim: " + kisiListesi.get(i).getAdSoyad());
			System.out.print(" - Yer: " + kisiListesi.get(i).getYer());
			System.out.print(" - Yil: " + kisiListesi.get(i).getYil());
			System.out.println(" ");
		}
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getYer() {
		return yer;
	}

	public void setYer(String yer) {
		this.yer = yer;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

}
