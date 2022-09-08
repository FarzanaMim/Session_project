package package2;

import package1.Sum;

public class SumResult extends Sum{
	
	
	public static  double sumResult(double a,double b) {
		double result;
		
		result=a*b;
		return result;
		
	}
	
	public static void main(String[] args) {
		
      
		double summetion=Sum.sumResult(4.3,5.3);
      System.out.println("Summetion:" +summetion);
      
      double multiplication=sumResult(6,7);
      System.out.println("Multiplication:" +multiplication);
      
			
		
	
	}
	
	

}
