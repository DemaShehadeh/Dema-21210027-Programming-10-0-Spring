package package1;

public class algorithem1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 15;
		arr[1] = 50;
		arr[2] = 26;
		arr[3] = 4;
		arr[4] = 19;
		arr[5] = 90;
		arr[6] = 100;
		arr[7] = 5;
		arr[8] = 7;
		arr[9] = 35;
		
		int smaller = arr[0];
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				if( arr[i] > arr[j]) {
					smaller = arr[i];
					arr[i] = arr[j];
					arr[j] = smaller;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i]);
			}else
			System.out.print(", " + arr[i]);
		}
		System.out.println();
		

	}

}
