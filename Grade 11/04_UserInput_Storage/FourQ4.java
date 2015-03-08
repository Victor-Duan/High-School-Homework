/* Victor Duan
   ICS3U1
   Question 4.4
   February 11, 2013
   This program asks the user to type in two different words, then outputs each on a seperate line, and then each on the same line
*/

import java.util.*;

public class FourQ4 {
	public static void main(String[] args) {
		String word1, word2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter word #1: ");
		word1 = sc.nextLine();
		System.out.print("Please enter word #2: ");
		word2 = sc.nextLine();
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word1 + " " + word2);
	}
}