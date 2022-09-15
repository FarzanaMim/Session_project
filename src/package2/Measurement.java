package package2;

public class Measurement {

	public static void main(String[] args) {
		VolumeMeasure obj=new VolumeMeasure();
		
	 System.out.println("Volume of Cylinder:" +obj.measureVolume(3.1416,22.20,33.30));
	 System.out.println("Volume of sphere:" +obj.measureVolume(3.1416,44));
	 System.out.println("Volume of Cube:" +obj.measureVolume(11.10));



	}

}
