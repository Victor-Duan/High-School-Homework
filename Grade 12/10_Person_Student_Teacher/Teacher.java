public class Teacher extends Person {
	
	private int employeeNumber;
	
	private static int OLDEMPLOYEENUM = 500;
	
	public Teacher(String name, char gender, int age, double weight, int employeeNumber) {
		super(name, gender, age, weight);
		this.employeeNumber = employeeNumber;
	}
	
	public boolean old() {
		return (employeeNumber <= OLDEMPLOYEENUM); 
	}
	
	public boolean equals(Teacher other) {
		return (other != null && employeeNumber == other.employeeNumber);
	}

	public String toString() {
		String employeeNumberInfo = "Employee Number: " + employeeNumber + "\n";
		return (super.toString() + employeeNumberInfo);
	}
	
}