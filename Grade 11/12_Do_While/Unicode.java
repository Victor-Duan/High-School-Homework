/*
	File Name: Unicode.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 22, 2013
	Description: This program outputs a unicode table from 1 to 212
*/

    public class Unicode {
       public static void main(String[] args) {
      
      //variable declaration
      //212 is the maximum value for the unicode
         char character = 0;
         final char MAX = 212;
      
      //prints table headers
      //outside loop because it should not be repeated
         System.out.println ("Unicode      Character");
      
      //changes the value of character by 1
      //outputs the unicode and appropriate letter
      //exits once character is equal to 212
         do {
            character++;
            System.out.println( (int) character + "\t\t" + character);
         } while (character != MAX);
      }
   }