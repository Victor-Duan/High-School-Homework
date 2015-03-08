/*
 File Name: Binder.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 7, 2013
 Description: A collection of fields and methods that pertain to a single binder
*/

public class Binder {
	private String label;
	private String colour;
	private int numSheets;
	
	private static final double WEIGHTPERSHEET = 0.001;
	private static final double WEIGHTEMPTYBINDER = 0.05;
	
	//constructor with no parameters
	public Binder() {
		label = "Empty";
		colour = "Black";
		numSheets = 0;
	}
	
	//constructor that takes in label, colour and number of sheets
	public Binder(String label, String colour, int numSheets) {
		this.label = label;
		this.colour = colour;
		this.numSheets = numSheets;
	}
	
	//method that adds sheets to the implicit binder
	public void addSheets(int addedSheets) {
		numSheets += addedSheets;
	}
	
	//method that removes sheet from the implicit binder
	//if the user wants to remove more sheets than available, then all sheets are removed
	public void removeSheets(int sheetsToRemove) {
		if (sheetsToRemove > numSheets) {
			numSheets = 0;
		}
		else {
			numSheets -= sheetsToRemove;
		}
	}
	
	//method that returns the weight of the binder and its contents
	public double totalWeight() {
		return numSheets * WEIGHTPERSHEET + WEIGHTEMPTYBINDER;
	}
	
	//method that returns the address of the Binder object which weighs more
	public Binder compareWeight (Binder other) {
		if (this.totalWeight() >= other.totalWeight()) {
			return this;
		}
		else {
			return other;
		}
	}
	
	//toString method that returns info about the binder
	public String toString() {
		String labelInfo = "Label: " + label + "\n";
		String colourInfo = "Colour: " + colour + "\n";
		String sheetInfo = "Number of sheets inside: " + numSheets;
		return labelInfo + colourInfo + sheetInfo;
	}
	
}