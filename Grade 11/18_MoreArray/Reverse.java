/*
	File Name: Reverse.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 12, 2013
	Description: This program has two arrays of capacity 10
					 The first array holds ten values input by the user
					 The second array gets the values of the first array in reverse order
*/

import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int[] userInput;
		int[] reverseInput;
		final int ENTRYNO = 10;
		
		//creates 2 arrays - one which stores the user input in order, and one which stores
		//the reverse order
		userInput = new int [ENTRYNO];
		reverseInput = new int [ENTRYNO];
		
		//gets the number from the user
		//stores that value in the appropriate index when reversed
		for (int i = 0; i < ENTRYNO; i++) {
			System.out.print("Enter a number: ");
			userInput[i] = sc.nextInt();
			reverseInput[ENTRYNO - i - 1] = userInput[i];
		}
		
		//In one line, outputs the value that the index has when the numbers in order
		//then the value the index has when the numbers are reversed
		for (int i = 0; i < ENTRYNO; i++) {
			System.out.println(userInput[i] + "     " + reverseInput[i]);
		}

	}
}