/*
	File Name: CharToString.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 1, 2013
	Description: The program gets a char value from the user, and converts it and stores it as a string
					 in a seperate variable
					 The program then outputs both values
*/

import java.util.*;

public class CharToString {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		char ch;
		String stringValue;
		
		System.out.print("Enter a character: ");
		ch = sc.nextLine().charAt(0);
		stringValue = String.valueOf(ch);
		
		System.out.println(stringValue + ch);
		
	}
}