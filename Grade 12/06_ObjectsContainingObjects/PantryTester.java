/*
 File Name: PantryTester.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 4, 2013
 Description: The class containing the method which uses the Jam and Pantry classes
*/
	
	import java.util.*;

   public class PantryTester {
      public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int jamNum;
         int spreadAmount;
         boolean validEntry = true;
      
         final int LOWJAM = 1;
         final int HIGHJAM = 3;
      
         Pantry p1 = new Pantry("Gooseberry", 7,4,86,12,
            "Crab Apple", 9,30,99,8,
            "Rhubarb", 10,31,99,16);
      
         System.out.println("Welcome to my jam pantry...");
      	
         do {
            System.out.println(p1);
         
            System.out.print("Enter your selection (1,2 or 3) : ");
            jamNum = sc.nextInt();
         
            if (jamNum >= LOWJAM && jamNum <= HIGHJAM) {
               System.out.print("Enter amount to spread: ");
               spreadAmount = sc.nextInt();
               p1.spreadSpecificJam(jamNum, spreadAmount);
            }
            else {
               validEntry = false;
            }
         }while (validEntry);	
      	
			System.out.println("Adios");
      
      }
   }