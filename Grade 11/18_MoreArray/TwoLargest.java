/*
	File Name: TwoLargest.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 10, 2013
	Description: The program creates ten random numbers, then outputs the two largest
*/

import java.util.*;

public class TwoLargest {
	public static void main(String[] args) {
		
		//variable declaration
		int firstLarge = 0;
		int secondLarge = 0;
		int [] numbers;
		final int NUMVALUES = 10;
		
		//creates a random number generator
		Random generator = new Random();
		
		//instantiate an instance of the class specifying a capacity of 10 elements
		numbers = new int [NUMVALUES];
		
		//creates and prints out each random integer
		//the printing is so that the user can actually see if the program ran correctly or not
		for (int i = 0; i < NUMVALUES; i++) {
			numbers[i] = generator.nextInt();
			System.out.println(numbers[i]);
		}
		
		//checks to see if each random integer is either first or second largest
		for (int i = 0; i < NUMVALUES; i++) {
			if (numbers[i] > firstLarge) {
				firstLarge = numbers[i];
			}
			if (numbers[i] > secondLarge && numbers[i] < firstLarge) {
				secondLarge = numbers[i];
			}
		}
		
		//final output lists the first and second largest elements
		System.out.println("The largest element is: " + firstLarge);
		System.out.println("The second largest element is: " + secondLarge);
		
	}
}