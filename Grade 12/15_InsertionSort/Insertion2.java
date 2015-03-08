/*
 File Name: Condo.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: 
*/

public class Insertion2 {
	public static void main(String[] args) {
		
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		String tempPlanet;
		int tempIndex;
		int currentIndex;
		
		for (int i = 1; i < planets.length; i++) {
			tempIndex = i;
			currentIndex = i-1;
			
			while (currentIndex >= 0) {
				if (planets[tempIndex].compareTo(planets[currentIndex]) < 0) {
					tempPlanet = planets[tempIndex];
					planets[tempIndex] = planets[currentIndex];
					planets[currentIndex] = tempPlanet;
					tempIndex--;
				}
				currentIndex--;
			}
			for (int j = 0; j < planets.length; j++) {
				System.out.println(planets[j]);
			}
			System.out.println();
		}
	}
}