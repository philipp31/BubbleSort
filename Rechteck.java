
public class Rechteck implements Comparable{	// Implementierung des Comparable Interface
	private double length;
	private double width;
	public double area;
	
	public Rechteck(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = length*width;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	@Override
	public int compareTo(Object o) {
		Rechteck other = (Rechteck) o;
		if( this.area > other.area ) {
			return 1;
		}
		else if( this.area < other.area ) {
			return -1;
		}
		else {
			return 0;
		}
	}	//ist das objekt kleiner -> -1, ist es größer -> 1, gleich -> 0

}