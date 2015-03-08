/*
 File Name: SchoolBag.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 7, 2013
 Description: A collection of fields and methods that pertain to a school backpack, which holds 2 binders in it
*/

public class SchoolBag {
	private String style;
	private Binder binder1;
	private Binder binder2;
	
	private static final double WEIGHTEMPTYBAG = 0.4;
	private static final double BINDERSPERBAG = 2;
	
	//constructor that takes in 2 pre-existing Binder objects and points the fields to those objects
	public SchoolBag(Binder b1, Binder b2) {
		binder1 = b1;
		binder2 = b2;
		style = "Plain";
	}
	
	//constructor that takes in 2 pre-existing object parameters, and the style of the bag
	public SchoolBag(Binder b1, Binder b2, String style) {
		binder1 = b1;
		binder2 = b2;
		this.style = style;
	}
	
	//constructor that takes in all necessary parameters to create a bag with 2 binders
	public SchoolBag (String label1, String colour1, int numSheets1,
	String label2, String colour2, int numSheets2,
	String style) {
		binder1 = new Binder (label1, colour1, numSheets1);
		binder2 = new Binder (label2, colour2, numSheets2);
		this.style = style;
	}
	
	//method that adds sheets to a specific binder
	public void addSheets(int givenBinderNum, int numSheetsAdded) {
		if (givenBinderNum == 1) {
			binder1.addSheets(numSheetsAdded);
		}
		else if (givenBinderNum == 2) {
			binder2.addSheets(numSheetsAdded);
		}
	}
	
	//method which removes sheets to a specified binder
	public void removeSheets(int givenBinderNum, int numSheetsRemove) {
		if (givenBinderNum == 1) {
			binder1.removeSheets(numSheetsRemove);
		}
		else if (givenBinderNum == 2) {
			binder2.removeSheets(numSheetsRemove);
		}
	}
	
	//method which returns the average weight of the 2 binders
	public double averageBinderWeight() {
		return (binder1.totalWeight() + binder2.totalWeight()) / BINDERSPERBAG ;
	}
	
	//method which returns the total weight of the bag and the 2 binders
	public double totalWeightWithBag() {
		return binder1.totalWeight() + binder2.totalWeight() + WEIGHTEMPTYBAG;
	}
	
	//toString method which prints out information about the binders in the bag
	public String toString() {
		
		String binder1Info = "Binder 1: \n" + binder1;
		String binder2Info = "Binder 2: \n" + binder2;
		return binder1Info + binder2Info;
	}
	
	
}