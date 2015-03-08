/*
 File Name: PrimarySpec.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for information regarding primary specifications
 				  This includes finding out whether a property fits the requirements entered by the user
*/

public class PrimarySpec {
	
	//fields for PrimarySpec
	private String zoneCode;
	private double price;
	private double size;
	private int numBedroom;
	
	//constructor for PrimarySpec
	public PrimarySpec(String zoneCode, double price, double size, int numBedroom) {
		this.zoneCode = zoneCode;
		this.price = price;
		this.size = size;
		this.numBedroom = numBedroom;
	}
	
	//accessor getting zoneCode to match in PropertyDatabase
	public String getZoneCode() {
		return zoneCode;
	}
	
	//accessor getting price to find average price in PropertyDatabase
	public double getPrice() {
		return price;
	}
	
	//accessor getting size to find largest condo in PropertyDatabase
	public double getSize() {
		return size;
	}
	
	//checks to see if all primSpecs are fulfilled
	public boolean matchSpec(PrimarySpec other) {
		return (other != null &&
		zoneCode.equals(other.zoneCode) && 
		price < other.price &&
		size >= other.size &&
		numBedroom >= other.numBedroom);
	}
	
	//prints out info about all primSpecs
	public String toString() {
		String zoneCodeInfo = "Zone Code: " + zoneCode + "\n";
		String priceInfo = "Price: $" + price + "\n";
		String sizeInfo = "Size: " + size + " sq. ft\n";
		String numBedroomInfo = "Number of bedrooms: " + numBedroom + "\n";
		
		return zoneCodeInfo + priceInfo + sizeInfo + numBedroomInfo;
	}
}