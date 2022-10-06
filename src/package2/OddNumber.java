package package2;



public class OddNumber {

	
public static void main(String[] args) {
		
		int x=0;
		for(int i=0;i<=20; i++) {
			
			if (i % 2==0) {
				
			}
			else {
				System.out.println(i +"is odd");
				while(x<i) {
					x=i;
				}
				
			}
		}
		
		System.out.println("maximum odd number is"+x);  
	      
				
			
		
		}
	
	
}
