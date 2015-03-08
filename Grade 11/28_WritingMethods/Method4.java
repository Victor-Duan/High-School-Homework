/*
	File Name: Method4.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 14, 2013
	Description:
*/

import java.util.*;

public class Method4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum;
		boolean divisible;
		
		System.out.print("enter first num: ");
		firstNum = sc.nextInt();
		System.out.print("Enter second num: ");
		secondNum = sc.nextInt();
		System.out.print(evenlyDistributed(firstNum, secondNum));
	}
	
	public static boolean evenlyDistributed(int i1, int i2) {
		
		boolean even;
		
		if (i1 == 0 || i2 == 0 || i1 % i2 != 0) {
			even = false;
		}
		else {
			even = true;
		}
		
		return(even);
	}
}