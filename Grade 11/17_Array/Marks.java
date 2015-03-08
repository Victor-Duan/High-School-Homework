/*
	File Name: Marks.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 10, 2013
	Description: The program asks the user for 4 names and marks
					 The program then asks the user for a mark, and outputs the corresponding name
					 If no mark is present, an appropriate message is outputted
*/

import java.util.*;

public class Marks {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		double comparedMark;
		int foundCounter = 0;
		
		String [] names;
		double [] marks;
		final int NUMSTUD = 4;
		
		//creates two arrays - one to store the name and one to store the mark
		names = new String [NUMSTUD];
		marks = new double [NUMSTUD];
		
		//gets the names and mark of 4 students
		for (int i = 0; i < NUMSTUD; i++) {

			System.out.print("Enter a name: ");
			names[i] = sc.nextLine();
			
			System.out.print("Enter a mark: ");
			marks[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		//asks the user to enter a mark to find the matching student
		System.out.print("Enter a mark: ");
		comparedMark = sc.nextDouble();
		
		//outputs the matching name, if any
		//foundCounter goes up if the condition is true, which will make it so that
		//the next if structure will not be entered
		for (int i = 0; i < NUMSTUD; i++) {
			if (comparedMark == marks[i]){
				System.out.println(names[i] + " received that mark");
				foundCounter++;
			}
		}
		
		//output only if the mark does not match any previously entered
		if (foundCounter == 0) {
			System.out.println("Mark does not exist");
		}
		
	}
}
						
