/*
 File Name: Pantry.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 4, 2013
 Description: A collection of fields and methods that pertain to a pantry, which contains 3 jars of jam 
*/

public class Pantry {
	Jam j1;
	Jam j2;
	Jam j3;
	
	//constructor which takes in 3 pre-existing Jam objects
	public Pantry (Jam j1, Jam j2, Jam j3) {
		this.j1 = j1;
		this.j2 = j2;
		this.j3 = j3;
	}
	
	//constructor which takes in all the parameters needed to create 3 new jam objects
	public Pantry (String contents1, int day1, int month1, int year1, double size1,
	String contents2, int day2, int month2, int year2, double size2,
	String contents3, int day3, int month3, int year3, double size3) {
		
		j1 = new Jam(contents1, day1, month1, year1, size1);
		j2 = new Jam(contents2, day2, month2, year2, size2);
		j3 = new Jam(contents3, day3, month3, year3, size3);
	}
	
	//method which spreads the jam specified by the user
	public void spreadSpecificJam(int jamNum, double spreadingAmount) {
		if (jamNum == 1) {
			j1.spreadJam(spreadingAmount);
		}
		else if (jamNum == 2) {
			j2.spreadJam(spreadingAmount);
		}
		else if (jamNum == 3) {
			j3.spreadJam(spreadingAmount);
		}
	}
	
	//toString method which returns information about each jam in the pantry
	public String toString() {
		String intro = "Here are the jams available to you:\n";
		String jar1 = "1: " + j1 + "\n";
		String jar2 = "2: " + j2 + "\n";
		String jar3 = "3: " + j3 ;
		return intro + jar1 + jar2 + jar3;
	}
}