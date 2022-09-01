package package2;

import package1.banglamotors;

public class toyota extends banglamotors{
	
	static banglamotors obj1=new banglamotors();
	static toyota obj2=new toyota();
	
	public static void toyotaCreateEngine() {
		
		int toyotavalve=obj1.getvalve();
		int toyotaSparkplug=obj1.getsparkPlug();
		int toyotaPiston=obj1.getpiston();
		int toyotacylinder=obj2.cylinder=5;
		int toyotacrank=obj2.crank=3;
		int toyotacombustion_chamber=obj2.combustion_chamber=6;
		
		System.out.println("Valve:" +toyotavalve);
		System.out.println("Sparkplug:" +toyotaSparkplug);
		System.out.println("cylinder:" +toyotacylinder);
		System.out.println("crank:" +toyotacrank);
		System.out.println("combustion_chamber:" +toyotacombustion_chamber);
		
	}
public static void main(String[] args) {
		
     toyotaCreateEngine();
		
	}

	

}
