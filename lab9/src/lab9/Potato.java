package lab9;

public class Potato extends Vegatables{
	private String type;
	
	public Potato(String type, String organic, String name, double price, int quantity) {
		super(organic, name, price, quantity);
		this.type = type;
	}
	
	public String displayInfo() {
		return super.displayInfo() + ", type: " + type;
	}

}
