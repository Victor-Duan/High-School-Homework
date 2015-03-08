/*
	File Name: Chart.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 26, 2013
	Description: This program outputs a table with the squares and cubes of
					 the numbers between 5 and 40
*/

    public class Chart {
       public static void main(String[] args) {
      
      //outputs the chart header
      //outside loop since it should not be repeated
         System.out.println("Num\tSquare\tCube");
      
      //outputs the number, its square and its cube
      //goes up by increments of 1
         for (int i = 5; i <= 40; i++) {
            System.out.println(i + "\t" + i*i + "\t" + i*i*i);
         }//end for loop
      }
   }