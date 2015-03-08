/*
	File Name: Continue.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 22, 2013
	Description: This program forces a user to answer the quesiton "Continue?" with 
					 either y or n
*/

   import java.util.*;

    public class Continue {
       public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         char userInput;
         final char YES = 'y';
         final char NO = 'n';
      
      //gets user's character
      //checks if letter is equal to y or n
      //if it does, one statement will be false, making the whole statement false
         do {
            System.out.println ("Continue? ");
            userInput = sc.nextLine().charAt(0);
         }while (userInput != YES && userInput != NO);
      }
   }