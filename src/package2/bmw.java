package package2;

import package1.banglamotors;

public class bmw {
	
	static banglamotors obj1=new banglamotors();
	static bmw obj2=new bmw();
	
	
public static void bmwCreateEngine() {
		
		int bmwavalve=obj1.getvalve();
		int bmwSparkplug=obj1.getsparkPlug();
		int bmwPiston=obj1.getpiston();
		int bmwcombustion_chamber=obj1.combustion_chamber;
		
		System.out.println("Valve:" +bmwavalve);
		System.out.println("SparkPlug:" +bmwSparkplug);
		System.out.println("Piston:" +bmwPiston);
		
		System.out.println("Combustion_chamber:" +bmwcombustion_chamber);
		
	}

public static void main(String[] args) {
	
	bmwCreateEngine();
		
	}
	

}
