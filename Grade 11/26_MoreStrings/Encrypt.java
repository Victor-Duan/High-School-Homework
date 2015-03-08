/*
	File Name: Encrypt.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description: This program 
*/

import java.util.*;

public class Encrypt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userEntry;
		String[] separateWords;
		char temp;
		final String SPACE = " ";
		
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		
		separateWords = userEntry.split(SPACE);
		
// 		for (int i = 0; i < separateWords.length; i++) {
// 		
// 			System.out.print(separateWords[i].charAt(separateWords[i].length() - 1)); 
// 			
// 			for (int j = 1; j < separateWords[i].length() - 1; j++) {
// 				System.out.print(separateWords[i].charAt(j));
// 			}
// 			
// 			System.out.print(separateWords[i].charAt(0));
// 			System.out.print(SPACE);
// 		}

		for (int i = 0; i < separateWords.length; i++) {
			
			
			for (int j = 0; j < separateWords[i].length(); j++) {
				System.out.print(separate
			}
		}	
			
	}
}