package package2;

import java.util.Arrays;

public class ArrayAssigment {


public static void main(String[] args) {
		
		int x=0;
		int a[]= {12,6,8,55,34,10,5};
		for(int i=0;i<a.length; i++) {
			
				while(x<a[i]) {
					x=a[i];
				}
				
			}
		System.out.println("Maximum number of the array:"+x);	   
		
		
		int y=a[0];
		for(int i=0;i<a.length; i++) {
			
			while(y>a[i]) {
				y=a[i];
			}
			
		}
	System.out.println("Minimum number of the array: "+y);	
	//char office[]=new char[10];
	
	char office[]= {'B','A','L','R','A','T','S','N','O','M'};
	char[] office2 = new char[10];
	int k =9;
	for(int i=0;i<office.length;i++) {
		office2[i]=office[k];
		
		k =k-1;
		
	}
	 String str = String.valueOf(office2);
	System.out.println("The Resultant string is: "+str);	
		
 }
	

}


