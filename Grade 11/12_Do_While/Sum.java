/*
	File Name: Sum.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 21, 2013
	Description: This program allows users to enter in positive integers until a negative is entered
					 The program then outputs the sum of the positive integers
*/

   import java.util.*;

   public class Sum {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int userNum;
         int totalSum = 0;
      
         do {
            System.out.print("Enter a positive integer: ");
            userNum = sc.nextInt();
         
            if (userNum > 0){
               totalSum = totalSum + userNum;
            }//ends if structure
         	
         } while (!(userNum <=0));
         
      	System.out.println("The total sum of your positive integers is: " + totalSum);
      }
   }