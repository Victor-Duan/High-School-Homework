/*
	File Name: AddUnicodes.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description: The user enters a string and the program outputs the sum of the unicodes of each letter
*/

import java.util.*;

public class AddUnicodes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userEntry;
		int codeSum = 0;
		
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		
		for (int i = 0; i < userEntry.length(); i++) {
			codeSum = codeSum + userEntry.charAt(i);
		}
		
		System.out.println(codeSum);
	}
}