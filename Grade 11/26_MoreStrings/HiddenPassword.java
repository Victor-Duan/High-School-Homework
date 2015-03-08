/*
	File Name: HiddenPassword.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description: The program gets a string from the user, and a character that every symbol will be replaced by
					 The program then outputs the new message
*/

import java.util.*;

public class HiddenPassword {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userEntry;
		char replacement;
		final char SPACE = ' ';
		
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		System.out.print("Enter a character: ");
		replacement = sc.nextLine().charAt(0);
		
		for (int i = 0; i < userEntry.length(); i++) {
			
			if (userEntry.charAt(i) == SPACE) {
				System.out.print(SPACE);
			}
			else {
				System.out.print(replacement);
			}
		}
	}
}