/*
	File Name: AlphabetCount.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 22, 2013
	Description: The program asks the user to enter letters until a non-alphabet is entered
					 The program outputs the number of upper and lower case letters, as well
					 as the number of vowels entered
*/

   import java.util.*;

   public class AlphabetCount {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         char userEntry;
         int lowCounter = 0;
         int highCounter = 0;
         int vowelCounter = 0;
      
      //constants used to determine whether digit is a letter or not
      //also used to determine whether digit is vowel or not
         final char MINUP = 'A';
         final char MAXUP = 'Z';
         final char MINLOW = 'a';
         final char MAXLOW = 'z';
         final char LE = 'e';
         final char LI = 'i';
         final char LO = 'o';
         final char LU = 'u';
         final char UE = 'E';
         final char UI = 'I';
         final char UO = 'O';
         final char UU = 'U';
      
      //gathers digit for the first time
         System.out.print("Enter an alphabet: ");
         userEntry = sc.nextLine().charAt(0);
      
      //runs so long as input is a letter
         while ((userEntry >= MINUP && userEntry <= MAXUP) || (userEntry >= MINLOW && userEntry <= MAXLOW)) {
         
         //adds to uppercase counter
            if (userEntry >= MINUP && userEntry <= MAXUP) {
               highCounter++;
               if (userEntry == MINUP || userEntry == UE || userEntry == UI || userEntry == UO || userEntry == UU){
                  vowelCounter++;
               }//ends uppercase vowel if structure
            }//ends uppercase if structure
            
            //adds to lowercase value
            else {
               lowCounter++;
               if (userEntry == MINLOW || userEntry == LE || userEntry == LI || userEntry == LO || userEntry == LU){
                  vowelCounter++;
               }//ends lowercase vowel if structure
            }//ends lowercase if structure
				
         //gathers next digit
            System.out.print("Enter an alphabet: ");
            userEntry = sc.nextLine().charAt(0);
         
         }//ends while loop
      
		//final output
         System.out.println("You have entered " + highCounter + " upper case letters");
         System.out.println("You have entered " + lowCounter + " lower case letters");
         System.out.println("You have entered " + vowelCounter + " vowels");
      }
   }