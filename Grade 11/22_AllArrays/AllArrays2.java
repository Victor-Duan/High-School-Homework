/*
	File Name: AllArrays2.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 24, 2013
	Description: This program initializes an array of size 14, with elements inputted by the user
					 The program will then reverse the values of each index in 2 different ways
*/

import java.util.*;

public class AllArrays2 {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int[] userInput;
		int[] reverseInput;
		int input, temp;
		final int ARRAYSIZE = 14;
		
		//creates 2 arrays
		//both are used in part a), but the second one is not used in part b)
		userInput = new int [ARRAYSIZE];
		reverseInput = new int[ARRAYSIZE];
		
		//a.	The first version uses two arrays.  The original array is not changed.  
		//The second array gets the elements of the first array in reversed order.  
		//The content of the second array is then printed in order.
		
		for (int i = 0; i < ARRAYSIZE; i++) {
			System.out.print("Enter value for index " + i + ": ");
			userInput[i] = sc.nextInt();
		}
		
		for (int i = 0; i < ARRAYSIZE; i++) {
			reverseInput[i] = userInput[ARRAYSIZE - 1 - i];
			System.out.println(reverseInput[i]);
		}
		
		//b.	In the second version, there is only one array and its values are reversed and printed.
		
		//reverses the values in the array
		//temp stores the value of the index that will be switched first
		//the index then stores the value of its matching index
		//the matching index then stores the value of the switched index 
		for (int i = 0; i < ARRAYSIZE / 2; i++) {
			temp = userInput[i];
			userInput[i] = userInput[ARRAYSIZE - 1 - i];
			userInput[ARRAYSIZE - 1 - i] = temp;
		}
		
		//prints out the reversed array
		for (int i = 0; i < ARRAYSIZE; i++) {
			System.out.println(userInput[i]);
		}

	}
}