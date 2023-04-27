package package1;

public class labFive {

	public static void main(String[] args) {
		int [] arr = new int [12];
		int num1 = 0;
		int num2 = 1;
		int num3;
		arr[0] = num1;
		arr[1] = num2;
		int i = 2;
		while(i<arr.length) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			arr[i] = num3;
			i++;
		}
		System.out.print(arr[0]);
		for(int ii = 1; ii<arr.length; ii++) {
			System.out.print("," + arr[ii]);
		}
		
		

	}

}
