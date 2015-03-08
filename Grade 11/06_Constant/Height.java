/* Victor Duan
   ICS3U1
   Question 6.2
   February 19, 2013
	This program asks the user to enter their height in inches
	The program then outputs their height in cm
*/

import java.util.*;

public class Height{
	public static void main(String[] args){
		//variable/cpnstant declaration
		Scanner sc = new Scanner(System.in);
		final double INCHES_TO_CM = 2.54;
		double heightInches, heightCm;
		
		//gathering input
		System.out.print ("Enter your height in inches: ");
		heightInches = sc.nextDouble();
		//conversion calculation
		heightCm = INCHES_TO_CM * heightInches;
		
		//final output
		System.out.println("You are " + heightCm + "cm tall");

	}
}