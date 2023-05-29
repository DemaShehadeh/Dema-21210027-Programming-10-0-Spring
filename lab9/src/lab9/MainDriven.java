package lab9;

public class MainDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meat m1 = new Meat("Red Meat", "Meat", 10, 1);
		System.out.println(m1.displayInfo());
		Rice r1 = new Rice("long Rice", "Basmati", "Rice", 6.5, 1);
		System.out.println(r1.displayInfo());
		
		Tomato t1 = new Tomato("Red", "organic", "Tomato", 2.4, 4);
		System.out.println(t1.displayInfo());
		Potato p1 = new Potato("Yello Potato", "organic", "Potato", 3.2, 3);
		System.out.println(p1.displayInfo());
		Eggplant e1 = new Eggplant("big", "organic", "Eggplant", 2.4, 3);
		System.out.println(e1.displayInfo());
	

	}

}
