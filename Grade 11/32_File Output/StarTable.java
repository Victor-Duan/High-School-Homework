/*
	File Name: StarTable.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 24, 2013
	Description: 
*/

import java.io.*;
import java.util.*;

public class StarTable {
	public static void main(String[] args) {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("star.txt"));
			Scanner sc = new Scanner(System.in);
			char[][] starTable;
			int row, column;
			final char STAR = '*';
			
			System.out.print("Enter length of row: ");
			row = sc.nextInt();
			System.out.print("Enter length of column: ");
			column = sc.nextInt();
			
			starTable  = new char [row][column];
			
			for (int i = 0; i < row; i ++) {
				for (int j = 0; j < column; j++) {
					starTable[i][j] = STAR;
					out.write(starTable[i][j]);
				}
				out.newLine();
			}
			out.close();
		}
		catch (IOException iox) {
			System.out.println("Error");
		}
	}
}