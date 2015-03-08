/*
	File Name: Count3.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 20, 2013
	Description:This program counts down from 1000 to 200 by intervals of 100
*/

public class Count3 {
	public static void main(String[] args) {
		
		//variable declaration
		int num = 1000;
		final int INTERVAL = 100;
		
		//while loop outputs num and changes its value
		while (num >= 200) {
			System.out.println(num);
			num = num - INTERVAL;
			
		}//end while loop
	}//end main method
}