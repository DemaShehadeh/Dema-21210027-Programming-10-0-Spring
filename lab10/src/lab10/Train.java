package lab10;

public class Train {
	private static String ID;
	private boolean movingState;
	
	public Train(String ID, boolean movingState) {
		Train.ID = ID;
		this.movingState = movingState;
	}
	
	public static void transport(){
		System.out.println("Train "+ ID + " is moving.");
	}
	
	public static void rigid() {
			System.out.println("Train "+ ID + " is rigid.");
	}
	
	public static void setMovingState(boolean movingState) {
		if(movingState == true) {
			transport();
		}else
			rigid();
	}

}
