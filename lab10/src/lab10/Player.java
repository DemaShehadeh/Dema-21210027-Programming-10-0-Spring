package lab10;

public class Player extends Human{
	private static String place;
	
	public Player(String place, String gender, String ID) {
		super(gender, ID);
		Player.place = place;
	}
	
	public static void moveRight() {
		place = "right";
		System.out.println("Player moved to the right.");
	}
	
	public static void moveLeft() {
		place = "left";
		System.out.println("Player moved to the left.");
	}
	
	public static void collectCoin(Coin coin) {
        if (coin.setPlace()==place) {
            System.out.println("Player collected the coin");
            Coin.addCoinToArray(coin);
        } else {
            System.out.println("Player missed the coin");
        }
    }
	
	//override
	public void run() {
		System.out.println("Player is running.");
	}

}
