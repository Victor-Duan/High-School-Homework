/*
	File Name: Count2.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 20, 2013
	Description:This program counts from 0 to 50 by fives
*/

public class Count2 {
	public static void main(String[] args) {
		
		//variable declaration
		int num = 0;
		final int INTERVAL = 5;
		
		//while loop checks for when num becomes greater than or equal to 50
		//prints out num until the condition is reached
		while (num <=50) {
			System.out.println(num);
			num = num + INTERVAL;
		}
	}
}