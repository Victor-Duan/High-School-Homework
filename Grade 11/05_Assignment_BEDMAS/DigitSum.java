/* Victor Duan
   ICS3U1
   Question 5.10
   February 12, 2013
   This program asks the user to input a 3 digit number, then outputs the digit sum and the number
*/

import java.util.*;

public class DigitSum {
	public static void main(String[] args){
		int threeDigit, hunDigit, tenDigit, oneDigit, digitSum; //variable declaration
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a three digit number: ");
		threeDigit = sc.nextInt();
		hunDigit = threeDigit/100; //finds how many times the number is completely divisble by 100
		tenDigit = threeDigit%100/10; //finds the value of the tens and ones digits together, then singles out the digit value of the tens digit
		oneDigit = threeDigit%100%10;
		digitSum = hunDigit + tenDigit + oneDigit;
		System.out.println("Your number was: " + threeDigit); //final output of 3 digit number and digit sum
		System.out.println("The digit sum of your numbers was: " + digitSum);
	}
}