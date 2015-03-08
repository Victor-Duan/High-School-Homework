/* Victor Duan
   ICS3U1
   Question 5.7
   February 12, 2013
   This program prompts the user to enter in a size of pizza, and outputs the appropriate cost
*/

import java.util.*;

public class PizzaCost {
	public static void main(String[] args){
		double pizzaSize; //variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the diameter of the pizza you want in inches: ");
		pizzaSize = sc.nextDouble(); //user input
		System.out.print("The cost of making the pizza is: $" + (0.05 * pizzaSize * pizzaSize + 1.75));//calculations
	}
}