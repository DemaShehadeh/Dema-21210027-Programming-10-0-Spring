package sortAlgorithms;

public class selectionSort {
	private int[] arr;

	public selectionSort(int[] arr) {
		this.arr = arr;
	}
	
	public static int[] sort(int[] arr){    
		int min = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
			
		}
  
    return arr;
	}
}
