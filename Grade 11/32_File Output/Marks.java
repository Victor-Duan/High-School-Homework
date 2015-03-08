/*
	File Name: Marks.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 24, 2013
	Description: 
*/

   import java.io.*;
   import java.lang.*;

    public class Marks {
       public static void main(String[] args) {
      
         try {
            final int STUDENTS = 10;
            final int MARKS = 5;
            double[][] allMarks = new double [STUDENTS][MARKS];
            double average, highestAvg;
            int highStu;
            BufferedReader in = new BufferedReader(new FileReader("marks.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("result.txt"));
         	
         	//read input from file marks.txt
            for (int i = 0; i < STUDENTS; i++) {
               for (int j = 0; j < MARKS; j++) {
                  allMarks[i][j] = Double.parseDouble(in.readLine());
               }
            }
         	
         	//calculate the average of each student
         	//finds student with highest average
         	
            highestAvg = 0;
            highStu = 0;
         	
            for (int i = 0; i < STUDENTS; i++) {
               average = 0;
               for (int j = 0; j < MARKS; j++) {
                  average += allMarks[i][j];
               	
               }
               average = average / MARKS;
               out.write(average+"");
               out.newLine();
            	
               if (average > highestAvg) {
                  highestAvg = average;
                  highStu = i;
               }
            }
         	
            out.write(highStu + 1 + "");
            out.newLine();
         	
         	//e.	Calculate the class average of each test and output the result to file “result.txt”
         	
            for (int i = 0; i < MARKS; i++) {
            
               average = 0;
            	
               for (int j = 0; j < STUDENTS; j++) {
               	
                  average += allMarks[j][i];
               }
               average /= STUDENTS;
               out.write(average + "");
               out.newLine();
            }
         	
         	
            in.close();
            out.close();
         }
         
             catch (IOException iox) {
               System.out.println("Error");
            }
      }
   }