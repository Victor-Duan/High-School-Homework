/*
	File Name: Guess.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 20, 2013
	Description: The program asks a user to guess a number form 1 to 20 until they 
					 guess correctly
*/

   import java.util.*;

    public class Guess {
       public static void main(String[] args) {
      	
			//variable declaration
         Scanner sc = new Scanner(System.in);
         int guess;
         final int ANSWER = 5;
         final int MIN = 1;
         final int MAX = 20;
      	
			//gathers the player's first guess from the user
         System.out.print("Guess the number between 1 and 20: ");
         guess = sc.nextInt();
      	
			//if first guess is correct, while loop will exit automatically
			//if not, loop will be run through
			//unique outputs for if the number guessed is outside requirements
         while (guess != ANSWER) {
            if (guess < MIN || guess > MAX) {
               System.out.print("Invalid. Guess between 1 and 20: ");
               guess = sc.nextInt();
            } 
            else {
               System.out.print("Incorrect. Guess the number between 1 and 20: ");
               guess = sc.nextInt();
            }
         }
      	//final output
         System.out.println("Correct");
      }
   }