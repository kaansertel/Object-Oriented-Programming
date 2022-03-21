package Soru3;

public class Integer extends Primitive {
	public int x;

	public Integer(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		
		super.Yaz(x);
	}

	
}
