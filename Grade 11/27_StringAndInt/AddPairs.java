/*
 File Name: AddPairs.java
 Name: Victor Duan
 Class: ICS3U1
 Date: May 3, 2013
 Description:The user enters a number. The program then pairs the digits into two-digit numbers, and finds the
     sum of those two-digit numbers
*/

import java.util.*;

public class AddPairs {
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  String userEntry;
  int totalSum = 0;
  
  System.out.print("Enter a number: ");
  userEntry = sc.nextLine();
  
  for (int i = 0; i < userEntry.length(); i = i + 2) {
   totalSum = totalSum + (userEntry.charAt(i) - '0')* 10  + (userEntry.charAt(i+1) - '0');
  }
  System.out.println(totalSum);
 }
 
}
