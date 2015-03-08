/*
	File Name: Method3.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 14, 2013
	Description:
*/

import java.util.*;

public class Method3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstInt, secondInt, inclusiveTotal;
		
		System.out.print("Enter first integer: ");
		firstInt = sc.nextInt();
		System.out.print("Enter second integer: ");
		secondInt = sc.nextInt();
		inclusiveTotal = sumRange(firstInt, secondInt);
		System.out.println(inclusiveTotal);
	}
	
	public static int sumRange (int i1, int i2) {
		int total = 0;
		
		for (int i = i1 + 1; i < i2; i++) {
			total += i;
		}
		if (i2 < i1) {
			System.out.println("Error");
		}
		return (total);
	}
}