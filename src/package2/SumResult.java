package package2;

import package1.Sum;

public class SumResult extends Sum{
	
	
	public static  int sumResult(int a,int b) {
		int result;
		
		result=a*b;
		return result;
		
	}
	
	public static void main(String[] args) {
		
      
      int summetion=Sum.sumResult(4,5);
      System.out.println("Summetion:" +summetion);
      
      int multiplication=sumResult(6,7);
      System.out.println("Multiplication:" +multiplication);
      
			
		
	
	}
	
	

}
