package Loop_Programs;

import java.util.Scanner;

public class PalindromeRunTime {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =s.nextInt();
		int rev=0, temp=num;
		
		while(temp!=0){
			
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev){
			
			System.out.println(num+ " is Palindrome");
		}
		else 
		{
			System.out.println(num+ " is not a Palindrome");
		}

	}

}
