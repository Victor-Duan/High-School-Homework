/*
 File Name: BagTester.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 7, 2013
 Description: A class containing the main method, which uses the Binder and SchoolBag classes
*/

   import java.util.*;

   public class BagTester {
      public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         SchoolBag sb1;
         SchoolBag sb2;
         Binder b1, b2;
         String label1, colour1, label2, colour2, style;
         int sheets1, sheets2;
      	
         boolean exitState = false;
         String addOrRemove;
         final String CONFIRMADD = "add";
         final String CONFIRMREMOVE = "remove";
         final int EXITCONDITION = -1;
         int bagID, binderID, sheetsChange;
      
      //gets info about the first bag and its binders
         System.out.println("Enter info about bag 1: ");
         System.out.println("Style: ");
         style = sc.nextLine();
      
         System.out.println("Enter info about binder 1 in bag 1: ");
         System.out.println("Label: ");
         label1 = sc.nextLine();
         System.out.println("Colour: ");
         colour1 = sc.nextLine();
         System.out.println("Number of sheets in binder: ");
         sheets1 = sc.nextInt();
         sc.nextLine();
      
         System.out.println("Enter info about binder 2 in bag 1: ");
         System.out.println("Label: ");
         label2 = sc.nextLine();
         System.out.println("Colour: ");
         colour2 = sc.nextLine();
         System.out.println("Number of sheets in binder: ");
         sheets2 = sc.nextInt();
         sc.nextLine();
      
      //creates new SchoolBag object by passing in 2 pre-existing Binder objects
         b1 = new Binder(label1, colour1, sheets1);
         b2 = new Binder(label2, colour2, sheets2);
         sb1 = new SchoolBag(b1, b2, style);
      
      //gets info about the second bag and its contents
         System.out.println("Enter info about bag 2: ");
         System.out.println("Style: ");
         style = sc.nextLine();
      
         System.out.println("Enter info about binder 1 in bag 2: ");
         System.out.println("Label: ");
         label1 = sc.nextLine();
         System.out.println("Colour: ");
         colour1 = sc.nextLine();
         System.out.println("Number of sheets in binder: ");
         sheets1 = sc.nextInt();
         sc.nextLine();
      
         System.out.println("Enter info about binder 1 in bag 2: ");
         System.out.println("Label: ");
         label2 = sc.nextLine();
         System.out.println("Colour: ");
         colour2 = sc.nextLine();
         System.out.println("Number of sheets in binder: ");
         sheets2 = sc.nextInt();
         sc.nextLine();
      
      //creates a new SchoolBag object by passing in all required parameters
         sb2 = new SchoolBag(label1, colour1, sheets1,
                      label2, colour2, sheets2,
                      style);
      	
         do {
            System.out.println("Enter -1 in either of the two fields to exit the program");
            System.out.println("Enter which school bag you want to look at (1 or 2): ");
            bagID = sc.nextInt();
            System.out.println("Enter which binder you want to look at in this bag (1 or 2): ");
            binderID = sc.nextInt();
            if (bagID == EXITCONDITION || binderID == EXITCONDITION) {
               exitState = true;
            }
            if (!exitState) {
            	//adds or removes sheets from a specific binder
            	//outputs "error" messages if they enter numbers that dont match the cases
               if (bagID == 1) {
                  if (binderID == 1 || binderID == 2) {
                     System.out.println("Do you want to add or remove pages from this binder? :");
                     addOrRemove = sc.nextLine();
                     addOrRemove = addOrRemove.toLowerCase();
                  	
                     if (addOrRemove == CONFIRMADD) {
                        System.out.println("How many pages do you want to add? :");
                        sheetsChange = sc.nextInt();
                        sb1.addSheets(binderID, sheetsChange);
                     }
                     else if (addOrRemove == CONFIRMREMOVE) {
                        System.out.println("How many pages do you want to remove? :");
                        sheetsChange = sc.nextInt();
                        sb1.removeSheets(binderID, sheetsChange);
                     }
                     else {
                        System.out.println("Buddy. add or remove. Not what you entered");
                     }
                  }
                  else {
                     System.out.println("Buddy there are only 2 binders in the bag");
                  }
               	
               }
               else if (bagID == 2) {
                  if (binderID == 1 || binderID == 2) {
                     System.out.println("Do you want to add or remove pages from this binder? :");
                     addOrRemove = sc.nextLine();
                     addOrRemove = addOrRemove.toLowerCase();
                  	
                     if (addOrRemove == CONFIRMADD) {
                        System.out.println("How many pages do you want to add? :");
                        sheetsChange = sc.nextInt();
                        sb2.addSheets(binderID, sheetsChange);
                     }
                     else if (addOrRemove == CONFIRMREMOVE) {
                        System.out.println("How many pages do you want to remove? :");
                        sheetsChange = sc.nextInt();
                        sb2.removeSheets(binderID, sheetsChange);
                     }
                     else {
                        System.out.println("Buddy. add or remove. Not what you entered");
                     }
                  }
               }
               else {
                  System.out.println("Buddy, can you count? 1 or 2. Not what you entered");
               }
               
            }
         }while (!exitState);			 
      
         System.out.println(sb1);
         System.out.println(sb2);
      }
   }