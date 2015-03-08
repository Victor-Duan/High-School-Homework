/*
	File Name: Encryption.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 6, 2013
	Description: The user enters an 8 word string, the last two words always being numbers. 
					 The program will then "encrypt" the words, each having their own encryption process
*/
	
   import java.util.*;
   import java.lang.*;

   public class Encryption {
      public static void main(String[] args) {
      	
      	//variable declaration
      	//wordLength stores the length of each word for use in conditions and calculations to save space
      	//word5Max is the largest random number that can be given for word 5
      	//word7Num and word8Num store the numerical values that were originally given as strings
         Scanner sc = new Scanner(System.in);
         int wordLength;
         int word5Max;
         int word7Num, word8Num;
      	
         char word3FirstLast;
         String userEntry;
         String[] separateWords;
      	
      	//variables that count the number of each type of letter for word 6
         int upperCaseCount = 0; 
         int lowerCaseCount = 0;
         int symbolCount = 0;
         int digitCount = 0; 
         int letterCount = 0;
         int consecDigitCount = 0;
         char charBefore, currentChar;
      	
      	//variables keeping track of points for word 6
         int totalPoints = 0;
         int eachCharPoints = 0;;
         int eachTypePoints = 0;
         int upperCasePoints = 0;
         int lowerCasePoints = 0;
         int symbolPoints = 0;
         int allLetterPoints = 0;
         int allNumPoints = 0;
         int consecutiveDigitsPoints = 0;
      	
			//constants that are multipliers for word 6
         final int EACHCHARMULTIPLIER = 4;
         final int EACHTYPEMULTIPLIER = 2;
         final int UPPERCASEMULTIPLIER = 2;
         final int LOWERCASEMULTIPLIER = 2;
         final int SYMBOLMULTIPLIER = 6;
         final int ONLYLETTERMULTIPLIER = -1;
         final int ONLYDIGITMULTIPLIER = -1;
         final int CONSECDIGITMULTIPLIER = -2;
      
			//The smallest random number possible, as well as the multiplier for word 5
			//The number that is to be subtracted from the value of word 7
         final int WORD5MIN = 100;
         final int WORD5MULTIPLIER = 100;
         final int WORD7SUBTRACT = 100000;
      
			//constants to check if characters are upper case, lower case, or digits
         final char ALPHACAPSLOW = 'A';
         final char ALPHACAPSHIGH = 'Z';
         final char ALPHALOWLOW = 'a';
         final char ALPHALOWHIGH = 'z';
         final char NUMLOW = '0';
         final char NUMHIGH = '9';
      
			//the replacement characters for word 3
         final char WORD3REPLACE1 = 'A';
         final char WORD3REPLACE2 = 'a';
         final char WORD3REPLACEMID = '*';
      
			//the parameter used to separate the sentence into separate words
         final String SEPARATOR = " ";
      
      	//gets the sentence from the user
         System.out.println("Enter a message with 8 words, separated by spaces:");
         userEntry = sc.nextLine();
      
			//stores each word into a separate index of the separateWords array
         separateWords = userEntry.split(SEPARATOR);
      
			//prints out each word on a new line
         for (int i = 0; i < separateWords.length; i++) {
            System.out.println(separateWords[i]);
         }
      
      //word 1
         wordLength = separateWords[0].length();
      	
			//prints the string backwards; prints each character individually
         for (int i = wordLength - 1; i >= 0; i--) {
            System.out.print(separateWords[0].charAt(i));
         }
         System.out.print(SEPARATOR);
      	
      //word 2
      	
         wordLength = separateWords[1].length();
      	
			//prints out the last character of the string
         System.out.print(separateWords[1].charAt(wordLength - 1));
      	
			//prints out shifted values of middle characters
         for (int i = 1; i < wordLength - 1; i++) {
            System.out.print((char)(separateWords[1].charAt(i) + 2));
         }
      	
			//prints out first letter of word
			//if structure prevents first letter being printed twice if second word is only 1 character
			if (wordLength > 1) {
         	System.out.print(separateWords[1].charAt(0));
			}
      
         System.out.print(SEPARATOR);
      	
      //word 3
      	
         wordLength = separateWords[2].length();
         word3FirstLast = separateWords[2].charAt(0);
      
			//checks if first character is uppercase or lowercase and replaces it with the appropriate char
         if (word3FirstLast >= ALPHACAPSLOW && word3FirstLast <= ALPHACAPSHIGH) {
            System.out.print(WORD3REPLACE1);
         }
         else if (word3FirstLast >= ALPHALOWLOW && word3FirstLast <= ALPHALOWHIGH){
            System.out.print(WORD3REPLACE2);
         }
      	
			//"replaces" all middle characters with the replacement (*)
         for (int i = 1; i <= wordLength - 2; i++) {
            System.out.print(WORD3REPLACEMID);
         }
      	
			//makes the variable store the value of the last char
         word3FirstLast = separateWords[2].charAt(wordLength - 1);
      	
			//outer if prevents first character from being printed twice if word is only 1 char long
			//checks if last char is upper or lower case and changes it to the appropriate char
         if (wordLength != 1){
            if (word3FirstLast >= ALPHACAPSLOW && word3FirstLast <= ALPHACAPSHIGH) {
               System.out.print(WORD3REPLACE1);
            }
            else if (word3FirstLast >= ALPHALOWLOW && word3FirstLast <= ALPHALOWHIGH){
               System.out.print(WORD3REPLACE2);
            }
         }
      	
         System.out.print(SEPARATOR);
      	
      //word 4
      	
         wordLength = separateWords[3].length();
			
			//prints the last char
         System.out.print(separateWords[3].charAt(wordLength - 1));
      	
			//prints out every character before that in order
         for (int i = 0; i < wordLength - 1; i++) {
            System.out.print(separateWords[3].charAt(i));
         }
      
         System.out.print(SEPARATOR);
      	
      //word 5
      	
			//finds the maximum value of the random number
         word5Max = separateWords[4].length() * WORD5MULTIPLIER;
			//word5Max - WORD5MIN are the number of possibilities
			//WORD5MIN is the smallest possible value
			/*
			  if considering Math.random gets a number between 0 and 1 but not including 1
			  Math.round makes sure that 1 is still included, which is why adding 1 to the 
			  minimum is not necessary
			  Using casting instead would also make the number received 1 greater than the max (101),
			  which does not comply with the rules given
			*/
         System.out.print((Math.round(Math.random() * (word5Max - WORD5MIN) + WORD5MIN)));
      	
         System.out.print(SEPARATOR);
			
      //word 6
      	
         wordLength = separateWords[5].length();
      	
			//counts how many of each type of character are present in the word
         for (int i = 0; i < wordLength; i++) {
         	
            currentChar = separateWords[5].charAt(i);
         	
            if (currentChar >= ALPHACAPSLOW && currentChar <= ALPHACAPSHIGH) {
               upperCaseCount++;
               letterCount++;
            }
            else if (currentChar >= ALPHALOWLOW && currentChar <= ALPHALOWHIGH){
               lowerCaseCount++;
               letterCount++;
            }
            else if (currentChar >=NUMLOW && currentChar <= NUMHIGH) {
               digitCount++;
            }
            else {
               symbolCount++;
            }
         
         
         }
      	
			//checks if each type of character is present, and adds points based on that
         if (upperCaseCount > 0) {
            eachTypePoints += EACHTYPEMULTIPLIER;
         }
         if (lowerCaseCount > 0) {
            eachTypePoints += EACHTYPEMULTIPLIER;
         }
         if (symbolCount > 0) {
            eachTypePoints += EACHTYPEMULTIPLIER;
         }
         if (digitCount > 0) {
            eachTypePoints += EACHTYPEMULTIPLIER;
         }
      	
			//finds the number of points related to word length
         eachCharPoints = wordLength * EACHCHARMULTIPLIER;
      
			//points awarded for every upper or lower case letter
			//so long as there is at least 1 of either
         if (upperCaseCount > 0) {
            upperCasePoints = (wordLength - upperCaseCount) * UPPERCASEMULTIPLIER;
         }
         if (lowerCaseCount > 0) {
            lowerCasePoints = (wordLength - lowerCaseCount) * LOWERCASEMULTIPLIER;
         }
      	
			//finds number of points for symbols present
         symbolPoints = SYMBOLMULTIPLIER * symbolCount;
      	
			//deducts points if the word is comprised of all letters or all numbers
         if (letterCount == wordLength) {
            allLetterPoints = wordLength * ONLYLETTERMULTIPLIER;
         }
         if (digitCount == wordLength) {
            allNumPoints = wordLength * ONLYDIGITMULTIPLIER;
         }
      	
			//checks for consecutive digits within the word
			//checks for how many chars are consecutive digits after the first digit
			//performed in a separate loop because if it were done within the counting loop
			//then the index would go out of bounds
         for (int i = 1; i < wordLength; i++) {
            charBefore = separateWords[5].charAt(i - 1);
            currentChar = separateWords[5].charAt(i);
            if (charBefore >= NUMLOW && charBefore <= NUMHIGH) {
               if (currentChar >= NUMLOW && currentChar <= NUMHIGH) {
                  consecDigitCount++;
               }
            }
         }
      	
			//calculates the amount of points deducted for consecutive digits
			//because of how they are counted, the method to calculate the deduction is different than the one given
			//though the final value is the same
         consecutiveDigitsPoints = consecDigitCount * CONSECDIGITMULTIPLIER;
      	
			//calculates the total amount of points
         totalPoints = eachCharPoints + eachTypePoints + upperCasePoints + lowerCasePoints;
         totalPoints += symbolPoints + allLetterPoints + allNumPoints + consecutiveDigitsPoints;
      	
         System.out.print(totalPoints);
         System.out.print(SEPARATOR);
      	
      //word 7
      	
			//converts the word into a number that operations can be performed on
         word7Num = Integer.parseInt(separateWords[6]);
      	
			//finds the absolute value of the difference between the number and 100000
         System.out.print(Math.abs(word7Num - WORD7SUBTRACT));
         System.out.print(SEPARATOR);
      	
      //word 8
      	
			//converts the word into a number that operations can be performed on
         word8Num = Integer.parseInt(separateWords[7]);
			
			//finds the rounded value of the square root of the number
         System.out.print(Math.round(Math.sqrt(word8Num)));
      	
      	//point breakdown for word 6
			System.out.println();
         System.out.println(eachCharPoints);
         System.out.println(eachTypePoints);
         System.out.println(upperCasePoints);
         System.out.println(lowerCasePoints);
         System.out.println(symbolPoints);
         System.out.println(allLetterPoints);
         System.out.println(allNumPoints);
         System.out.println(consecutiveDigitsPoints);
      
      }
   }