/*
	File Name: AllArrays1.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 24, 2013
	Description: This program has an integer of arrays with a capacity entered by the user
					 The program then switches the values at the ends of the array
					 Changes any negative value to positive value, finds the sum of the elements
					 and prints all the even numbers in the array
*/

import java.util.*;

public class AllArrays1 {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int[] elements;
		int firstElement;
		int arraySize;
		int sampleSum = 0;
		
		//a.	Ask user to enter an integer n, then declare an array of integer of size n
		
		System.out.println("Enter the size of the array: ");
		arraySize = sc.nextInt();
		elements = new int [arraySize];
		
		//b.	Initialize all elements of the array to one
		
		for (int i = 0; i < arraySize; i++) {
			elements[i] = 1;
		}
		
		//c.	Ask user to enter n integers, and fill the arrays with these integer in order

		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter value for index " + i + ": ");
			elements[i] = sc.nextInt();;
		}
		
		//d.	Switch the values at either end of the array
		
		firstElement = elements[0];
		elements[0] = elements[arraySize - 1];
		elements[arraySize - 1] = firstElement;
		
		//e.	Change any negative values to positive values (of the same magnitude)
		
		for (int i = 0; i < arraySize; i++) {
			if (elements[i] < 0) {
				elements[i] = elements[i] * -1;
			}
		}
		
		//f.	Set the variable sampleSum to the sum of the values of all the elements

		for (int i = 0; i < arraySize; i++) {
			sampleSum += elements[i];
		}
		
		//g.	Print all the even numbers in the array
		
		for (int i = 0; i < arraySize; i++) {
			if (elements[i] % 2 == 0) {
				System.out.println(elements[i]);
			}
		}

	}
}