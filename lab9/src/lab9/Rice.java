package lab9;

public class Rice extends Product{
	private String type;
	private String brand;
	
	public Rice(String type, String brand, String name, double price, int quantity) {
		super(name, price, quantity);
		this.type = type;
		this.brand = brand;
	}
	
	public String displayInfo() {
		return super.displayInfo() +", type: " + type + ", brand: " + brand;
	}

}
