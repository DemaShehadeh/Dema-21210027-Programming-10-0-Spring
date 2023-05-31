package lab10;

public class StartGame extends GameSystem{
	public static void start() {
		Player player = new Player("left", "boy", "p1");
		player.run();
		
		Guard guard = new Guard("boy", "g1");
		guard.run(); 
		
		Train train1 = new Train("t1", false);
		train1.setMovingState(false);
		Train train2 = new Train("t2", true);
		train2.setMovingState(true);
	
		
		Coin coin1 = new Coin("left");
		Player.collectCoin(coin1);
		
		Coin coin2= new Coin("right");
		Player.collectCoin(coin2);
		
	}

}
