/*
	File Name: AddDigits.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 3, 2013
	Description:This program outputs the sum of each digit of a number
*/

import java.util.*;

public class AddDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userEntry;
		int totalSum = 0;
		final char ZERO_REFERENCE = '0';
		
		System.out.print("Enter a number: ");
		userEntry = sc.nextLine();
		
		for (int i = 0; i < userEntry.length(); i++) {
			totalSum = totalSum + userEntry.charAt(i) - ZERO_REFERENCE;
		}
		
		System.out.println(totalSum);
	}
}