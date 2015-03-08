/*
	File Name: ReverseLines.java
	Name: Victor Duan
	Class: ICS3U1
	Date: May 16, 2013
	Description: 
*/

import java.util.*;
import java.io.*;

public class ReverseLines {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("reverse.txt"));
			int numElem = Integer.parseInt(in.readLine());
			String[] lines = new String[numElem];
			
			for (int i = 0; i < numElem; i++) {
				lines[i] = in.readLine();
			}
			
			for (int i = numElem - 1; i >= 0; i--) {
				System.out.println(lines[i]);
			}
			in.close();
		}
		catch (IOException iox) {
			System.out.println("Error");
		}
	}
}