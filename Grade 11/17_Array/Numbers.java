/*
	File Name: Numbers.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 10, 2013
	Description: The program asks the user to enter 6 doubles
					 The program then prints them out in reverse order
					 adds 10 percent to each of them, and prints all values that are over 50
*/

import java.util.*;

public class Numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int NUMDOUBLES = 6;
		final double ONETENPERCENT = 1.1;
		final int OVERFIFTY = 50;
		
		//section a - declare an array of 6 indexes
		
		double[] userNum;
		userNum = new double [NUMDOUBLES];
		
		//section b - read in a list of values from the user
		
		for (int i = 0; i < NUMDOUBLES; i++) {
			System.out.print("Enter a number: ");
			userNum[i] = sc.nextDouble();
		}
		
		//section c - print the values in reverse order
		
		for (int i = NUMDOUBLES - 1; i >= 0; i--) {
			System.out.println(userNum[i]);
		}
		
		//section d - add 10% to each value in the array
		
		for (int i = 0; i < NUMDOUBLES; i++) {
			userNum[i] = userNum[i] * ONETENPERCENT;
		}
		
		//section e - print all the values that are over 50
		System.out.println("");
		
		for (int i = 0; i < NUMDOUBLES; i++) {
			if (userNum[i] > OVERFIFTY) {
				System.out.println(userNum[i]);
			}
		}

	}
}