/*
	File Name: ShiftUp.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 19, 2013
	Description: The program asks the user to enter in 20 integers into an array
					 The program then shifts the values up by 1 index
*/

   import java.util.*;

   public class ShiftUp {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int[] userNums;
         int firstValue;
         final int VALUETOTAL = 20;
      
      //creates the array with a capacity of 20
         userNums = new int [VALUETOTAL];
      
      //gets the 20 integers from the user
         for (int i = 0; i < VALUETOTAL; i++) {
            System.out.print("Enter an integer: ");
            userNums[i] = sc.nextInt();
         }
      
      //stores the value of the first number the user input
         firstValue = userNums[0];
      
      //shifts the values of the array up by 1 index
      //does not change the value of the 19th (last) index
         for (int i = 0; i < VALUETOTAL - 1; i++) {
            userNums[i] = userNums[i+1];
         }
      
      //changes the value of the last index to the value of the first oen
         userNums[VALUETOTAL - 1] = firstValue;
      
      //prints out the array with the shifted values
         for (int i = 0; i < VALUETOTAL; i++) {
            System.out.println(userNums[i]);
         }
      
      }
   }