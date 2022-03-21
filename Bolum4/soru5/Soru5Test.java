package soru5;

import java.util.Scanner;

public class Soru5Test {
	String adSoyad = "Kaan Sertel";
	static boolean i = true;

	public static void main(String[] args) {
		// Cok hizli calistigi icin (q veya Q) + enter islemi hizli yapilip spamlanmali

		Thread t1 = new Thread() {
			public void run() {
				while (i) {
					int x = (int) (Math.random() * 10000);
					System.out.println(x);

				}

			}
		};
		Thread t2 = new Thread() {
			public void run() {
				while (i) {
					Scanner input = new Scanner(System.in);
					char x = input.next().charAt(0);
					int y = (int) x;

					if (y == 81 || y == 113) { // Q = 81 , q = 113 (ASCII degeri)
						i = false; // ya da yerine System.exit(0); yapilabilir

					}

				}
			}
		};
		t2.start();
		t1.start();

	}
}
