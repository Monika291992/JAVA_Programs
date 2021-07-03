package Loop_Programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter name");
		String name = s.next();
		
		System.out.println("Enter age");
		int age = s.nextInt();
		
		System.out.println("Enter gender");
		char gender = s.next().charAt(0);
		
		System.out.println("Enter phone number");
		long phoneNo = s.nextLong();
		
		System.out.println("-------------------------------------");
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Gender : " +gender);
		System.out.println("Phone Number : " +phoneNo);
		

	}

}
