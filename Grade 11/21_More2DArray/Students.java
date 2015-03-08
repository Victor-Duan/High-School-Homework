/*
	File Name: Students.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 23, 2013
	Description: The program asks the user to enter 5 marks for each of the ten students
				    The program then finds the average of each student, finds the student with the highest average
					 and calculates the class average of each test
*/

import java.util.*;

public class Students {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int studentHighAvg;
		double highAvg, total;
		double[] averageStu;
		double[][] marks;
		final int STUDENTS = 10;
		final int TESTS = 5;
		
		//creates 2 arrays
		//one 1D array to store the average of each student
		//one 2D array to store the student's number and marks
		averageStu = new double [STUDENTS];
		marks = new double [STUDENTS][TESTS];
		
		//gets the marks for each student from the user
		for (int i = 0; i < STUDENTS; i++) {
			for (int j = 0; j < TESTS; j++) {
				System.out.print("Enter mark " + (j+1) + " for student " + (i+1) + ": ");
				marks[i][j] = sc.nextDouble(); 
			}
		}
		
		//calculates and stores each student's average
		for (int i = 0; i < STUDENTS; i++) {
			total = 0;
			for (int j = 0; j < TESTS; j++) {
				total += marks[i][j];
			}
			averageStu[i] = total / TESTS;
			System.out.println("student " + (i+1) + " average: " + averageStu[i]);
		}
		
		//determines which student has the highest average
		highAvg = averageStu[0];
		studentHighAvg = 1;
		
		for (int i = 1; i < STUDENTS; i++) {
			if (averageStu[i] > highAvg) {
				studentHighAvg = i + 1;
			}
		}
		System.out.println("Student " + (studentHighAvg) + " has the highest average");
		
		// calculates the average of each test
		for (int j = 0; j < TESTS; j++) {
			total = 0;
			for (int i = 0; i < STUDENTS; i++) {
				total += marks[i][j];
			}
			System.out.println("Average for test " + (j+1) + " is " + (total/STUDENTS));
		}
	}
}