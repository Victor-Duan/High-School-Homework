/*
	File Name: Addition.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 30, 2013
	Description: The user is to provide the right sum of two random numbers
				 	 The program will continually ask until the answer is correct
*/

import java.util.*;
import java.lang.Math;

public class Addition {
	public static void main(String[] args) {
		
		//variabe declaration
		//numbers are found with Math.random() method
		Scanner sc = new Scanner(System.in);
		double n1 = Math.random();
		double n2 = Math.random();
		double sum;
		double answer = n1 + n2;
		
		//outputs question for the user
		System.out.println(n1 + " + " + n2 + " = ?");
		sum = sc.nextDouble();
		
		//loops if the user input is not right
		while (sum != answer) {
			System.out.println("Incorrect");
			System.out.println(n1 + " + " + n2 + " = ?");
			sum = sc.nextDouble();
		}
	}
}