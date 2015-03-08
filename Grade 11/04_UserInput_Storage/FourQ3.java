/* Victor Duan
   ICS3U1
   Question 4.3
   February 11, 2013
   This program asks the user to type in their name and their age seperately, and will output both with a brief message
*/

import java.util.*;

public class FourQ3 {
	public static void main(String[] args){
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		name = sc.nextLine();
		//Will not accept strings with spaces
		System.out.print("How old are you? ");
		age = sc.nextInt();
		System.out.println("So you are " + name + " and you are " + age);
	}
}
	