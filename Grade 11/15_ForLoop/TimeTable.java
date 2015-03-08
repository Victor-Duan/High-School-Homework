/*
	File Name: TimeTable.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 26, 2013
	Description: The program asks the user to enter in a positive integer N
					 The program then outputs a timetable up to N*N for all positive integers
					 intput is assumed to be valid
*/

import java.util.*;

public class TimeTable {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int num;
		
		//gets number to multiply from the user
		System.out.print("Enter in a positive integer: ");
		num = sc.nextInt();
		
		//outputs the multiplication table
		//i starts at 1 because 1 is the first positive integer to multiply by
		//loop exited once i is greater than the number
		for (int i = 1; i <= num; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
	}
}