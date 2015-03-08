/* Victor Duan
   ICS3U1
   Question 5.8
   February 12, 2013
   This program calculates the hours the user has been alive and awake based on input received from the user
	assuming that there are 365 days in a year, 30 days in a month, and that the user sleeps 8 hours in a day
*/

import java.util.*;

public class Alive {
	public static void main(String[] args) {
		int birthDate, birthYear, birthMonth, today,todayMonth, todayYear, daysAlive, hoursSleeping;//variable declaration
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your birthdate:");//user input
		System.out.print("Year: ");
		birthYear = sc.nextInt();
		System.out.print("Month: ");
		birthMonth = sc.nextInt();
		System.out.print("Day: ");
		birthDate = sc.nextInt();
		System.out.println("Enter today's date: ");
		System.out.print("Year: ");
		todayYear = sc.nextInt();
		System.out.print("Month: ");
		todayMonth = sc.nextInt();
		System.out.print("Day: ");
		today = sc.nextInt();
		
		todayYear = todayYear*365 ;//calculations
      todayMonth = todayMonth*30 ;
         
      birthYear = todayYear - birthYear*365 ;
	   birthMonth = todayMonth - birthMonth*30 ;
		
      daysAlive = today - birthDate + birthMonth + birthYear;
		hoursSleeping = daysAlive * 8;

      System.out.println("You have been alive for " + daysAlive + " days");
		System.out.println("You have slept " + hoursSleeping + " hours");
	}
}
