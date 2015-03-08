/*
	File Name: Age.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 20, 2013
	Description: The program asks the user to guess *my* age until they get it correct
*/

import java.util.*;

public class Age {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int guess;
		final int ANSWER = 16;
		
		//asks the user to input their guess
		System.out.print("Guess my age: ");
		guess = sc.nextInt();
		
		//checks to see if answer is right
		//asks user to keep guessing if wrong
		while (guess != ANSWER) {
			System.out.print("Incorrect. Guess again: ");
			guess = sc.nextInt();
		}
		
		//final output
		System.out.println("Correct");
	}
}