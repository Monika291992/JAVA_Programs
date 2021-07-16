package String;

public class StringMethods {

//1) length():
	public static void main(String[] args) {
		
		String Name = "Monika"; 
		
		String Value = " It is test of the test cases ";
		
		//String Name = null; throws null pointer exception
		
		//String Name = ""; prints Name is empty
		
		System.out.println(Name.length());
		
		int i = Name.length(); //returns integer value
		
		if(i==0)
		{
			System.out.println("Name is empty");
		}
		
		System.out.println(Name.isEmpty());// returns boolean value
		
		if(Name.isEmpty() == true)
		{
			System.out.println("Name is empty");
		}
		
		System.out.println(Value.trim()); // removes the spaces before and after the string
		
		System.out.println(Value.length());
		
		System.out.println(Value.trim().length()); //System.out.println(Value.length().trim()); it is wrong
			

	}

}
