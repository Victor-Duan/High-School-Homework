/* 
	SevenTwo.java
	Name: Victor Duan
   Class: ICS3U1
   Question: Question 7.2
   Date: February 20, 2013
	Description: This program asks the user to input five marks as integers, then outputs the average of them
*/

	import java.util.*;
	
	public class SevenTwo {
		public static void main(String[] args) {
			
			//variable declaration
			Scanner sc = new Scanner(System.in);
			int g1,g2,g3,g4,g5;
			double avg;
			
			//gathers the 5 marks needed for the calculations
			System.out.print("Enter in the first mark, to the nearest whole number :");
			g1 = sc.nextInt();
			System.out.print("Enter in the second mark, to the nearest whole number :");
			g2 = sc.nextInt();
			System.out.print("Enter in the third mark, to the nearest whole number :");
			g3 = sc.nextInt();
			System.out.print("Enter in the fourth mark, to the nearest whole number :");
			g4 = sc.nextInt();
			System.out.print("Enter in the fifth mark, to the nearest whole number :");
			g5 = sc.nextInt();
			
			//calculates the average mark. Real division is done at this point
			avg = (double)(g1 + g2 + g3 + g4 + g5) / 5;
			
			//outputs the average as an integer.
			//Explicit casting from double to int to fulfill question requirements 
			System.out.println("Your average is: " + (int)avg);
		}
	}
