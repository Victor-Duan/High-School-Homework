/*
 File Name: PayrollRunner.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 28, 2013
 Description:
*/

   import java.util.*;
   import java.io.*;

   public class PayrollRunner {
      public static void main(String[] args) {
  
            Scanner sc = new Scanner(System.in);
            String fileName;
				int menuChoice;
				double numSickDays;
				int employeeNum;
         
            System.out.println("Enter the name of the file you wish to load");
				fileName = sc.nextLine();
				Payroll allEmployees = new Payroll(fileName);
				
				printMenu();
				
				System.out.println("Enter the number of the option you wish to perform");
				menuChoice = sc.nextInt();
				
				switch (menuChoice) {
					case 1:
						allEmployees.listAllEmployee();
						break;
						
					case 2:
						System.out.println("Enter employee number: ");
						employeeNum = sc.nextInt();
						System.out.println("Enter number of sick days taken");
						numSickDays = sc.nextDouble();
						allEmployees.enterSickDay(numSickDays, employeeNum);
						break;
					case 3:
						allEmployees.printAllPayStubs();
						break;
						
					case 4:
						allEmployees.yearlySickDayReset();
						System.out.println("Full Time Staff sick days reset");
						break;
						
					case 5:
						allEmployees.monthlySickDayReset();
						System.out.println("Part Time Staff sick days reset");
						break;
						
					case 6:
						sc.nextLine();
						System.out.println("Enter a file name to save to");
						fileName = sc.nextLine();
						allEmployees.saveStaffList(fileName);
						break;
						
					case 7:
						sc.nextLine();
						System.out.println("Enter a file name to load from");
						fileName = sc.nextLine();
						allEmployees.loadStaffList(fileName);
						break;
						
					case 8:
						System.out.println("Average salary: $" + allEmployees.averageSalary());
						break;
						
					case 9:
						System.out.println("Average monthly rate: $" + allEmployees.averageHourlyRate());
						break;
						
					case 10:
						System.out.println("Full Time Employee with the most sick days");
						System.out.println(allEmployees.mostAbsentFullTime());
						break;
						
					case 11:
						System.out.println("Part Time Employee with the most sick days");
						System.out.println((PartTimeStaff)allEmployees.mostAbsentPartTime());
						break;
						 
					default:
						System.out.println("ENTER A VALID OPTION");
				}
      }
		
		private static void printMenu() {
			System.out.println("Here are the following operations you can perform: \n");
			System.out.println("1. Print out all employees");
			System.out.println("2. Enter sick days for employees");
			System.out.println("3. Print monthly pay stub for all employees");
			System.out.println("4. Reset sick days for all full time staff");
			System.out.println("5. reset monthly sick day taken info for part-time staffs");
			System.out.println("6. save employee information to file");
			System.out.println("7. load employee information from file");
			System.out.println("8. output the average salary of full-time staffs");
			System.out.println("9. output the average hourly rate of part-time staffs");
			System.out.println("10. output the full-time staff who has taken the most sick day in the current year");
			System.out.println("11. output the part-time staff who has taken the most sick day in the current month");
		}
   }