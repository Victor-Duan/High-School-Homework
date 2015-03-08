/*
	File Name: Line.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 16, 2013
	Description: 
*/

import java.lang.Math;

public class Line {
	
	public static double length (int x1, int y1, int x2, int y2){
		double xDimension = Math.pow(x1 - x2, 2);
		double yDimension = Math.pow(y1 - y2, 2);
		double lineLength = Math.sqrt(xDimension + yDimension);
		return (lineLength);
	}
	
	public static double slope (int x1, int y1, int x2, int y2){
		double deltaX = x1 - x2;
		double deltaY = y1 - y2;
		double lineSlope = deltaY / deltaX;
		return (lineSlope);
	}


}