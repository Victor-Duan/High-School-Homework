/*
	File Name: PrintLines.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 16, 2013
	Description: 
*/

import java.util.*;
import java.io.*;

public class PrintLines {
	public static void main(String[] args) {
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("line.txt"));
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		}
		
		catch (IOException iox) {
			System.out.println("Error");
		}
		
	}
}