/*
	File Name: FirstLast.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 1, 2013
	Description: This program outputs the first and last characters in a string entered 
					 by the user
*/

import java.util.*;

public class FirstLast {
	public static void main(String[] args) {
	
		//variable declaration
		Scanner sc = new Scanner(System.in);
		String userEntry;
		
		//gets a string from the user
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		
		//finds the first and last characters
		//the maximum index of a string is always its length minus 1
		//which is used to find the last character of the string
		System.out.println("First character: " + userEntry.charAt(0));
		System.out.println("Last character: " + userEntry.charAt(userEntry.length() - 1));
	}
}