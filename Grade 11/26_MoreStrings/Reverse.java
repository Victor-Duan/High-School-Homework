/*
	File Name: Reverse.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description:This program outputs the reverse of a string that the user enters
*/

import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		String userEntry;
		
		//gets the string from the user
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		
		//the for loop prints out each character one at a time
		//starts with the last character and goes backwards
		for (int i = 0; i < userEntry.length(); i++) {
			System.out.print(userEntry.charAt(userEntry.length() - 1 - i));
		}
	}
}