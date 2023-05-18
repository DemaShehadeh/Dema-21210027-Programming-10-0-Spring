package mainDriven;

import searchAlgorithms.*;
import sortAlgorithms.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [] {10, 15, 5, 3, 2, 15, 20, 32, 1};
		linearSearch arrSearch = new linearSearch (arr);
		bubbleSort sortArr = new bubbleSort (arr);
		linearSearch arrSearch2 = new linearSearch (arr);
		
	}
}
