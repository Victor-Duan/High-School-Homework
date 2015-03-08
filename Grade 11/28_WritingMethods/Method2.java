/*
	File Name: Method2.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 14, 2013
	Description:
*/

import java.util.*;

public class Method2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many times should the message be printed? ");
		int numTime = sc.nextInt();
		alarm(numTime);
		
	}
	
	public static void alarm(int repetitionNum) {
		
		for (int i = 0; i < repetitionNum; i++) {
			System.out.println("Alarm");
		}
		
		if (repetitionNum < 0) {
			System.out.println("Invalid");
		}
	}
}