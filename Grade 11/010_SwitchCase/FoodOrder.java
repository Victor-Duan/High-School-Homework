/*
	File Name: FoodOrder.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 19, 2013
	Description: The program displays a menu. The user enters in the number choice they want
					 The program then outputs the cost of that menu item
*/

   import java.util.*;

   public class FoodOrder {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int choiceNum;
      
      //the different menu options and costs
         final int C1 = 1, C2 = 2, C3 = 3, C4 = 4, C5 = 5;
         final double COST12 = 2.50;
         final double COST3 = 3.00;
         final double COST4 = 3.50;
         final double COST5 = 5.00;
      
      //outputs the menu for the user
         System.out.println("1) juice, muffin, coffee");
         System.out.println("2) cereal, toast, milk");
         System.out.println("3) egg, toast, coffee");
         System.out.println("4) banana, granola, milk");			
         System.out.println("5) grapefruit, bacon, eggs, coffee");
      
      //gets the user's item choice
         System.out.print("\nPlease enter in the number of your choice: ");
         choiceNum = sc.nextInt();
      
      //case structure to compare user choice
      //choice one and choice 2 have the same cost, so they share the same output
         switch (choiceNum) {
            case C1:
            case C2:
               System.out.println("Your meal is $" + COST12);
               break;
            case C3:
               System.out.println("Your meal is $" + COST3);
               break;
            case C4:
               System.out.println("Your meal is $" + COST4);
               break;
            case C5:
               System.out.println("Your meal is $" + COST5);
               break;
            default:
               System.out.println("Invalid input");
         }	
      }
   }