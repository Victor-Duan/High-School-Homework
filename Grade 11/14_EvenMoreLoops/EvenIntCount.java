/*
	File Name: EvenIntCount.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 25, 2013
	Description: This program allows users to enter integers until a non-positive integer is entered
				    The program then outputs the number of even numbers
*/

   import java.util.*;

   public class EvenIntCount {
      public static void main(String[] args) {
      
      //variable declaration
      //if input mod EVENCHECK is 0, that means the number is divisible by two, therefore being even
      //MIN is 1 because 0 is not a positive integer
         Scanner sc = new Scanner(System.in);
         int input;
         int counter = 0;
         final int MIN = 1;
         final int EVENCHECK = 2;
      
      //gathers the first number
         System.out.print("Enter an integer: ");
         input = sc.nextInt();
      
      //runs so long as the integer is greater than 0
      //adds to counter if number is even
         while (input >= MIN) {
            if (input % 2 == 0){
               counter++;
            }
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
         }
      
      //final output
         System.out.println("You have entered " + counter + " even numbers");
      }
   }