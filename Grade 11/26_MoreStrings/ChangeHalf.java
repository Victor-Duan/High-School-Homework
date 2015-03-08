/*
	File Name: ChangeHalf.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description: The user enters a string, and the first and second half of the string swap positions
*/

   import java.util.*;

   public class ChangeHalf {
      public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         String userEntry;
      
         System.out.print("Enter a string: ");
         userEntry = sc.nextLine();
      
         if (userEntry.length()%2 == 0) {
            System.out.print(userEntry.substring(userEntry.length()/2));
         }
         else {
      		System.out.print(userEntry.substring(userEntry.length()/2 + 1));
      		System.out.print(userEntry.charAt(userEntry.length()/2));
      	}
			System.out.print(userEntry.substring(0, userEntry.length()/2));
      }
   }