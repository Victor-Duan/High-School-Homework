/* Victor Duan
   ICS3U1
   Question 6.3
   February 19, 2013
	This program asks the user to input an amount of money in USD
	The program then outputs the amount into CAD
*/

import java.util.*;

public class Currency {
	public static void main(String[] args){
		//variable/constant declaration
		Scanner sc = new Scanner(System.in);
		final double USD_TO_CAD = 1.8;
		double amountUSD, amountCAD;
		
		//input gathering
		System.out.print("Enter the amount of money in USD: ");
		amountUSD = sc.nextDouble();
		//conversion calculation
		amountCAD = amountUSD * USD_TO_CAD;
		
		//final output
		System.out.println("Your amount in CAD is $" + amountCAD);
	}
}