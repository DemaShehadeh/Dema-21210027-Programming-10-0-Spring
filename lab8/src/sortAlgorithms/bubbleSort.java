package sortAlgorithms;

import searchAlgorithms.linearSearch;

public class bubbleSort {
	private int arr [];
	public bubbleSort(int [] arr){
		this.arr = arr;
	}
	
	
	public int[] sort(int [] arr) {
		int smaller = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					smaller = arr[j];
					arr[j] = arr[i];
					arr[i] = smaller;
				}
			}
		}
		
		return arr;
		}
	public static double[] doubleSort(double [] arr) {
		double smaller = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					smaller = arr[j];
					arr[j] = arr[i];
					arr[i] = smaller;
				}
			}
		}
		
		return arr;
		}
	
	
}
