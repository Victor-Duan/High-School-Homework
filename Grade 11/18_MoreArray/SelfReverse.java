/*
	File Name: SelfReverse.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 12, 2013
	Description: This program has an array with a capacity which is entered by the user
				    The user enters numbers to fill the array.
					 The array then reverses the values of the indexes
*/

   import java.util.*;

   public class SelfReverse {
      public static void main(String[] args) {
      
		//variable declaration
		//numberStorage is used to perform something like the following example
		//in an array with capacity 5, numberStorage will store the value at index 0
		//so that after index 0's value is replaced with index 4's, index 4 can be changed too
         Scanner sc = new Scanner(System.in);
         int[] userInput;
         int entryNo;
         int numberStorage;
      
		//gets the capacity of the array from the user
         System.out.print("Enter the number of values you want to store: ");
         entryNo = sc.nextInt();
         userInput = new int [entryNo];
      
		//gets the values to be stored in the index
         for (int i = 0; i < entryNo; i++) {
            System.out.print("Enter a number: ");
            userInput[i] = sc.nextInt();
         }
      
		//arranges the numbers of array in revese order
		//entryNo is divided by 2 since one run of the loop changes 2 values
		//the index number of the vales to be swapped always equals to capacity minus 1
         for (int i = 0; i < entryNo/2; i++) {
            numberStorage = userInput[i];
            userInput[i] = userInput[entryNo - 1 - i];
            userInput[entryNo - 1 - i] = numberStorage;
         }
      
         for (int i = 0; i < entryNo; i++) {
            System.out.println(userInput[i]);
         }
      
      }
   }