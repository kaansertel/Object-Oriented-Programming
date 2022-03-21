package Soru3;

public class Byte extends Primitive {
	public byte x;

	public Byte(byte x) {
		this.x = x;
	}

	public byte getX() {
		return x;
	}

	public void setX(byte x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}

}
