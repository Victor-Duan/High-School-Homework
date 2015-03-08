/*
	File Name: CountChar2.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 21, 2013
	Description: The program lets users enter in positive integers until a negative number is entered
					the program then outputs the number of positive integers
*/

import java.util.*;

   public class CountChar2 {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int userNum;
         int counter = 0;
         final int EXIT = -1;
      
      //gets the numbers from user
      //if the number is positive, the counter goes up one
      //exits once a negative is entered
      //special case for 0 because it is neither positive or negative
         do {
            System.out.print("Enter a positive integer (0 is neither positive or negative): ");
            userNum = sc.nextInt();
            if (userNum >= 1) {
               counter++;
            }
         } while (userNum > EXIT && userNum != 0);
      
      //outputs the number of positive integers entered
         System.out.println("The number of positive integers you entered was: " + counter);
      }
   }