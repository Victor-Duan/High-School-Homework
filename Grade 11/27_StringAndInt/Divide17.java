/*
	File Name: Divide17.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 2, 2013
	Description:
*/

import java.util.*;
import java.lang.Integer;
import java.text.DecimalFormat;

public class Divide17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		int comboNum;
		String number1, number2;
		final double DIVISOR = 17;
		
		System.out.print("Enter a number: ");
		number1 = sc.nextLine();
		System.out.print("Enter another number: ");
		number2 = sc.nextLine();

		comboNum = Integer.parseInt(number1 + number2);
		
		System.out.println(df.format(comboNum / DIVISOR));
	}
}