/*
	File Name: MathClass1.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 30, 2013
	Description:This program prints out a random number between 0 and 100
*/

import java.lang.Math;

public class MathClass1 {
	public static void main(String[] args) {
		
		//we can consider the random number that is produced to be the decimal form of a percentage
		//multiplying that number by 100 will produce the percent version of it, which will always be between 0 and 100
		final int PERCENT = 100;
		
		System.out.println(Math.random()*PERCENT);
	}
}