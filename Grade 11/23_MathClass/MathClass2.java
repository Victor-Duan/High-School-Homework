/*
	File Name: MathClass2.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 30, 2013
	Description:This program asks the user to enter a base and an exponent, and outputs the power
*/

   import java.util.*;
   import java.lang.Math;

    public class MathClass2 {
       public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         double exponent, base, answer;
      
      //Gets the base and the exponent from the user
         System.out.print("Enter the base: ");
         base = sc.nextDouble();
         System.out.print("Enter the exponent: ");
         exponent = sc.nextDouble();
      
      //calculates and outputs the answer using the Math.pow method
         answer = Math.pow(base,exponent);
         System.out.println(base + " to the power of " + exponent + " is equal to " + answer);
      }
   }