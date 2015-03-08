/*
	File Name: Alphabetical.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 1, 2013
	Description: This program asks the user to enter two strings, and outputs if the first is alphabetically
					 before, equal, or after the second
*/

import java.util.*;

public class Alphabetical {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		String string1,string2;
		int order;
		
		//gets 2 strings from the user
		System.out.print("Enter a string: ");
		string1 = sc.nextLine();
		System.out.print("Enter another string: ");
		string2 = sc.nextLine();
		
		//uses compareTo() method to find where string1 comes alphabetically in relation to string 2
		order = string1.compareTo(string2);
		
		//outputs an appropriate message based on what order is
		if (order < -1) {
			System.out.println(string1 + " is before " + string2);
		}
		else if (order == 0) {
			System.out.println(string1 + " is the same as " + string2);
		}
		else if (order > 1) {
			System.out.println(string1 + " is after " + string2);
		}

	}
}