import java.util.*;

public class StudentTracker {
	public static void main(String[] args) {
		
		final int MAX = 10;
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[MAX];
		int numPeopleOld = 0;
		
		people[0] = new Student("Bob", 'M', 15, 123, 3001, 69);
		people[1] = new Teacher("Lam", 'F', 29, 120, 56456);
		people[2] = new Person ("Doggie", 'M', 45, 230);
		people[3] = new Student("Noah", 'M', 18,151,4301, 100);
		people[4] = new Student("Jason", 'M', 21, 201, 4320, 78);
		people[5] = new Student("Maddy", 'F', 19, 100, 3423, 45);
		people[6] = new Teacher("Teddy", 'M', 50, 265, 400);
		people[7] = new Teacher("Bear", 'F', 67, 225, 560);
		people[8] = new Person("Jon", 'M', 66, 165);
		people[9] = new Teacher("Principal", 'M', 70, 198, 356);
		
		for (int i = 0; i < MAX; i++) {
			if (people[i].old()) {
				numPeopleOld++;
				System.out.println(people[i]);
			}
		}
		System.out.println(numPeopleOld);
		
		int countOverWeight = 0;
		for (int i = 0; i < MAX; i++) {
			if (people[i].overweight()) {
				countOverWeight++;
				System.out.println(people[i]);
			}
		}
		System.out.println(countOverWeight);
		
		int personCount = 0;
		int studentCount = 0;
		int teacherCount = 0;
		
		for (int i = 0; i < MAX; i++) {
			if (people[i] instanceof Teacher) {
				teacherCount++;
			}
			else if (people[i] instanceof Student) {
				studentCount++;
			}
			else if (people[i] instanceof Person) {
				personCount++;
			}
		}
		System.out.println(teacherCount);
		System.out.println(studentCount);
		System.out.println(personCount);
		
		int studentPassCounter = 0;
		
		for (int i = 0; i < MAX; i++) {
			if (people[i] instanceof Student) {
				if (((Student)people[i]).pass()) {
					System.out.println(people[i]);
					studentPassCounter++;
				}
			}
		}
		
		System.out.println(studentPassCounter);
		
		Teacher t1 = new Teacher("Bill", 'F', 500, 12, 12345);
		Teacher t2 = new Teacher("Bill", 'M', 12341234, 14, 1234123423);
		System.out.println(t1.equals(t2));
		
		Person t3 = new Teacher("DOGE", 'F', 12341234,1424,9876);
		Person t4 = new Teacher("DOGE", 'M', 1234162, 12423, 14234);
		System.out.println(t3.equals(t4));
		
		int highestMarkIndex = 0;
		
		while (highestMarkIndex < MAX && !(people[highestMarkIndex] instanceof Student) ) {
			highestMarkIndex++;
		}
		
		//System.out.println(highestMarkIndex);
		
		for (int i = highestMarkIndex + 1; i < MAX; i++) {
			System.out.println(highestMarkIndex);
			if (people[i] instanceof Student) {
				if (((Student)people[i]).compareTo(people[highestMarkIndex]) > 0) {
		
					System.out.println(" " + ((Student)people[i]).compareTo(people[highestMarkIndex]));
					highestMarkIndex = i;
				}
			}
		}
		System.out.println(people[highestMarkIndex]);
		
		int youngestIndex = 0;
		
		for (int i = 0; i < MAX; i++) {
			if (people[i].compareTo(people[youngestIndex]) < 0) {
				youngestIndex = i;
			}
		}
		
		System.out.println(people[youngestIndex]);
		
		
		
	}
}