package lab10;

public class Guard extends Human{
	public Guard(String gender, String ID) {
		super(gender, ID);
	}
	
	//override
	public void run() {
		System.out.println("Guard is running.");
	}

}
