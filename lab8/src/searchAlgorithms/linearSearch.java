package searchAlgorithms;

public class linearSearch {
	
	private int[] arr;

	public linearSearch(int[] arr) {
		this.arr = arr;
	}
	
	public static int search(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }
}
