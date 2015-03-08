public class Person {
	protected String name;
	protected char gender;
	protected int age;
	protected double weight;
	
	protected static final int OLDLIMIT = 65;
	protected static final int WEIGHTLIMIT = 250;
	
	//blank constructor
	public Person() {
		name = null;
		gender = ' ';
		age = 0;
		weight = 0;
	}
	
	public Person(String name, char gender, int age, double weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	//accessor methods
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	//public int getOldLimit() {
	//	return OLDLIMIT;
	//}
	
	//mutator methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//boolean method that returns whether or not the person is older than 65
	public boolean old() {
		return (age >= OLDLIMIT);
	}
	
	//fat kids
	public boolean overweight() {
		return (weight > WEIGHTLIMIT);
	}
	
	//compares two names
	public boolean equals(Person other) {
		return (other != null && name.equals(other.name));
	}
	
	/////
	
	//
	//
	//
	//
	//
	//
	//
	public int compareTo(Person other) {
			return age - other.age;
	}

	
	//toString method which prints out info on new lines
	public String toString() {
		String nameInfo = "Name: " + name + "\n";
		String genderInfo = "Gender: " + gender + "\n";
		String ageInfo = "Age: " + age + "\n";
		String weightInfo = "Weight: " + weight + " pounds\n";
		return nameInfo + genderInfo + ageInfo;
	}
	

}