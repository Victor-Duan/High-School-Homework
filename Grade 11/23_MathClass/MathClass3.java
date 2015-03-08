/*
	File Name: MathClass3.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 30, 2013
	Description:The user enters a number, and the program outputs the absolute value
*/

import java.util.*;
import java.lang.Math;

public class MathClass3 {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		double number;
		
		//asks the user to enter their number
		System.out.print("Enter a number: ");
		number = sc.nextDouble();
		
		//finds the absolute value using the abs method
		number = Math.abs(number);
		
		//outputs the absolute value of the inputted number
		System.out.println("The absolute value of your number is: " + number);
	}
}