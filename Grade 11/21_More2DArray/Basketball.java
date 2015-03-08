/*
	File Name: Basketball.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 23, 2013
	Description: The program asks the user to enter the scores of 5 basketball games
					 The program then outputs the total amount of baskets each team has scored, 
					 as well as how many games each team has won
*/

import java.util.*;

public class Basketball {
	public static void main(String[] args) {
		
		//variable declaration
		Scanner sc = new Scanner(System.in);
		int totalPoints;
		int win1Count = 0;
		int win2Count = 0;
		int[][] scores;
		final int GAMENUM = 5;
		final int TEAMNUM = 2;
		
		//in this array, the number of teams is considered as the rows
		//and the number of games is the number of columns 
		//when considering the array as a table
		scores = new int [TEAMNUM][GAMENUM];
		
		//gets scores from the user
		for (int i = 0; i < GAMENUM; i++) {
			for (int j = 0; j < TEAMNUM; j++) {
				System.out.print("Enter score of team " + (j+1));
				System.out.print(" for game " + (i+1) + ": ");
				scores[j][i] = sc.nextInt();
			}
		}
		
		//calculates the total points of each team
		for (int i = 0; i < TEAMNUM; i++) {
			totalPoints = 0;
			for (int j = 0; j < GAMENUM; j++) {
				totalPoints += scores[i][j];
			}
			System.out.println("Team " + (i+1) + " scored " + totalPoints + " point(s)");
		}
		
		//calculates the number of games won by each team
		for (int i = 0; i < GAMENUM; i++) {
			if (scores[0][i] > scores [1][i]) {
				win1Count++;
			}
			else if (scores[0][i] < scores [1][i]) {
				win2Count++;
			}
		}
		
		//outputs how many games each team has won
		System.out.println("Team 1 won " + win1Count + " games");
		System.out.println("Team 2 won " + win2Count + " games");
		
	}
}