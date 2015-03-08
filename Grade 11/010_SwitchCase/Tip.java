/*
	File Name: Tip.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 19, 2013
	Description: The program gives the user a studying tip based on 
					 the letter grade the user inputs
*/

import java.util.*;

public class Tip {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		char grade;
		
		//all the possible options for grade
		final char A = 'A', B = 'B', C = 'C', D = 'D', F = 'F';
		
		//gets the user's letter grade
		System.out.print("What letter grade are you getting in computer science? ");
		grade = sc.nextLine().charAt(0);
		
		//creates a blank line
		System.out.print("\n");
		
		//outputs an appropriate message
		switch (grade) {
			case A:
				System.out.println("Keep up the good work");
				break;
			case B:
				System.out.println("Work a little harder");
				break;
			case C:
				System.out.println("You should study more");
				break;
			case D:
				System.out.println("You better study if you're don't want to fail");
				break;
			case F:
				System.out.println("You really need to start working");
				break;
		}//end case structure
	}//end main method
}