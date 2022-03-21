package Soru3;

public class Float extends Primitive {
	public float x;

	public Float(float x) {
		this.x = x;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}
	
	
}
