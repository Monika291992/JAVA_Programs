package Loop_Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Monika"; 
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--){
		//for(int i=0; i<=name.length()-1; i++){
			
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

	}

}

