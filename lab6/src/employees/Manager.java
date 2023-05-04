package employees;

public class Manager {
	//parametarized constructor
	public Manager(String name, int experienceYear, double baseSalary, String emp_id){
		this.name = name;
		this.experienceYear = experienceYear;
		this.baseSalary = baseSalary;
		this.emp_id = emp_id;
	}
	
	//non-parametrized constructor
	public Manager(){
		
	}
	
	//attributes
	String name;
	int experienceYear;
	double baseSalary;
	String emp_id;
	
}
