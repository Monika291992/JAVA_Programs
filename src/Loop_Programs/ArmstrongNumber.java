package Loop_Programs;

//Armstrong Number like 153 = 1
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//find out number of digits
		
		int num = 153, t1=num, length=0;
		
		while(t1!=0){ //1- true , 2- true , 3- true
			
			t1 = t1/10; //1- 15 , 2- 1 , 0
			length = length + 1; //1- 1 , 2 , 3
						
		}
		int t2=num, arm=0;
		
		while(t2!=0){ //1- true , 2- true , 3- true
			
			int rem = t2%10; // 1- 3 , 2- 5 , 3- 1
			int multi =1;
			for(int i=1; i<= length; i++){ //1- true , 2- true , 3- true
				
				multi = multi * rem; //1- 1*3, 3*3, 9*3 = 27 , 2- 1*5, 5*5, 25*5 = 125 , 3- 1*1, 1*1, 1*1 = 1
			}
			
			arm = arm + multi; // 1- 27  , 2- 125 , 3- 1
			t2 = t2/10; ; // 1- 153 , 2- 15 , 3- 1
		}
		if(num==arm){
			
			System.out.println(num+ " is a armstrong");
		}
		else{
			
			System.out.println(num+ " is not a armstrong");
		}
			
 
	}
	
	// 3 = 3*3*3
	// 5 = 5*5*5
	// 1 = 1*1*1

}
