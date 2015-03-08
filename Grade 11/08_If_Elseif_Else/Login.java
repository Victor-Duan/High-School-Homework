/*
	File Name: Login.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 6, 2013
	Description: The program asks the user to enter a ID num and password, both integers
					 The program the outputs if the 2 are correct or not
*/

   import java.util.*;

   public class Login {
      public static void main(String[] args){
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int numID, pass;
         final int PASSWORD = 523;
         final int IDNUM = 1996;
      
      //asks the user for the ID and password
         System.out.print("ID Number: ");
         numID = sc.nextInt();
         System.out.print("Password: ");
         pass = sc.nextInt();
      
      //checks to see if the ID and password match
      //both must match to log in successfully
         if ((numID == IDNUM) && (pass == PASSWORD)) {
            System.out.println("Log on successful");
         } 
         else {
            System.out.println("Log on unsuccessful");
         }
      
      }
   }