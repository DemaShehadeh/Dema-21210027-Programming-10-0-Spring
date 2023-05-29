package lab9;

public class Tomato extends Vegatables{
	private String color;
	
	public Tomato(String color, String organic, String name, double price, int quantity) {
		super(organic, name, price, quantity);
		this.color = color;
	}
	
	public String displayInfo() {
		return super.displayInfo() + ", type: " + color;
	}

}
