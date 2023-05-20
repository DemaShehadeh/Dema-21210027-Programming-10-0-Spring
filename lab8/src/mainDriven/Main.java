package mainDriven;

import searchAlgorithms.*;

import sortAlgorithms.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = new int [] {10, 15, 5, 3, 2, 15, 20, 32, 1};
//		
//		/*Declare an object from linear and call the linear search method 
//		then count how many times you check on the elements to find the key.*/
//		linearSearch arrSearch = new linearSearch (arr);
//		System.out.print("count without sorting = ");
//		printed myPrint = new printed(arrSearch.search(arr, 2));
//		printed.print(arrSearch.search(arr, 2));
//		System.out.println("");
//		
//		/*Sort the array by using any sorting algorithm from the sort package then
//	  	use the linear search to count how many times it is needed to find the key.*/
//		selectionSort sortArr = new selectionSort (arr);
//		sortArr.sort(arr);
//		
//		System.out.println("After Sorting in bubble sort:");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}
//		System.out.println("");
//		
//		System.out.print("count in linear search = ");
//		printed.print(arrSearch.search(arr, 2));
//
//
//
//		
//		//Find the item that doesn’t exist by using the linear search method.
//		System.out.print("count for an item that does not exist in linear search = " );
//		printed.print(arrSearch.search(arr, 50));
//		
//		/*use the binary search method, and count how many times you check
//		on the elements to find the key. */
//		binarySearch arrSearch2 = new binarySearch (arr);
//		System.out.print("count in binary search = ");
//		printed.print(binarySearch.search(arr, 2));
//
//		
//		/*Find the item that doesn’t exist by using the binary search method.*/
//		System.out.print("count for an item that does not exist in binary search = " );
//		printed.print(binarySearch.search(arr, 50));
//		
//		
//		
//		System.out.println("");
		System.out.println("****************************");
		//LAB 8:
		Product p1 = new Product ("Cheese", 5.50);
		Product p2 = new Product ("Milk", 9.75);
		Product p3 = new Product ("Nescafe", 4.50);
		Product p4 = new Product ("Ketchup", 2.50);
		
		ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(p1);
        productList.add(1, p4); //Adding p4 at index 1
        productList.add(p2);
        productList.add(p3);
        
       System.out.println("The content of the ArrayList: ");
        for (Product product : productList) {
            System.out.println(product.getName());
        }
        System.out.println("");
        
        double[] pricesArray = new double[productList.size()];
        for (int i = 0; i < productList.size(); i++) {
            pricesArray[i] = productList.get(i).getPrice();
        }

        System.out.println("");
        System.out.println("Before sorting: ");
        for(int i=0; i<pricesArray.length; i++) {
        	System.out.print(pricesArray[i] + " ");
        }
        System.out.println("");
        
        bubbleSort.doubleSort(pricesArray);
        
        System.out.println("");
        System.out.println("After sorting: ");
        for(int i=0; i<pricesArray.length; i++) {
        	System.out.print(pricesArray[i] + " ");
        }





		
	}
}
