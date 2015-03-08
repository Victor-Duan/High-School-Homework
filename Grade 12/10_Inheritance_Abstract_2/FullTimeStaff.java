/*
 File Name: FullTimeStaff.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 28, 2013
 Description:
*/

public class FullTimeStaff extends Employee {
	private double yearlySalary;
	private double sickDaysLeft;
	private static final int YEARLYSICKDAY = 20;
	
	public FullTimeStaff(int employeeNumber, String firstName, String lastName,
	double yearlySalary, double sickDaysLeft) {
		super(employeeNumber, firstName, lastName);
		
		this.yearlySalary = yearlySalary;
		this.sickDaysLeft = sickDaysLeft;
	}
	
	//accessor methods
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public double getSickDaysLeft() {
		return sickDaysLeft;
	}
	
	//mutator methods
	public void setYearlySalary(double newYearlySalary) {
		yearlySalary = newYearlySalary;
	}
	
	public void setSickDaysLeft(double newSickDaysLeft) {
		sickDaysLeft = newSickDaysLeft;
	}
	
	//method which returns monthly pay based on yearly salary
	public double pay() {
		return (yearlySalary / 12);
	}
	
	public void deductSickDay(double daysTaken) {
		if (sickDaysLeft - daysTaken < 0) {
			sickDaysLeft = 0;
			System.out.println("Outta sick days buddy");
		}
		else {
			sickDaysLeft -= daysTaken;
		}
	}
	
	public void resetSickDay() {
		sickDaysLeft = YEARLYSICKDAY;
	}
	
	public void printPayStub() {
		System.out.println("Amount Earned: $" + pay());
		System.out.println("Sick Days Left: " + sickDaysLeft);
	}
	
	public double compareToSickDay(FullTimeStaff other) {
			return sickDaysLeft - other.sickDaysLeft;
	}
	
	public String toString() {
		String titleInfo = "\nFull Time Worker";
		return (super.toString() + titleInfo);
	}
}