package Loop_Programs;

// Palindrome Number = 121, 535 jo reverse ke baad bhi same hote hai
public class PalindromNumber {

	public static void main(String[] args) {


		int num = 122, rev = 0, temp=num;
		while(temp!=0){
			
			int rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
			
		}
		if(num==rev){
			
			System.out.println(num+ " is palindrome");
		}
		else
		{
			System.out.println(num+ " is not palindrome");	
		}

	}

}
