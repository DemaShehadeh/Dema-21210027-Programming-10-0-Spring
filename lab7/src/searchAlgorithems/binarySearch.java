package searchAlgorithems;

public class binarySearch {
	private int[] arr;

	public binarySearch(int[] arr) {
		this.arr = arr;
	}
	
	public static int search(int[] arr, int key){    
		int count = 0;
		int low = 0;
		int high = arr.length-1;
		
		for(int i = 0; i<arr.length; i++) {
			count++;
			int mid = (low+high)/2;
			
			if(arr[mid]!=key) {
				if(arr[mid]<key) {
					low = mid+1;
					if(mid == high) {
						break;
					}
				}
				else if(arr[mid]>key) {
					high = mid-1;
					if(mid == low) {
						break;
					}
				}
			}else if(arr[mid]==key){
				break;
			}
			
		}
		
		return count;
	}
    
	
}
