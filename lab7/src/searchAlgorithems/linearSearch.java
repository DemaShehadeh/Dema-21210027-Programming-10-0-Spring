package searchAlgorithems;

public class linearSearch {
	
	private int[] arr;

	public linearSearch(int[] arr) {
		this.arr = arr;
	}
	
	public static int search(int[] arr, int key){ 
		int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
            if(arr[i] == key){    
                break;    
            }
        }    
        return count;    
    }
}