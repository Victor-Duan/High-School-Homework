/* Victor Duan
   ICS3U1
   Question 4.2
   February 11, 2013
   This program asks the user to type in their name, and outputs it with a short message
*/

import java.util.*;

public class FourQ2 { 
	public static void main(String[] args){
		String personName;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is your name? ");
		personName = sc.nextLine();
		//This input will only store up to a space. e.g. entering "Victor Duan" will only store "Victor" in the variable
		System.out.println ("Hello " + personName);
	}
}