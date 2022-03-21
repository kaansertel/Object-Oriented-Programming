package Soru3;

public class Double extends Primitive {
	public double x;

	public Double(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}

}
