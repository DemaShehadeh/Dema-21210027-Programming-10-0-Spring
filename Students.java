package package1;

public class Students {
	
	//method:
	int calc(int m1, int m2, int m3, int m4, int m5) {
		int avg = (m1 + m2 + m3 + m4 + m5)/5;
		return avg;
	}
	
	void print(int avg) {
		if(avg<100 && avg>=90) {
			System.out.println("A");
		}else if (avg<90 && avg>=80){
			System.out.println("B");
		}else if (avg<80 && avg>=70){
			System.out.println("C");
		}else if (avg<70 && avg>=60){
			System.out.println("D");
		}else if (avg<60 && avg>=50){
			System.out.println("E");
		}else {
			System.out.println("filed");
		}
	}

}
