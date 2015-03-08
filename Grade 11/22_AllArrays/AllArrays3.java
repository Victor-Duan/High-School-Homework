/*
	File Name: AllArrays3.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 24, 2013
	Description:The program has a 2D array with variable lengths
					The program outputs the sum of all the arrays
*/

import java.util.*;

public class AllArrays3 {
	public static void main(String[] args) {
	
		//creates an array with variable lengths 
		int[][] data = {{3, 2, 5},
		{1, 4, 4, 8, 13},
		{9, 1, 0, 2},
		{0, 2, 6, 4, -1, -8}};
		
		int sum = 0;
		
		//uses data[i].length because the amount of times the inner loop has to run will 
		//change with each value of i
		for(int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				sum += data[i][j];
			}
		}
		
		//final output of the sum of the elements
		System.out.println(sum);
	}
}