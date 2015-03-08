/*
	File Name: AgeCheck.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 6, 2013
	Description:The program gets the user's age, and outputs if they can vote or not
*/

import java.util.*;

public class AgeCheck {
	public static void main(String[] args){
		
		//variable declaration
		//18 is the age when you can first vote
		Scanner sc = new Scanner(System.in);
		double age, waitingYears;
		final int VOTE_AGE = 18;
		
		//gathers the user's age
		System.out.print("Enter your age: ");
		age = sc.nextDouble();
		
		//checks if the user's age is greater than or equal to 18
		if (age >= VOTE_AGE) {
			System.out.println("OLD ENOUGH TO VOTE");
		}
		else {
			System.out.println("YOU MUST WAIT " + (int)(VOTE_AGE - age) + " YEAR(S) TO VOTE");
		}
	}
}