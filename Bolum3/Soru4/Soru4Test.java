package Soru4;

public class Soru4Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {
		Hexadecimal hexa1 = new Hexadecimal("A999");
		Hexadecimal hexa2 = new Hexadecimal("A888");
		
		
		hexa1.cikar(hexa2);
		hexa1.topla(hexa2);
		hexa1.topla(888);
		hexa1.cikar(9999);
		hexa1.ekranaBas();
		
		
	}

}
