package sortAlgorithms;

public class selectionSort {
	private int[] arr;

	public selectionSort(int[] arr) {
		this.arr = arr;
	}
	
	public static void sort(int[] arr){    
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;  
                }  
            }
            
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
    }
}
