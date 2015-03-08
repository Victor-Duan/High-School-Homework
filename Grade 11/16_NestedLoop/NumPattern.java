/*
	File Name: NumPattern.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 28, 2013
	Description: This program outputs a specific number pattern
*/

    public class NumPattern {
       public static void main(String[] args) {
      
      //outside loop outputs the number in the row
      //inside loop outputs each row; condition can be changed for certain situations
      //since j is always equal to i, it will run as many times as the value of i
         for (int i = 1;i <=5;i++){
            for (int j = 1; j <= i; j++) {
               System.out.print(j);
            }
            System.out.println("");
         }
      }
   }