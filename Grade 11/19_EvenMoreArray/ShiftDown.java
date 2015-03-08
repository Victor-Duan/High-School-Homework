/*
	File Name: ShiftDown.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 19, 2013
	Description: The program asks the user to enter in 20 integers into an array
					 The program then shifts the values of the array down by 2 indeces
*/

   import java.util.*;

   public class ShiftDown {
      public static void main(String[] args){
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int nineteenthValue, twentiethValue;
         int[] userEntries;
         final int NUMENTRIES = 20;
      
      //creates an array with capacity 20
         userEntries = new int[NUMENTRIES];
      
      //gets the 20 integers from the user
         for (int i = 0; i < NUMENTRIES; i++) {
            System.out.print("Enter an integer: ");
            userEntries[i] = sc.nextInt();
         }
      
      //stores the values of the 2 largest indeces
         nineteenthValue = userEntries[18];
         twentiethValue = userEntries[19];
      
      //shifts the values of the array down by 2 indeces
      //the 0 and 1 indeces are not changed in this loop
         for (int i = NUMENTRIES - 1; i > NUMENTRIES - 19; i--) {
            userEntries[i] = userEntries[i-2];
         }
      
      //changes the values of the first 2 indeces to the last 2 indeces
         userEntries[0] = nineteenthValue;
         userEntries[1] = twentiethValue;
      
      //prints out the values of the new indeces
         for (int i = 0; i < NUMENTRIES; i++) {
            System.out.println(userEntries[i]);
         }
      }
   }