/*
	File Name: Count1.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 21, 2013
	Description: This program counts down from 100 to 1 by twos
*/

   public class Count1 {
      public static void main(String[] args) {
      
      //variable declaration
         int num = 100;
         final int INTERVAL = 2;
      
      //changes value of num until it becomes less than/equal to 1
         do {
            System.out.println(num);
            num = num - INTERVAL;
         } while (num >= 1);
      }
   }