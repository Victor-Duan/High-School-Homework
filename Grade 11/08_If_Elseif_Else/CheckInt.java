/*
	File Name: CheckInt.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 6, 2013
	Description: The program asks the user to input an integer 
					 The program then outputs whether the number is positive or negative,
					 even or odd, and if it is a multiple of 7 or not
*/

   import java.util.*;

   public class CheckInt {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int userInt;
         final int SEVEN_FACTOR = 7;
      
      //gathers the integer to be categorized
         System.out.print("Enter an integer: ");
         userInt = sc.nextInt();
      
      //checks if integer is positive or negative
         if (userInt == 0 ){
            System.out.print(userInt + " is neither positive or negative\n");
         }
         else if (userInt > 0) {
            System.out.println(userInt + " is positive");
         } 
         else {
            System.out.println(userInt + " is negative");
         }
      
      //checks if number is odd or even
         if (userInt == 0) {
            System.out.println(userInt + " is neither odd or even");
         }
         else if (userInt % 2 == 0) {
            System.out.println(userInt + " is even");
         } 
         else {
            System.out.println(userInt + " is odd");
         }
      
      //checks if number is multiple of 7 or not
         if (userInt % 7 == 0){
            System.out.println(userInt + " is a multiple of 7");
         }
         else {
            System.out.println(userInt + " is not a multiple of 7");
         }
      }
   }