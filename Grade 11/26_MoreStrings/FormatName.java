/*
	File Name: FormatName.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description: This program asks the user to enter their first name and last name seperately
					 The program then outputs their name in the form lastname, firstinitial
*/

import java.util.*;

public class FormatName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstName, lastName, newForm;
		
		System.out.print("Enter first name: ");
		firstName = sc.nextLine();
		System.out.print("Enter last name: ");
		lastName = sc.nextLine();
		
		newForm = lastName + ", " + firstName.charAt(0) + ".";
		
		System.out.println(newForm);
		
	}
}