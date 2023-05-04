package services;

public class Revenue {
	//constructor
	public Revenue(int trainingHours) {
		this.trainingHours = trainingHours;
	}
	
	//attributes
	int trainingHours;
	
	//method
	public double calculateRevenue(int trainingHours) {
		int price = 5 * trainingHours;
		return price;
	}
}
