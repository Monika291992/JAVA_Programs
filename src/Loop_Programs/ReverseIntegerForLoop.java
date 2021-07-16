package Loop_Programs;

public class ReverseIntegerForLoop {

	public static void main(String[] args) {
		
		int num  = 987654, rev=0;
		
		for(; num!=0; num=num/10)
		{
			int rem = num%10;
			rev = rev*10+rem;
			
		}
		System.out.println(rev);

	}

}
