/*
	File Name: AddNumbers.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 16, 2013
	Description: 
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class AddNumbers {
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("AddNumbers.txt"));
			int total = 0;
			String num = in.readLine();
			
			while (num != null) {
				total += Integer.parseInt(num);
				num = in.readLine();
			}
			
			System.out.println(total);
			in.close();
		}
		catch (IOException iox) {
			System.out.println("Error");
		}
		
	}
}
