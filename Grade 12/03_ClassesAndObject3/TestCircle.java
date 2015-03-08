public class TestCircle {
  public static void main(String[] args) {
    //final double PI;
    //System.out.println(Math.PI);
    Circle c1 = new Circle (4,-1,3);
    
    Circle c2 = new Circle(3,-2,5);
	 System.out.println(c1.area());
	 
	 System.out.println(c1.smaller(c2));
	 
	 if (c2.isInside(c1)) {
	 	System.out.println("Second circle is inside first");
	 }
	 else {
	 	System.out.println("Second circle is not inside first");
	 }
	 
	 Circle c3 = c1;
	 Circle c4 = new Circle(c1);
	 
	 System.out.println(c3);
	 System.out.println(c1);
//     Circle c3 = c1.smaller(c2);
//     System.out.println(c3.getxCenter());
//     
//     System.out.println(c1.distance(c2));
// 	 
// 	 Circle c4 = new Circle(2,3,5);
// 	 Circle c5 = new Circle(0,0,8);
// 	 
// 	 System.out.println(c4.isInside(c5));
// 	 System.out.println(c4);

  }
}