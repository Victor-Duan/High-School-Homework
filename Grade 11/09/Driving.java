/*
	File Name: Driving.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 7, 2013
	Description: the program displays an appropriate message pertaining to 
					 whether the unit can drive or not based on the input age
*/

	import java.util.*;
	
	public class Driving {
		public static void main(String[] args) {
			
			//variable declaration
			Scanner sc = new Scanner(System.in);
			int age;
			final int YOUNGEST = 18;
			final int OLDEST = 75;
			
			//gathers the user's age
			System.out.print("Enter your age: ");
			age = sc.nextInt();
			
			//checks to see if the user's age is suitable for driving
			if ( age >= YOUNGEST && age <= OLDEST){
				System.out.println(age + ". Age OK. Have you got a driver's licence?");
			}
			else if (age < YOUNGEST) {
				System.out.println(age + ". Too young to drive");
			}
			else {
				System.out.println( age + ". Sorry you are over the legal age limit for driving");
			}
			
		}
	}