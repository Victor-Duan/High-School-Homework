/*
	File Name: StarTable.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 22, 2013
	Description: This program asks the user to enter the dimensions of the table
					 The program then outputs a table of stars
*/

import java.util.*;

public class StarTable {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int length, width;
		final char STAR = '*';
		char table[][];
		
		//gets the dimensions of the star table
		//creates a 2D array with those dimensions
		System.out.print("Enter the width of the table: ");
		width = sc.nextInt();
		System.out.print("Enter the length of the table: ");
		length = sc.nextInt();
		table = new char [width][length];
		
		//assigns every index of the array the star character
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				table[i][j] = STAR;
			}
		}
		
		//outputs the table
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
			System.out.print(table[i][j]);
			}
			System.out.println("");
		}
 
	}
}