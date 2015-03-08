/*
	File Name: Salary.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 6, 2013
	Description: The program asks the user to input the nuber of sales made
					 The program then outputs the user's salary depending on that
*/

import java.util.*;

public class Salary {
	public static void main(String[] args) {
	
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int salesNo;
		double salary;
		final int BASE_SALARY = 1000;
		final int PERCENTAGE = 100;
		
		//gathers the number of sales made
		System.out.print("Enter in the number of sales: ");
		salesNo = sc.nextInt();
		
		//checks to see if more than 10 sales were made
		//then calculates the appropriate salary
		//PERCENTAGE explicitly casted from int to double to perform real division
		if (salesNo > 10) {
			salary = BASE_SALARY * (1 + salesNo / (double) PERCENTAGE);
			System.out.println("$" + salary + " is the total salary");
		}
		else {
			System.out.println("$" + BASE_SALARY +" is the total salary");
		}
	}
}