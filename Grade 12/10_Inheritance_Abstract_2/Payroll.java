/*
 File Name: Payroll.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 28, 2013
 Description:
*/

   import java.io.*;

    public class Payroll {
      private Employee[] staffList;
      private String fileName;
      private BufferedReader in;
      private BufferedWriter out;
   
      private static final String FULLTIMEIDENTIFIER = "Full";
      private static final String PARTTIMEIDENTIFIER = "Part";
   
       public Payroll(String fileName) {
         this.fileName = fileName;
         loadStaffList(fileName);
      }
   
       public void listAllEmployee() {
         for (int i = 0; i < staffList.length; i++) {
            System.out.println(staffList[i]);
         }
      }
   
       public void enterSickDay(double sickDaysTaken, int employeeNumber) {
         boolean exit = false;
         int currentIndex = 0;
         while(!exit && currentIndex < staffList.length) {
            if (staffList[currentIndex].getEmployeeNumber() == employeeNumber) {
               staffList[currentIndex].deductSickDay(sickDaysTaken);
               exit = true;
            }
            else {
               currentIndex++;
            }
         }
         if (!exit) {
            System.out.println("No such employee exists");
         }
      }
   
       public void printAllPayStubs() {
         for (int i = 0; i < staffList.length; i++) {
            staffList[i].printPayStub();
         }
      }
   
       public void saveStaffList(String fileName) {
      
         try {
            out = new BufferedWriter(new FileWriter(fileName));
            out.write(staffList.length + "");
            for (int i = 0; i < staffList.length; i++) {
               if (staffList[i] instanceof FullTimeStaff) {
               
                  out.write(FULLTIMEIDENTIFIER);
                  out.newLine();
               
                  out.write(staffList[i].getEmployeeNumber() + "");
                  out.newLine();
                  out.write(staffList[i].getFirstName());
                  out.newLine();
                  out.write(staffList[i].getLastName());
                  out.newLine();
               
                  out.write((((FullTimeStaff)staffList[i]).getYearlySalary()) + "");
                  out.newLine();
                  out.write((((FullTimeStaff)staffList[i]).getSickDaysLeft()) + "");
                  out.newLine();
               
               }
               else {
               
                  out.write(PARTTIMEIDENTIFIER);
                  out.newLine();
               
                  out.write(staffList[i].getEmployeeNumber() + "");
                  out.newLine();
                  out.write(staffList[i].getFirstName());
                  out.newLine();
                  out.write(staffList[i].getLastName());
                  out.newLine();
               
                  out.write((((PartTimeStaff)staffList[i]).getNumHoursAssigned()) + "");
                  out.newLine();
                  out.write((((PartTimeStaff)staffList[i]).getHourlyRate()) + "");
                  out.newLine();
                  out.write((((PartTimeStaff)staffList[i]).getSickDaysTaken()) + "");
                  out.newLine();
               	
               }
            	
               out.newLine();
            }
            out.close();
         }
             catch (IOException iox) {
               System.out.println("no file");
            }
      }
   	
   
       public void loadStaffList(String fileName) {
         try {
            int employeeNumber;
            String firstName;
            String lastName;
         	
            double yearlySalary;
            double sickDaysLeft;
         	
            double numHoursAssigned;
            double hourlyRate;
            double sickDaysTaken;
         	
            String currentLine;
            in = new BufferedReader(new FileReader(fileName));
         	
         	//loading process begins here
            int numEmployees = Integer.parseInt(in.readLine());
            staffList = new Employee[numEmployees];
         	
            for (int i = 0; i < numEmployees; i++) {
               if (in.readLine().equals(FULLTIMEIDENTIFIER)) {
                  employeeNumber = Integer.parseInt(in.readLine());
                  firstName = in.readLine();
                  lastName = in.readLine();
                  yearlySalary = Double.parseDouble(in.readLine());
                  sickDaysLeft = Double.parseDouble(in.readLine());
                  staffList[i] = new FullTimeStaff(employeeNumber, firstName, lastName, yearlySalary, sickDaysLeft);
               }
               
               else {
               
                  employeeNumber = Integer.parseInt(in.readLine());
                  firstName = in.readLine();
                  lastName = in.readLine();
               
                  numHoursAssigned = Double.parseDouble(in.readLine());
                  hourlyRate = Double.parseDouble(in.readLine());
                  sickDaysTaken = Double.parseDouble(in.readLine());
               	
                  staffList[i] = new PartTimeStaff(employeeNumber, firstName, lastName, numHoursAssigned, hourlyRate, sickDaysTaken);
               }
            	
               in.readLine();
            }
            in.close();
         }
             catch (IOException iox) {
               System.out.println("no file");
            }
      }
   	
   	//calculates the average salary of all full time workers
       public double averageSalary() {
         double salary = 0;
         int countFTW = 0;
         for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
               salary += staffList[i].pay();
               countFTW++;
            }
         }
         salary /= countFTW;
         return salary * 12;
      }
   	
   	//calculates the average hourly rate of all part time workers
       public double averageHourlyRate () {
         int countPTW = 0;
         double hourlyRateTotal = 0;
         for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
               hourlyRateTotal += ((PartTimeStaff)staffList[i]).getHourlyRate();
               countPTW++;
            }
         }
         return hourlyRateTotal / countPTW;
      }
   	
   	//returns the full time worker that has been away the most
       public FullTimeStaff mostAbsentFullTime() {
         int mostFullTime = 0;
      	
         while ((mostFullTime < staffList.length) && !(staffList[mostFullTime] instanceof FullTimeStaff)) {
            mostFullTime++;
         }
      	
         if (mostFullTime < staffList.length) {
            for (int i = mostFullTime + 1; i < staffList.length; i++) {
               if (staffList[i] instanceof FullTimeStaff) {
                  if (((FullTimeStaff)staffList[i]).compareToSickDay((FullTimeStaff)staffList[mostFullTime]) < 0) {
                     mostFullTime = i;
                  }
               }
            }
         
            return ((FullTimeStaff)staffList[mostFullTime]);
         }
         else {
            return null;
         }
      }
   	
       public PartTimeStaff mostAbsentPartTime() {
         int mostPartTime = 0;
      	
         while ((mostPartTime < staffList.length) && !(staffList[mostPartTime] instanceof PartTimeStaff)) {
            mostPartTime++;
         }
      	System.out.println(mostPartTime);
         if (mostPartTime < staffList.length) {
            for (int i = mostPartTime + 1; i < staffList.length; i++) {
               if (staffList[i] instanceof PartTimeStaff) {
                  if (((PartTimeStaff)staffList[i]).compareToSickDay((PartTimeStaff)staffList[mostPartTime]) > 0) {
                     mostPartTime = i;
                  }
               }
            }
         
            return ((PartTimeStaff)staffList[mostPartTime]);
         }
         else {
            return null;
         }
      
      }
   	
       public void yearlySickDayReset() {
         for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
               staffList[i].resetSickDay();
            }
         }
      }
   	
       public void monthlySickDayReset() {
         for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
               staffList[i].resetSickDay();
            }
         }
      }
   	
   }