package employees;

public class Staff {
	//parametrized constructor
	public Staff(String name, int experienceYear, double baseSalary, String emp_id, String Deparment){
		this.name = name;
		this.experienceYear = experienceYear;
		this.baseSalary = baseSalary;
		this.emp_id = emp_id;
	}
	
	//non-parametrized constructor
	public Staff(){
		
	}
	
	//attributes
	String name;
	int experienceYear;
	double baseSalary;
	String emp_id;
	String Deparment;
	
	//methods
}
