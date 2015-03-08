/*
	File Name: NumChart.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 28, 2013
	Description: This program asks the user to input two numbers, x and y
					 The program then outputs x rows of numbers from 1 to y
*/

import java.util.*;

public class NumChart {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc  = new Scanner(System.in);
		int xRows,yNum;
		
		//gathers the number of rows and maximum number
		System.out.print("Enter x: ");
		xRows = sc.nextInt();
		System.out.print("Enter y: ");
		yNum = sc.nextInt();
		
		//inside loop prints out a row of letters from 1 to yNum
		//outside loop prints x number of those rows
		for (int j = 0; j < xRows; j++){
			for (int i = 1; i <= yNum; i++){
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}