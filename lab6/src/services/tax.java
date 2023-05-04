package services;

public class tax {
	//constructor
	public tax(double salary) {
		this.salary = salary;
	}
	
	//attributes
	double salary;
	
	//method
	public double calculateTax(double salary) {
		double tax = 0.20 * salary;
		return tax;
	}
}
