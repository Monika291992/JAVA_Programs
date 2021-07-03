package Loop_Programs;

import java.util.Scanner;

public class ArmstrongRunTime {

	public static void main(String[] args) {
         
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int t1=num, length=0;
		
		while(t1!=0){
			
			t1 = t1/10;
			length = length + 1;
		}
		
		int t2=num, arm = 0;
		
		while(t2!=0){
			
			int multi = 1;
			int rem =t2 % 10;
			for(int i=1; i<=length; i++){
				
				multi = multi * rem;
			}
			arm = arm + multi;
			t2 = t2/10;
	
		}
		if(num==arm){
			
			System.out.println(num+ " is a armstrong");
		}
		else
		{
			System.out.println(num+ " is not a armstrong");
		}
		
		
		

		

	}

}
