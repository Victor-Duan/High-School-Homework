/*
 File Name: Jam.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 4, 2013
 Description: A collection of fields and methods that pertain to a jar of jam
*/

public class Jam {
	private String contents;
	private int year;
	private int month;
	private int day;
	private double size;
	
	//constructor that takes in no parameters
	public Jam() {
		contents = "Empty";
		year = 0;
		month = 0;
		day = 0;
		size = 0;
	}
	
	//constructor that takes in the type of jam, the date, and the number of ounces of jam
	public Jam (String contents, int day, int month, int year, double size) {
		this.contents = contents;
		this.day = day;
		this.month = month;
		this.year = year;
		this.size = size;
	}
	
	//returns a boolean to determine whether or not the jar is empty or not
	public boolean empty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method that spreads jam (removes it) from the jar
	//if the user wants to spread more jam than is available, all remaining jam is spread
	public void spreadJam(double spreadingAmount) {
		if (size == 0) {
			System.out.println("Buddy the jar's empty\n");
		}
		else if (spreadingAmount > size) {
			System.out.println("Buddy you spread " + size + " ounces of jam\n");
			size = 0;
		}
		else {
			System.out.println("Buddy you spread " + spreadingAmount + " ounces of jam\n");
			size -= spreadingAmount;
		}
	}
	
	//toString method which returns information about the jar
	public String toString() {
		String jamType = "Contents: " + contents + "\t\t";
		String date = "Date: " + month + "/" + day + "/" + year + "\t\t";
		String amountLeft = size + " fl. oz.";
		return jamType + date + amountLeft;
	}
	
	
}