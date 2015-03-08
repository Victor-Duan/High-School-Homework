/*
	File Name: Paper.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 26, 2013
	Description: This program outputs the area of each square and the thickness of the stack
				    of paper after it has been cut in half and stacked.
					 The starting area is 1.0m^2, the starting thickness is 0.090
*/

    public class Paper {
       public static void main(String[] args) {
      
      //variable declaration/initialization
      //HALFDOUBLE is the rate at which area decreases
      //as well as the rate at which thickness increases
         double area = 1;
         double thick = 0.09;
         final double HALFDOUBLE = 2;
      
      //runs 40 times since the paper is cut/stacked 40 times
      //calculates the thickness for each cut
         for (int i = 0; i < 40; i++) {
            area = area / HALFDOUBLE;
            thick = thick * HALFDOUBLE;
         }
      
         System.out.println("The final area is: " + area + "meters squared" );
         System.out.println("The final thickness is: " + thick + "mm");
      }
   }