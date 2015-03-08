/*
	File Name: CountChar1.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 21, 2013
	Description:The program lets users enter in positive integers until -1 is entered
					the program then outputs the number of positive integers
*/

   import java.util.*;

   public class CountChar1 {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int userNum;
         int counter = 0;
         final int EXIT = -1;
      
      //gets the numbers from user
      //if the number is positive, the counter goes up one
      //exits once -1 is entered
         do {
            System.out.print("Enter a positive integer (0 is not a positive integer): ");
            userNum = sc.nextInt();
            if (userNum >= 1) {
               counter++;
            }
         } while (userNum != EXIT);
      
      //outputs the number of positive integers entered
         System.out.println("The number of positive integers you entered was: " + counter);
      }
   }