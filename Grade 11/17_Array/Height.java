/*
	File Name: Height.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 12, 2013
	Description: The program asks the user to enter in 20 heights.
					 The program then outputs all heights that are taller than the average
					 of the 20
*/

import java.util.*;

public class Height {
	public static void main(String[] args) {
		
		//variable declaration
		//20 is the number of heights gathered, which is a constant
		Scanner sc = new Scanner(System.in);
		double[ ] height;
		double average = 0;
		final int STUNUM = 20;
		
		//sets it so that array height can hold 20 values
		height = new double [STUNUM];
		
		//gets the 20 heights from the user
		//stores each value in seperate indexes of the array
		for (int i = 0; i < STUNUM; i++) {
			System.out.print("Enter the person's height: ");
			height[i] = sc.nextInt();
			average = average + height[i];
		}
		
		//calculates the average height
		average = average / STUNUM;
		
		//checks to see if each seperate index is greater than the average
		for (int i = 0; i < STUNUM; i++){
			if (height[i] > average) {
				System.out.println(height[i]);
			}
		}
		
	}
}