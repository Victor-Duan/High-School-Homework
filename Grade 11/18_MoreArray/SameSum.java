/*
	File Name: SameSum.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 12, 2013
	Description: The program has two arrays, each size 10.
					 The first array is filled with values from the user, and the second array
					 stores values so that when the two arrays are added together, the sum is 25
*/

   import java.util.*;

    public class SameSum {
       public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
      
         int[] userEntry;
         int[] addMake25;
         final int ENTRYNO = 10;
         final int FINALSUM = 25;
      
      //makes each array have a capacity of 10
         userEntry = new int [ENTRYNO];
         addMake25 = new int [ENTRYNO];
      
      //gets the 10 numbers from the user
         for (int i = 0; i < ENTRYNO; i++) {
            System.out.print("Enter a number: ");
            userEntry[i] = sc.nextInt();
         }
      
      //finds the value of the number needed to create a sum of 25
      //prints out the addition statment as well
         for (int i = 0; i < ENTRYNO; i++) {
            addMake25[i] = FINALSUM - userEntry[i];
            System.out.println(userEntry[i] + " + " + addMake25[i] + " = " + FINALSUM);	
         }
      
      }
   }