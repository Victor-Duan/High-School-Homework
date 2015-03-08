/*
	File Name: Count4.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 20, 2013
	Description: This program counts from one number to another, both which are inputted
					 by the user
*/

import java.util.*;

public class Count4 {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		//gathers the two numbers from user
		System.out.print("Enter in an integer: ");
		a = sc.nextInt();
		System.out.print("Enter in a second integer: ");
		b = sc.nextInt();
		
		//counts up is a is less than b
		if (a < b){
			while (a <= b){
				System.out.println(a);
				a++;
			}
		}//ends if structure
		
		//counts down if a is greater than b
		else {
			while (a >= b) {
				System.out.println(a);
				a = a - 1;
			}
		}//end else structure
	}
}