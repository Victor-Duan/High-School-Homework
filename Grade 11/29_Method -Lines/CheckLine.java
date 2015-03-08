/*
	File Name: CheckLine.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 16, 2013
	Description: 
*/

import java.util.*;

public class CheckLine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x1_1,x1_2,y1_1,y1_2;
		int x2_1,x2_2,y2_1,y2_2;
		double lineSlope1, lineLength1, lineSlope2, lineLength2;
		
		final int PERPCHECK = -1;
		
		System.out.println("Enter two coordinates of line 1:");
		System.out.print("Vertex 1 x value: ");
		x1_1 = sc.nextInt();
		System.out.print("Vertex 1 y value: ");
		y1_1 = sc.nextInt();
		
		System.out.print("Vertex 2 x value: ");
		x1_2 = sc.nextInt();
		System.out.print("Vertex 2 y value: ");
		y1_2 = sc.nextInt();
		
		System.out.println("Enter two coordinates of line 2:");
		System.out.print("Vertex 1 x value: ");
		x2_1 = sc.nextInt();
		System.out.print("Vertex 1 y value: ");
		y2_1 = sc.nextInt();
		
		System.out.print("Vertex 2 x value: ");
		x2_2 = sc.nextInt();
		System.out.print("Vertex 2 y value: ");
		y2_2 = sc.nextInt();

		lineSlope1 = Line.slope(x1_1,y1_1,x1_2,y1_2);
		lineSlope2 = Line.slope(x2_1,y2_1,x2_2,y2_2);
		
		lineLength1 = Line.length(x1_1,y1_1,x1_2,y1_2);
		lineLength2 = Line.length(x2_1,y2_1,x2_2,y2_2);
		
		if (lineLength1 == lineLength2) {
			System.out.println("The two lines have the same length");
		}
		else {
			System.out.println("The two lines do not have the same length");
		}
		
		if (lineSlope1 == lineSlope2) {
			System.out.println("The two lines are parallel");
		}
		else if (lineSlope1 * lineSlope2 == PERPCHECK) {
			System.out.println("The two lines are perpendicular");
		}
		
	}
}