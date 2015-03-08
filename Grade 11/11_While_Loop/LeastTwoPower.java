/*
	File Name: LeastTwoPower.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 21, 2013
	Description: This program asks the user to enter a positive integer, and 
					 outputs the smaller power of two that is greater than or equal to the integer
*/

   import java.util.*;

   public class LeastTwoPower {
      public static void main(String[] args) {
      
      //variable declaration
      //twoPower assigned negative value because input number is always positive
      //therefore making the while statement true upon first entry
         Scanner sc = new Scanner(System.in);
         int userNum;
         double twoPower = -1;
         int exponent = 0;
         final int TWO = 2;
      
      //gathers the user's number
         System.out.println("Enter a positive integer: ");
         userNum = sc.nextInt();
      
      //adds one to exponent if the exponent is too small
         while (userNum > twoPower) {
            twoPower = Math.pow(TWO, exponent);
            exponent++;	
         }//ends while loop
      	
         System.out.println((int)twoPower);
      }
   }