/*
	File Name: FractionAdd.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 25, 2013
	Description: The program calculates the following:
	 				 sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N
					 The user enters N, which is an integer
*/

   import java.util.*;

   public class FractionAdd {
      public static void main(String[] args) {
      
      //variable declaration
      //numerator is double so that real division is performed
         Scanner sc = new Scanner(System.in);
         int denominator;
         double sum = 0;
         final double NUMERATOR = 1.0;
      
      //gets the denominator
         System.out.print("Enter N: ");
         denominator = sc.nextInt();
      
      //makes sure denominator is greater than 1
         while (denominator <= 0) {
            System.out.println("Invalid. N must be at least 1");
            System.out.print("Enter N: ");
            denominator = sc.nextInt();
         }
      
      //adds the fractions together
      //subtracts one from denominator each loop
      //program adds the fraction in the opposite direction of the example question
         while (denominator != 0) {
            sum = sum + (NUMERATOR / denominator);
            denominator--;
         }
      
      //outputs the total sum
         System.out.println("Sum is: " + sum);
      }
   }
