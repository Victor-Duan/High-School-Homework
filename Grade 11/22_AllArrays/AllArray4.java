/*
	File Name: AllArray4.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 25, 2013
	Description:The program has a 2d array which keeps track of the marks of each student
					The program will
					a.	Ask user to enter the number of students and the number of tests
					b.	Ask user to enter each of the test marks for all students
					c.	Calculate and output the average of each student
					d.	Output the student (represented by the number) with the highest average
					e.	List the students whose average is higher than the class average
*/

import java.util.*;

public class AllArray4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int students, tests;
		double[] average;
		double[][] marks;
		
		//a.	Ask user to enter the number of students and the number of tests
		System.out.print("Enter number of students: ");
		students = sc.nextInt();
		System.out.print("Enter the number of tests: ");
		tests = sc.nextInt();
		
		marks = new double [students][tests];
		average = new double [students];
		
		//b.	Ask user to enter each of the test marks for all students
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < tests; j++) {
				System.out.print("Enter mark for test " + (j+1) + " for student " + (i+1) + ": ");
				marks[i][j] = sc.nextDouble();
			}
		}
		
		//c.	Calculate and output the average of each student
		
		for (int i = 0; i < students; i++) {
			average[i] = 0;
			for (int j = 0; j < tests; j++) {
				average[i] += marks[i][j];
			}
			average[i] = average[i] / tests;
			System.out.println("Student " + i + " got an average of: " + average[i]);	
		}
		
		//d.	Output the student (represented by the number) with the highest average
		
		int stuHAvg = 0;
		
		for (int i = 1; i < students; i++) {
			if (average[i] > average[stuHAvg]) {
				stuHAvg = i;
			}
		}
		
		System.out.println("Student " + stuHAvg + " has the highest average");
		
		//e.	List the students whose average is higher than the class average

		double classAvg = 0;
		
		for (int i = 0; i < students; i++) {
			classAvg += average[i];
		}
		
		classAvg = classAvg / students;
		
		for (int i = 0; i < students; i++) {
			if (average[i] > classAvg) {
				System.out.println("Student " + i + " has an average higher than the class average.");
			}
		}
	}
}
