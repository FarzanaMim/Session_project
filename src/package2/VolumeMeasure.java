package package2;

public class VolumeMeasure {
	
	
	public double measureVolume(double pie,double radius,double hight){
		
		
		double  v= pie*radius*radius*hight;
		return v ;
		
	}
public double measureVolume(double pie,double radius){
		
		
		double  v= 4/3*pie*radius*radius*radius;
		return v ;
		
	}
public double measureVolume(double edge){
	
	
	double  v=edge*edge*edge;
	return v ;
	
}

}
