/*
	File Name: Taxi.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 30, 2013
	Description: The program outputs how many taxis are needed for a given group of people
					 Each taxi can hold 4 peopel
*/

   import java.util.*;
   import java.lang.Math;

   public class Taxi {
      public static void main(String[] args) {
      
      //variable declaration
         Scanner sc = new Scanner(System.in);
         double people;
         final int TAXICAPA = 4;
      
      //gets the number of people
         System.out.print("Enter the number of people available: ");
         people = sc.nextInt();
      
      //calculates the number of taxis needed using the Math.ceil method
         System.out.println("Number of taxis needed: " + Math.ceil(people/TAXICAPA));
      }
   }