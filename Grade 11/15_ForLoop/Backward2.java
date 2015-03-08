/*
	File Name: Backward2.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 26, 2013
	Description: This program counts down from by 5's from 100 to a 
					 number input by the user, between 100 and 50
*/

   import java.util.*;

    public class Backward2 {
       public static void main(String[] args){
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int stopCount;
      
      //gets what number to stop the count at from the user
         System.out.print("Enter a number between 100 and 50: ");
         stopCount = sc.nextInt();
      
      //outputs the differences
      //stops when the counter is greater than the inputted number
         for (int i = 100; i >= stopCount; i = i - 5) {
            System.out.println(i);
         }
      }
   }