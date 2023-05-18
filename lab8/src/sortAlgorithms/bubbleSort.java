package sortAlgorithms;

import searchAlgorithms.linearSearch;

public class bubbleSort {
	private int arr [];
	public bubbleSort(int [] arr){
		this.arr = arr;
	}
	
	
	public void sort(int [] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; i<(arr.length-i); i++) {
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	
}
