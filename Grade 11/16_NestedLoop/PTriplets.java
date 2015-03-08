/*
	File Name: PTriplets.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 28, 2013
	Description: The program asks the user to enter the largest side of a triangle;
					 The program then outputs all possible combinations of legs that will 
					 satisfy the Pythagoeran theorum
*/

   import java.util.*;

   public class PTriplets {
      public static void main(String[] args) {
      
      //variable declaration
      //c is the hypotenuse of the triangle, like in the formula 
         Scanner sc = new Scanner(System.in);
         int userNum;
         double c;
      
      //gets the largest possible value for the legs and hypotenuse
         System.out.print("Enter a positive integer: ");
         userNum = sc.nextInt();
      
      //each counter represents a leg of the triangle
         for (int i = 1; i < userNum; i++) {
            for (int j = 2; j < userNum; j++) {
            
            //finds the hypotenuse of the triangle
            //if c is an integer, then it is a pythagorean triplet
            //inside if makes sure a < b
               c = Math.sqrt(i*i + j*j);
               if (c % 1 == 0 && c <=userNum) {
                  if (i < j) {
                     System.out.println(i + "^2 + " + j + "^2 = " + (int)c + "^2");
                  }//ends nested if structure
               }//ends outer if structure
            }//ends nested for loop
         }//ends outer for loop
      }
   }
