/*
	File Name: Half.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 1, 2013
	Description:The program gets a string from the user and "breaks" it into two parts
					The two halves are then printed seperately
*/

import java.util.*;

public class Half {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		String userEntry;
		
		//gets string from the user
		System.out.print("Enter a string: ");
		userEntry = sc.nextLine();
		
		//splits the string into half
		//the first section needs 2 bounds, so that it stops halfway
		//the other section only needs one because it goes from the specified point to the end of the string
		System.out.println(userEntry.substring(0,userEntry.length()/2));
		System.out.println(userEntry.substring(userEntry.length()/2));
	}
}