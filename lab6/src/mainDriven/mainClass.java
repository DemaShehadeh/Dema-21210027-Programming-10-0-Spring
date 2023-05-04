package mainDriven;

import employees.*;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager();
	    Manager m2= new Manager("Dema", 3, 1009.34, "M09282736"); //ID M-manager
	    
	    Staff s1 = new Staff();
	    Staff s2 = new Staff("leena", 5, 600.50, "E980084838", "IT Deaparment"); //ID E-employee
	    
	    Trainer t1 = new Trainer();
	    Trainer t2 = new Trainer("Hashem", 150);
	    
	    
	}

}
