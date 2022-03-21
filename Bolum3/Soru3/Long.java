package Soru3;

public class Long extends Primitive{
	public long x;

	public Long(long x) {
		this.x = x;
	}

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}

}
