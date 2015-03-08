/*
 File Name: Property.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for information about properties that are non-specific to houses or condos
*/

public class Property {
	
	//fields for Property class
	protected int id;
	protected String address;
	protected PrimarySpec primSpec;
	protected SecondarySpec secSpec;
	
	//constructor that takes in all parameters for a property
	public Property(int id, String address, PrimarySpec primSpec, SecondarySpec secSpec) {
		
		this.id = id;
		this.address = address;
		this.primSpec = primSpec;
		this.secSpec = secSpec;

	}
	
	//accessor method to get ID so that a property's id can be seen in PropertyDatabase
	public int getID () {
		return id;
	}
	
	//accessor methods to get primSpec and secSpec so that they can be seen in other classes
	//which will be used to call methods in PrimarySpec and SecondarySpec
	public PrimarySpec getPrimSpec() {
		return primSpec;
	}
	
	public SecondarySpec getSecSpec() {
		return secSpec;
	}
	
	//method which compares two properties to see if that the percentage of specs that match between the two objects is greater than the percent entered
	public boolean matchProperty (Property other, double percentage) {
		return (other != null && primSpec.matchSpec(other.primSpec) && secSpec.matchSpec(other.secSpec, percentage));
	}
	
	//toString method to print out information about the Property
	public String toString() {
		String idInfo = "ID: " + id + "\n";
		String addressInfo = "Address: " + address + "\n";
		return idInfo + addressInfo;
	}
}