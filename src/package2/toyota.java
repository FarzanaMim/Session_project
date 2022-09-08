package package2;

import package1.banglamotors;

public class toyota extends banglamotors{
	
	
	
	public static void toyotaCreateEngine() {
		banglamotors obj1=new banglamotors();
		toyota obj2=new toyota();
		
		int toyotavalve=getvalve();
		int toyotaSparkplug=obj1.getsparkPlug();
		int toyotaPiston=obj1.getpiston();
		int toyotacylinder=obj2.cylinder=5;
		int toyotacrank=obj2.crank=3;
		int toyotacombustion_chamber=obj1.combustion_chamber=6;
		
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
