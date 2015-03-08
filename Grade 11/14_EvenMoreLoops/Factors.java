/*
	File Name: Factors.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 25, 2013
	Description: The program outputs all the factors of an integer the user inputs
*/

import java.util.*;

public class Factors {
	public static void main(String[] args) {
		
		//variable declaration
		//factor starts at one since factor is changed after if structure in the loop
		//makes sure remainder is 0 for first check
		Scanner sc = new Scanner(System.in);
		int userNum;
		int factor = 1;
		int remainder;
		
		//gathers the integer from the user and calculates remainder
		System.out.print("Enter an integer: ");
		userNum = sc.nextInt();
		remainder = userNum % factor;
		
		//checks and prints out factors of the inputted number
		//runs until the factor is greater than the inputted number
		//factor and remainder are changed at the end to properly check
		while (factor <= userNum){
			if (remainder == 0) {
				System.out.println(factor);
			}
			factor++;
			remainder = userNum % factor;
		}
	}
}