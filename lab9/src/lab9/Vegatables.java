package lab9;

public class Vegatables extends Product{
	private String organic;
	
	public Vegatables(String organic, String name, double price, int quantity) {
		super(name, price, quantity);
		this.organic = organic;
	}
	
	public String displayInfo() {
		return super.displayInfo()+", organic: "+organic;
	}

}
