public class Triangle extends Shape {
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(double side1, double side2, double side3) {
		s1 = side1;
		s2 = side2;
		s3 = side3;
	}
	
	public double area() {
		return (s1 + s2 + s3) / 2;
	}
	
	public double perimeter () {
		return (s1 + s2 + s3);
	}
}