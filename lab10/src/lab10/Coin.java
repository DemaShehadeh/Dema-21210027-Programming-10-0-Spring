package lab10;

import java.util.ArrayList;

public class Coin extends Collectables{
	public static ArrayList<Integer> arrayOfCoins = new ArrayList<Integer>();
	private static String place;


	public Coin(String place) {
		this.place = place;
	}

	public static void addCoinToArray(Coin coin) {
		arrayOfCoins.add(20);
	}

	public static String setPlace() {
		System.out.println("The place of the coin: "+ place);
		if(place == "right") {
			Player.moveRight();
		}else if(place == "left") {
			Player.moveLeft();
		}
		return place;
	}
}
