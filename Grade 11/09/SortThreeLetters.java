/*
	File Name: SortThreeLetters.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 7, 2013
	Description:The program asks the user for 3 lowercase letters
					If the user enters 3 lowercase letters, they are output in 
					alphabetical order
					Otherwise, the program outputs an error message
*/

import java.util.*;

public class SortThreeLetters {
	public static void main(String[] args){
		
		//variable declaration
		Scanner sc = new Scanner (System.in);
		char letter1, letter2, letter3;
		final char MIN = 'a';
		final char MAX = 'z';
		
		//gathers the three characters
		System.out.print("Enter letter 1: ");
		letter1 = sc.nextLine().charAt(0);
		System.out.print("Enter letter 2: ");
		letter2 = sc.nextLine().charAt(0);
		System.out.print("Enter letter 3: ");
		letter3 = sc.nextLine().charAt(0);
		
		//specifically checks to make sure all entries are viable
		if (letter1 < MIN || letter1 > MAX || letter2 < MIN || letter2 > MAX || letter3 < MIN || letter3 > MAX) {
			System.out.println("Invalid Input");
		}
		
		else if (letter1 <= letter2 && letter1 <= letter3) {
		
			if (letter2 <= letter3) {
				//letter1 <= letter2 <= letter3
				System.out.println(letter1 + "     " + letter2 + "     " + letter3);
			} 
			else {
				//letter1 <=letter3 <= letter2
				System.out.println(letter1 + "     " + letter3 + "     " + letter2);
			}
		}
			
		else if (letter2 <= letter1 && letter2 <= letter3) {
		
			if (letter1 <= letter3) {
				//letter2 <=letter1 <= letter3
				System.out.println(letter2 + "     " + letter1 + "     " + letter3);
			} 
			else {
				//letter2 <=letter3 <= letter1
				System.out.println(letter2 + "     " + letter3 + "     " + letter1);
			}

		}
		
		else if (letter3 <= letter1 && letter3 <= letter1) {
		
			if (letter1 <= letter2) {
				//letter3 <=letter1 <= letter2
				System.out.println(letter3 + "     " + letter1 + "     " + letter2);
			} 
			else {
				//letter3 <=letter2 <= letter1
				System.out.println(letter3 + "     " + letter2 + "     " + letter1);
			}

		}

	}
}
