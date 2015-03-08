/*
	File Name: Month.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 19, 2013
	Description: This program asks the user to enter in the month by its corresponding number
					 The program then outputs the number of days in that month
*/

   import java.util.*;

   public class Month {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int userMonth;
      //constants used for case structure
      //represents the months
         final int M1 = 1, M2 = 2, M3 = 3, M4 = 4, M5 = 5, M6 = 6;
         final int M7 = 7, M8 = 8, M9 = 9, M10 = 10, M11 = 11, M12 = 12;
      
         final int MOSTDAYS = 31;
         final int MIDDLEDAYS = 30;
         final int FEB = 28;
      
      //explains concept to user
         System.out.println("1) January");
         System.out.println("2) February");
         System.out.println("...");
         System.out.println("12) December");
      
      //gathers the month the user wants to see
         System.out.print("\nEnter in the month's number: ");
         userMonth = sc.nextInt();
      
      //case structure for proper number of days output
         switch (userMonth) {
         
            case M1:
            case M3:
            case M5:
            case M7:
            case M8:
            case M10:
            case M12:
            //Jan, Mar, May, Jul, Aug, Oct, Dec
               System.out.println("The inputted month has " + MOSTDAYS + " days");
               break;
         
            case M4:
            case M6:
            case M9:
            case M11:
            //Apr, Jun, Sep, Nov
               System.out.println("The inputted month has " + MIDDLEDAYS + " days");
               break;
         
            case M2:
            //Feb
               System.out.println("The inputted month has " + FEB + " days");
               break;
         }//ends case structure
      }//ends main method
   }