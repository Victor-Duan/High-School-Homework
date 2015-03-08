/*
	File Name: StringLen.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 1, 2013
	Description: The program outputs the length of a string entered by the user
*/

import java.util.*;

public class StringLen {
	public static void main(String[] args){
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		String userEntry;
		
		//gets the string from the user
		System.out.print("Enter some characters: ");
		userEntry = sc.nextLine();
		
		//outputs length using length() method
		System.out.println("Length of entry: " + userEntry.length());
	}
}