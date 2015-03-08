/* Victor Duan
   ICS3U1
   Question 6.1
   February 19, 2013
	This program asks the user to input the cost of an item
	The program then outputs the amount of GST and PST to pay, as well as the final cost 
*/

import java.util.*;

public class Cost {
	public static void main(String[] args){
	
		//variable declaration
		Scanner sc = new Scanner(System.in);
		final double GST = 0.05;
		final double PST = 0.08;
		double cost, total, amountGST, amountPST;
		
		//input gathering
		System.out.print ("How much did your product cost in dollars? :");
		cost = sc.nextDouble();
		
		//calculations
		amountGST = cost * GST;
		amountPST = cost * PST;
		total = cost + amountGST + amountPST;
		
		//final output
		System.out.println ("You must pay $" + amountGST + " in GST");
		System.out.println ("You must pay $" + amountPST + " in PST");
		System.out.println ("You must pay $" + total + " total");

		
	}
}