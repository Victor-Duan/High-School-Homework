/* Victor Duan
   ICS3U1
   Question 5.5
   February 12, 2013
   This program asks the user to input 3 double values and outputs their average
*/

import java.util.*;

public class Average {
	public static void main(String[] args){
		double num1, num2, num3; //variable declaration
		Scanner sc = new Scanner (System.in);
		System.out.print("Input your first number: ");//input gathering
		num1 = sc.nextDouble();
		System.out.print("Input your second number: ");
		num2 = sc.nextDouble();
		System.out.print("Input your final number: ");
		num3 = sc.nextDouble();
		System.out.print("The average of your numbers is: " + ((num1 + num2 + num3)/3));//find average of marks
	}
}
