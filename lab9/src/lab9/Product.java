package lab9;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String displayInfo() {
		return "name: " + name  + ", price: " + price  + ", quantity: " + quantity;
	}

	

}
