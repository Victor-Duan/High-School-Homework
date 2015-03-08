/*
	File Name: Backward1.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 26, 2013
	Description: This program counts backwards by 5's from 100 to 5
*/

    public class Backward1 {
       public static void main(String[] args){
      
      //count starts at 100, counts down from 5
         for (int i = 100; i >= 5; i = i - 5) {
            System.out.println(i);
         }//ends for loop
      }
   }