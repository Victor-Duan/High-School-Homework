/*
	File Name: Star.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 28, 2013
	Description: This program asks the user to enter in the number of rows and number of columns
					 The program then outputs a start "sheet" with the given numbers
*/

   import java.util.*;

    public class Star {
       public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int row, column;
      
      //gets the row and column #s from the user
         System.out.print("Enter # of rows: ");
         row = sc.nextInt();
         System.out.print("Enter # of columns: ");
         column = sc.nextInt();
      
      //outside loop determines how many rows of stars
      //inside loop determines how many columns
         for (int j = 0; j < row; j++) {
            for (int i = 0; i < column; i++) {
               System.out.print("*");
            }
            System.out.println("");
         }
      }
   }