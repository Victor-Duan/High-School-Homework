/*
	File Name: Fibonacci.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 19, 2013
	Description: The program asks the user for 3 integers
					 The first two numbers of the sequence, and the length of the sequence
					 The program then outputs the sequence of that length
*/

   import java.util.*;

   public class Fibonacci {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         int term1, term2, sequenceLength;
         int[] sequence;
      
      //gets the first two terms and length of sequence from user
         System.out.print("Enter 'a': ");
         term1 = sc.nextInt();
         System.out.print("Enter 'b': ");
         term2 = sc.nextInt();
         System.out.print("Enter number of terms: ");
         sequenceLength = sc.nextInt();
      
      //creates an array of the size that the user inputs
      //assigns the values of the first two terms into the first 2 indeces of the array
         sequence = new int [sequenceLength];
         sequence[0] = term1;
         sequence[1] = term2;
      
      //finds and stores values of sequence by adding previous two terms
         for (int i = 2; i < sequenceLength; i++){
            sequence[i] = sequence[i-1] + sequence[i - 2];
         }
      
      //prints out the Fibonacci sequence
         System.out.println("Fibonacci Sequence: ");
         for (int i = 0; i < sequenceLength; i++) {
            System.out.println(sequence[i]);
         }
      
      }
   }