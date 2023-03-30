package package1;

public class thurQuiz {
	public static void main(String[] args) {
		//Q1
		int num=543;
		int num2;
		int num3;
		while(num==543) {
			if(num%10 == 3) {
				num2=num/10;
				if(num2%10==4) {
					num3=num2/10;
					if(num3%10 == 5) {
						System.out.println("345");
					}
				}
			}
		}
		
		//Q2
		for(int i=1; i<50; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//Q3
		char[] vols= new char [] {'a', 'o', 'u', 'i', 'e'};
		System.out.println(vols.length);
		vols[2]='E';
		vols[0] = vols[1];
		System.out.println(vols['u']);
		
		//Q4
		String[] jobs= new String [] {"Computer Science","Data Science", "Cyber Security", "Computer ENgineering","Software Engineering"};
		for( int i = 0; i <jobs.length; i++);
		{
			System.out.println(jobs[i]);
		}
		jobs[4] = 'Computer Information Systems';
		for( int i = 0; i <jobs.length; i++);
		{
			System.out.println(jobs[i]);
		}
		//for each
		String[] eachJob = new String [jobs.length];
		int i = 0;
		for(String eachJob : jobs)
		{
			System.out.println(eachJobs[i]);
			i++;
		}
		jobs[4] = 'Computer Information Systems';
		for(String eachJob : jobs)
		{
			System.out.println(eachJobs[i]);
			i++;
		}
		
	}

}
