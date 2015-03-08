/* Victor Duan
   ICS3U1
   Question 5.6
   February 12, 2013
   This program asks the user to type in their name, and outputs it with a short message
*/

import java.util.*;

public class Drop {
	public static void main(String[] args){
		double time; //variable declaration
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an amount of time less than 4.5 seconds: ");
		time = sc.nextDouble(); //user input
		//This program will not work as intended when a value greater than 4.5
		//Program will output a negative value in this situation, which does not make sense
		System.out.print("The height of the object at " + time + " is: " + (100-4.9*time*time) + "m"); //calculations
		
	}
}