/*
 File Name: Lab.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 10, 2013
 Description:
*/

public class Lab {
	private int maxCapacity;
	private int numInstalled;
	private Computer[] computers;
	private int currentEmptyPosition;
	
	public Lab() {
		maxCapacity = 0;
		numInstalled = 0;
		computers = new Computer[maxCapacity];
		currentEmptyPosition = 0;
	}
	
	public Lab(int maxCapacity, int numInstalled) {
		this.maxCapacity = maxCapacity;
		this.numInstalled = numInstalled;
		computers = new Computer[maxCapacity];
		currentEmptyPosition = 0;
	}
	
	//method which takes in values needed to create a new computer, and adds it in the array of computers
	public void installComputer(String serialCode, String manufacturer, int yearOfMake, int yearOfPurchase, double processorSpeed, double ramSize, int warrantyExpiryYear) {
		
		if (currentEmptyPosition <= maxCapacity - 1) {
			computers[currentEmptyPosition] = new Computer(serialCode, manufacturer, yearOfMake, yearOfPurchase, processorSpeed, ramSize, warrantyExpiryYear);
			currentEmptyPosition++;
			//numInstalled++;
		}					
	}
	
	//method that calculates average age of computers in the lab
	public double averageAge() {
		double ageAvg = 0;
			for (int i = 0; i < numInstalled; i++) {
				ageAvg += computers[i].getYearOfMake();
		}
		ageAvg /= numInstalled;
		return ageAvg;
	}
	
	//method that returns the newest computer
	public Computer newestComputer() {
		Computer newest = computers[0];
		for (int i = 1; i < numInstalled; i++) {
			newest = newest.compareAge(computers[i]);
		}
		return newest;
	}
	//method that returns the fastest computer in the lab
	public Computer fastestComputer() {
		Computer fastest = computers[0];
		for (int i = 1; i < numInstalled; i++) {
			fastest = fastest.compareSpeed(computers[i]);
		}
		return fastest;
	}
	
	//method that returns the computer with the most RAM
	public Computer mostRam() {
		Computer mostRam = computers[0];
		for (int i = 1; i < numInstalled; i++) {
			mostRam = mostRam.compareRamSize(computers[i]);
		}
		return mostRam;
	}
	
	//returns the number of computers that have the same specific manufacturer, which is given by the user
	public int sameManufacturer(String givenManu) {
		int numSameManu = 0;
		for (int i = 0; i < numInstalled; i++) {
			if ((computers[i].getManufacturer()).equals(givenManu)) {
				numSameManu++;
			}
		}
		return numSameManu;
	}
	
	//returns an array of computers that will be expiring in the following year, with the current year being entered by the user
	public Computer[] expiresNextYear(int givenYear) {
		Computer[] expireNext;
		int nextYear = givenYear + 1;
		int numExpiring = 0;
		
		for (int i = 0; i < numInstalled; i++) {
			if (computers[i].getWarrantyExpiryYear() == nextYear) {
				numExpiring++;
			}
		}
		
		expireNext = new Computer[numExpiring];
		int currentIndexExpire = 0;
		
		for (int i = 0; i < numInstalled; i++) {
			if (computers[i].getWarrantyExpiryYear() == nextYear) {
				expireNext[currentIndexExpire] = computers[i];
				currentIndexExpire++;
			}
		}
		
		return expireNext;
	}
	
}