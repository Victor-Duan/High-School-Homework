/*
	File Name: Pass.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 6, 2013
	Description: The program outputs a math question and asks the user to input the answer
					 An appropriate output will state whether the answer is right or wrong
*/

   import java.util.*;

   public class Pass {
      public static void main(String[] args){
      
      // variable declaration
         Scanner sc = new Scanner(System.in);
         double inputAnswer;
         final int RIGHT_ANSWER = 45;
      
      //outputs the question and gets the user's answer
         System.out.print("What is 41 + 4 ? ");
         inputAnswer = sc.nextInt();
      
      //checks to see if the user's answer is right or not
         if (inputAnswer == RIGHT_ANSWER) {
            System.out.println("Correct");
         } 
         else {
            System.out.println("Incorrect");
         }
      
      
      }
   }