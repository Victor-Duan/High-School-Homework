/*
	File Name: Method1.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 14, 2013
	Description:
*/

import java.util.*;

public class Method1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int visitorNum;
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Visitor Number: ");
		visitorNum = sc.nextInt();
		
		System.out.println(WelcomeMessage (name, visitorNum));
	}
	public static String WelcomeMessage (String name, int visitorNum) {
		return ("Welcome " + name + "! You are visitor number " + visitorNum + ".");
	}
}