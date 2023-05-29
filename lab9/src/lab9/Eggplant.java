package lab9;

public class Eggplant extends Vegatables{
	private String size;
	
	public Eggplant(String size, String organic, String name, double price, int quantity) {
		super(organic,name,price,quantity);
		this.size = size;
	}
	
	public String displayInfo() {
		return super.displayInfo()+ ", size: "+ size;
	}

}
