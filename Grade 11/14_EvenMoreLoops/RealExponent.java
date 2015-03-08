/*
	File Name: RealExponent.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 25, 2013
	Description:The program asks the user to enter in a base that is a floating point number
					as well as an exponent
					If the exponent if positive, the program outputs what it equals to
					If negative, the program tells the user the exponent must be positive
*/

   import java.util.*;

    public class RealExponent {
       public static void main(String[] args) {
      
      //variable declaration
      //answer is 1 so that when multiplying by base, it will always equal the base
         Scanner sc = new Scanner(System.in);
         int counter = 0;
         double base, exponent;
         double answer = 1;
      
      //gathers base and exponent from the user
         System.out.print("Enter X: ");
         base = sc.nextDouble();
         System.out.print("Enter N: ");
         exponent = sc.nextDouble();
      
      //makes sure exponent is not negative or 0
         if (exponent < 1) {
            System.out.println("N must be a positive integer");
            System.out.print("Enter N: ");
            exponent = sc.nextDouble();
         } 
      
      //calculates the final answer
      //so long as the counter is less than the exponent
         while (counter < exponent) {
            answer = answer * base;
            counter++;
         }
      
      //final output for the answer
         System.out.println(base + " raised to the power " + exponent + "is: " + answer);
      }
   }