/*
	File Name:Bigger.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 30, 2013
	Description:The program gets two numbers from the user, and outputs the larger one
*/

import java.util.*;
import java.lang.Math;

public class Bigger {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		double u1, u2;
		
		//gets the two number fromt he user
		System.out.print("Enter one number: ");
		u1 = sc.nextDouble();
		System.out.print("Enter another numebr: ");
		u2 = sc.nextDouble();
		
		//outputs the larger number
		//uses method Math.max, the double variation
		System.out.println("Larger number is: " + Math.max(u1,u2));
	}
}