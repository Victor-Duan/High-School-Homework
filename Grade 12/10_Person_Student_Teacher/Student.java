public class Student extends Person {
	private int studentNum;
	private double mark;
	
	private static final int OLDSTU = 21;
	private static final int PASSMARK = 50;
	private static final int FATSTU = 200;
	
	//constructor that takes in 6 parameters to initialize fields
	public Student (String name, char gender, int age, double weight, int studentNum, double mark) {
		super(name, gender, age, weight);
		this.studentNum = studentNum;
		this.mark = mark;
	}
	
	//accessor methods
	
	public int getStudentNum() {
		return studentNum;
	}
	
	public double getMark() {
		return mark;
	}
	
	//mutator methods
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	//old method checking or not whether or not the student is old
	public boolean old() {
		return age >= OLDSTU;
	}
	
	//method that checks whether the student passed or not
	public boolean pass() {
		return mark >= PASSMARK;
	}
	
	public boolean overweight() {
		return weight > FATSTU;
	}
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	public int compareTo(Person other) {
			return (int)(mark - ((Student)other).mark);
	}
	
	public String toString() {
		String studentNumInfo = "Student Number: " + studentNum + "\n";
		String markInfo = "Mark: " + mark + "\n";
		return (super.toString() + studentNumInfo + markInfo);
	}

	
}