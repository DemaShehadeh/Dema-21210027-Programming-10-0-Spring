package lab9;

public class Meat extends Product{
	private String type;
	
	public Meat(String type, String name, double price, int quantity) {
		super(name, price, quantity);
		this.type = type;
	}
	
	public String displayInfo() {
		return super.displayInfo() + ", type: " + type;
	}

}
