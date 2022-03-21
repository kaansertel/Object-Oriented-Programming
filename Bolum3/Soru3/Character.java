package Soru3;

public class Character extends Primitive {
	public char x;

	public Character(char x) {
		this.x = x;
	}

	public char getX() {
		return x;
	}

	public void setX(char x) {
		this.x = x;
	}

	@Override
	public void Yaz() {
		super.Yaz(x);
	}

}
