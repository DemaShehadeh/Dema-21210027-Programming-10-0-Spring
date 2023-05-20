package mainDriven;

import searchAlgorithems.*;
import sortAlgorithms.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [] {10, 15, 5, 3, 2, 15, 20, 32, 1};
		
		/*Declare an object from linear and call the linear search method 
		then count how many times you check on the elements to find the key.*/
		linearSearch arrSearch = new linearSearch (arr);
		System.out.println("count without sorting = " +arrSearch.search(arr, 2));
		System.out.println("");
		
		/*Sort the array by using any sorting algorithm from the sort package then
	  	use the linear search to count how many times it is needed to find the key.*/
		selectionSort sortArr = new selectionSort (arr);
		sortArr.sort(arr);
		
		System.out.println("After Sorting in bubble sort:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		
		System.out.println("count in linear search = " + arrSearch.search(arr, 2));


		
		//Find the item that doesn’t exist by using the linear search method.
		System.out.println("count for an item that does not exist in linear search = " +arrSearch.search(arr, 50));
		
		/*use the binary search method, and count how many times you check on the elements to find the key. */
		binarySearch arrSearch2 = new binarySearch (arr);
		System.out.println("count in binary search = " + arrSearch2.search(arr, 2));
		
		/*Find the item that doesn’t exist by using the binary search method.*/
		System.out.println("count for an item that does not exist in binary search = " + arrSearch2.search(arr, 50));


		
	}
}

