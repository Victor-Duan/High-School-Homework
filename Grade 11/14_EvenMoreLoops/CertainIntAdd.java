/*
	File Name: CertainIntAdd.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 25, 2013
	Description: The user enters the number of integers they want to add
					 The user then enters that number of integers, and the program outputs their sum
*/

   import java.util.*;

   public class CertainIntAdd {
      public static void main(String[] args) {
      
      //variable declaration
      //sum is initialized as 0 so that it can be added to itself
         Scanner sc = new Scanner(System.in);
         int totalAdd, addInt;
         int sum = 0;
      
      //gathers the number of ints to be added
         System.out.print("How many integers will be added? ");
         totalAdd = sc.nextInt();
      
      //makes sure that the number of ints to be added is at least 1
         while (totalAdd <= 0){
            System.out.println("Invalid, must add at least 1 integer");
            System.out.print("How many integers will be added? ");
            totalAdd = sc.nextInt();
         }
      
      //finds the total sum of the integers
      //subtracts one from number of ints to add each loop, exits when that num is 0
         while (totalAdd != 0) {
            System.out.print("Enter an integer: ");
            addInt = sc.nextInt();
            sum = sum + addInt;
            totalAdd --;
         }
      
      //final output
         System.out.println("The sum is " + sum);
      }
   }