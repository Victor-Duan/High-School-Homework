/*
 File Name: PartTimeStaff.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 28, 2013
 Description:
*/

public class PartTimeStaff extends Employee {
	private double numHoursAssigned;
	private double hourlyRate;
	private double sickDaysTaken;
	
	private static final int HOURSPERDAY = 8;
	
	//constructor
	public PartTimeStaff(int employeeNumber, String firstName, String lastName,
	double numHoursAssigned, double hourlyRate, double sickDaysTaken) {
		super(employeeNumber, firstName, lastName);
		this.numHoursAssigned = numHoursAssigned;
		this.hourlyRate = hourlyRate;
		this.sickDaysTaken = sickDaysTaken;
	}
	
	//accessor methods
	
	public double getNumHoursAssigned() {
		return numHoursAssigned;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public double getSickDaysTaken() {
		return sickDaysTaken;
	}
	public double pay() {
		return((numHoursAssigned - (sickDaysTaken * HOURSPERDAY))* hourlyRate);
	}
	
	public void deductSickDay(double daysTaken) {
		sickDaysTaken += daysTaken;
	}
	
	public void resetSickDay() {
		sickDaysTaken = 0;
	}
	
	public void printPayStub() {
		System.out.println("Hours Worked: " + (numHoursAssigned - (sickDaysTaken * HOURSPERDAY)));
		System.out.println("Amount Earned: $" + pay());
	}
	
	public double compareToSickDay(PartTimeStaff other) {
		return sickDaysTaken - other.sickDaysTaken;
	}
	
	public String toString() {
		String titleInfo = "\nPart Time Worker";
		return super.toString() + titleInfo;
	}
}