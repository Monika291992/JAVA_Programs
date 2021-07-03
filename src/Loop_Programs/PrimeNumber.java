package Loop_Programs;
//1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59
public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int num=1; num<=60; num++){
			
			int temp = 0;
			
			for(int i=2; i<=num-1; i++){
				
				if(num%i==0){
					
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(num);
			}
			else
			{
				temp=0;
						
			}
		}

	}

}
