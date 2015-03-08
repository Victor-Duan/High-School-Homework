/*
	File Name: Quiz.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 19, 2013
	Description: The program outputs a multiple choice question for the user to answer
					 The program then outputs a statement based on the user's answer
*/

   import java.util.*;

   public class Quiz {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int answer;
      
      //constants for case structure
      //represent the 5 different answers
         final int A1 = 1, A2 = 2, A3 = 3, A4 = 4, A5 = 5;
      
      //outputs the question and choices to user
         System.out.println("The keyword to start case structure in Java is:\n");
         System.out.println("1) case");
         System.out.println("2) structure");
         System.out.println("3) switch");
         System.out.println("4) if");
         System.out.println("5) break");
      
      //gets the user's answer
         System.out.print("\nYour answer (please enter the number): ");
         answer = sc.nextInt();
      
      //outputs a message depending on user's input
         switch (answer) {
            case A1:
               System.out.println("\nWrong programming language");
               break;
            case A2:
               System.out.println("\nNot even close");
               break;
            case A3:
               System.out.println("\nRight");
               break;
            case A4:
               System.out.println("\nIt is selection, but no");
               break;
            case A5:
               System.out.println("\nstart, not end");
               break;
         } //ends case structure
      }//ends main method
   }