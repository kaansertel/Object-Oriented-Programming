package Soru3;

public class Boolean extends Primitive {
	public boolean x;

	public Boolean(boolean x) {
		this.x = x;
	}

	public boolean isX() {
		return x;
	}

	public void setX(boolean x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}

}
