package Soru3;

public class Soru3Test {
	String adSoyad = "Kaan Sertel";
	public static void main(String[] args) {

		Integer integerObject = new Integer(2);
		System.out.print("Integer: ");
		integerObject.Yaz();

		Boolean booleanObject = new Boolean(true);
		System.out.print("Boolean: ");
		booleanObject.Yaz();

		Character characterObject = new Character('a');
		System.out.print("Character: ");
		characterObject.Yaz();

		Byte byteObject = new Byte((byte) 33); 
		System.out.print("Byte: ");
		byteObject.Yaz();

		Short shortObject = new Short((short) 65); 
		System.out.print("Short: ");
		shortObject.Yaz();

		Float floatObject = new Float(7);
		System.out.print("Float: ");
		floatObject.Yaz();

		Double doubleObject = new Double(9.9);
		System.out.print("Double: ");
		doubleObject.Yaz();

		Long longObject = new Long(10);
		System.out.print("Long: ");
		longObject.Yaz();

	}

}
