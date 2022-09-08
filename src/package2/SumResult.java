package package2;

import package1.Sum;

public class SumResult extends Sum{
	
	
	public  double sumResult(double a,double b) {
		double result;
		
		result=a*b;
		return result;
		
	}

	
	public static void main(String[] args) {
		
      Sum object1=new Sum();
      SumResult object2= new SumResult();
      
	  double summetion=object1.sumResult(4.3,5.3);
      System.out.println("Summetion:" +summetion);
      
      double multiplication=object2.sumResult(6.667,7.64454);
      System.out.println("Multiplication:" +multiplication);
      
			
		
	
	}
	
	

}
