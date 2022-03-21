package Soru3;

public class Short extends Primitive {
	public short x;

	public Short(short x) {
		super();
		this.x = x;
	}

	public short getX() {
		return x;
	}

	public void setX(short x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}

}
