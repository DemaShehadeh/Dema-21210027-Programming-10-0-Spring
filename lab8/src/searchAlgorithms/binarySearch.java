package searchAlgorithms;

public class binarySearch {
	private int[] arr;

	public binarySearch(int[] arr) {
		this.arr = arr;
	}
	
	public static void sort(int[] arr){    
		int larger = arr[1];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					larger = arr[j];
					arr[j] = arr[i];
					arr[i] = larger;
				}
			}
		} 
	}
    
	
}
