/*
 File Name: Employee.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 28, 2013
 Description:
*/

abstract class Employee {
	protected int employeeNumber;
	protected String firstName;
	protected String lastName;
	
	public Employee() {
		employeeNumber = -1;
		firstName = "empty";
		lastName = "empty";
	}
	
	public Employee(int employeeNumber, String firstName, String lastName) {
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//accessor methods
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	//mutator methods
	public void setEmployeeNumber(int newEmployeeNumber) {
		employeeNumber = newEmployeeNumber;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	abstract double pay();
	
	abstract void deductSickDay(double daysTaken);
	
	abstract void resetSickDay();
	
	abstract void printPayStub();
	
	public String toString() {
		String nameInfo = "Name: " + firstName + " " + lastName + "\n";;
		String employeeNumberInfo = "Employee Number: " + employeeNumber;
		return nameInfo + employeeNumberInfo;
	}
}