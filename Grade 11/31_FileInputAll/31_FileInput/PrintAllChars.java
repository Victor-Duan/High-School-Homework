/*
	File Name: PrintAllChars.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 16, 2013
	Description: 
*/

import java.util.*;
import java.io.*;

public class PrintAllChars {
	public static void main(String[] args) {
		
		try {
			
			BufferedReader in = new BufferedReader (new FileReader("PrintAllChar.txt"));
			String line;
			char currentChar;
			final char SPACE = ' ';
			final char NEWLINE = '\n';
			final char RTHING = '\r';
			
			while ((line = in.readLine()) != null) {
				
				for (int i = 0; i < line.length(); i++) {
					currentChar = line.charAt(i);
					if (currentChar != SPACE && currentChar != NEWLINE && currentChar != RTHING) {
						System.out.println(currentChar);
					}
				}
			}
			in.close();
			
			
			
		}
		catch (IOException iox) {
			System.out.println("Error");
		}
	}
}