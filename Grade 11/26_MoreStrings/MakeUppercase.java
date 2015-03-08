/*
	File Name: MakeUppercase.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description: This program changes a string entered from the user to all upper case letters
*/

import java.util.*;

public class MakeUppercase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userEntry;
		
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		
		System.out.println(userEntry.toUpperCase());
	}
}