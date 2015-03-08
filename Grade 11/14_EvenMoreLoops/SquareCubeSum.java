/*
	File Name: SquareCubeSum.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 25, 2013
	Description:The user enters an integer N
				   The program then enters the sum of squares and cubes of the squares
					of the integers leading to N
*/

import java.util.*;

public class SquareCubeSum {
	public static void main(String[] args) {
		
		//variable declaration
		//sums are double because of the user of Math.pow
		Scanner sc = new Scanner(System.in);
		int base;
		double squareSum = 0;
		double cubeSum = 0;
		final int SQUARE = 2;
		final int CUBE = 3;
		
		//gets base (N)
		System.out.print("Upper Limit: ");
		base = sc.nextInt();
		
		//makes sure base is at least 1
		while (base <= 0){
			System.out.println("Invalid. Value must be at least 1");
			System.out.print("Upper Limit: ");
			base = sc.nextInt();
		}
		
		//adds sum of square and cube sum
		//exits once base becomes 0
		while (base != 0) {
			squareSum = squareSum + Math.pow(base,SQUARE);
			cubeSum = cubeSum + Math.pow(base, CUBE);
			base--;
		}
		
		//outputs final sum
		System.out.println("The sum of Squares is " + (int)squareSum);
		System.out.println("The sum of Cubes is " + (int)cubeSum);
	}
}