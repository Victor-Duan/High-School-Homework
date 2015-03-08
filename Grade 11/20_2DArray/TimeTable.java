/*
	File Name: TimeTable.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 22, 2013
	Description: This program outputs a 12x12 timetable with appropriate headers
*/

import java.util.*;

public class TimeTable {
	public static void main(String[] args) {
		
		//variable declaration
		//the first index represents the row, the second index represents the column
		final int MAX = 12;
		int timeTable[][] = new int [MAX][MAX];
		
		//calculates the value of the row and column values multiplied together
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				timeTable[i][j] = (i+1) * (j+1);
			}
		}
		
		//prints out the header row
		System.out.print("\t");
		for (int i = 0; i < MAX; i++) {
			System.out.print((i+1) + "\t");
		}
		
		//starts new line for spacing
		System.out.println("");
		
		//prints out value that is being multiplied by the value of the column
		//then prints out the products in one row
		for (int i = 0; i < MAX; i++) {
			System.out.print(i+1);
			for (int j = 0; j < MAX; j++) {
				System.out.print("\t" + timeTable[i][j]);
			}
			System.out.println("");
		}

		
	}
}