/*
 File Name: Circle.java
 Name: Victor Duan
 Class: ICS4U1
 Date: September 27, 2013
 Description: This class contains methods and fields relating to a circle
*/

public class Circle {
  
  private double radius;
  private double xCenter;
  private double yCenter;
  
  //constructor that takes in no parameters
  //creates a circle with radius one with a center at the origin
  public Circle() {
    radius = 1;
    xCenter = 0;
    yCenter = 0;
  }
  
  //constructor that takes in the center coordinates and the radius
  //since method setRadius already changes the radius to absolute value, there is no need to change it here;
  public Circle (double x, double y, double r) {
    radius = r;
    xCenter = x;
    yCenter = y;
  }
  
  //constructor that takes in a circle object
  //duplicates the center and radius of the explicit parameter
  public Circle (Circle other) {
    radius = other.radius;
    xCenter = other.xCenter;
    yCenter = other.yCenter;
  }
  //accessor methods
  
  public double getRadius() {
    return radius;
  }
  
  public double getxCenter() {
    return xCenter;
  }
  
  public double getyCenter() {
    return yCenter;
  }
  
  //mutator methods
  
  public void setRadius(double r) {
    radius = Math.abs(r);
  }
  
  public void setxCenter(double x) {
    xCenter = x;
  }
  
  public void setyCenter(double y) {
    yCenter = y;
  }
  
  //method that calculates the area of the implicit object
  public double area() {
    return (Math.pow(radius, 2) * Math.PI);
  }
  
  //method that returns the address of the smaller circle
  //in the case that both circles are the same size, the implicit object's address is returned
  public Circle smaller(Circle other) {
    if (other != null) {
      if (radius <= other.radius) {
        return this;
      }
      else {
        return other;
      }
    }
    else {
      return null;
    }
  }
  
  //method that returns the distance between two circle centers
  public double distance(Circle other) {
    double xDistance = xCenter - other.xCenter;
    double yDistance = yCenter - other.yCenter;
    double distance = Math.sqrt(Math.pow(xDistance,2) + Math.pow(yDistance,2));
    return distance;
  }
  
  //method that returns a boolean to determine whether or not the implicit is completely contained inside the explicit
  public boolean isInside(Circle other) {
    if (distance(other) <= (other.radius - radius)) {
	 	return true;
	 }
	 else {
	 	return false;
	 }
  }
  
  //method that returns a boolean value to determine whether or not one circle has the same center and radius as another
  public boolean equals (Circle other) {
    return((radius == other.radius) && (distance(other) == 0));
//    if (radius == other.radius) {
//      if (distance(other) == 0) {
//        return true;
//      }
//    }
//    else {
//      return false;
//    }
  }
  
  public String toString() {
    return ("center: (" + xCenter + "," + yCenter + ")  radius: " + radius);
  }
  
  
}