/*
 File Name: LabTester.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 15, 2013
 Description:
*/

   import java.io.*;
   import java.util.*;

    public class LabTester {
       public static void main(String[] args) {
      
         try {
            Scanner sc = new Scanner(System.in);
            BufferedReader in = new BufferedReader(new FileReader("08_computer.txt"));
            int maxCapacity;
            int numInstalled;
            int currentCompIndex = 0;
            int installationStep;
         	
            String serialCode;
            String manufacturer;
            int yearOfMake;
            int yearOfPurchase;
            double processorSpeed;
            double ramSize;
            int warrantyExpiryYear;
         
            System.out.println("Enter the maximum amount of computers that can fit in the lab: ");
            maxCapacity = sc.nextInt();
         	
				//reads in the number of computers to be installed
				//if the number to be installed is more than the max capacity
				//computers are to be installed until there is no more room
            numInstalled = Integer.parseInt(in.readLine());
            if (numInstalled > maxCapacity) {
               numInstalled = maxCapacity;
            }
				
				Lab l1 = new Lab(maxCapacity, numInstalled);
         	
				//reads in the computers information from the given text document
            for (int i = 0; i < numInstalled; i++) {
               serialCode = in.readLine();
               manufacturer = in.readLine();
               yearOfMake = Integer.parseInt(in.readLine());
               yearOfPurchase = Integer.parseInt(in.readLine());
               processorSpeed = Double.parseDouble(in.readLine());
               ramSize = Double.parseDouble(in.readLine());
               warrantyExpiryYear = Integer.parseInt(in.readLine());
            	l1.installComputer(serialCode, manufacturer, yearOfMake, yearOfPurchase, processorSpeed, ramSize, warrantyExpiryYear);
            }
         	
				System.out.println(l1.averageAge());
				
				Computer newest = l1.newestComputer();
				System.out.println(newest);
				
				Computer fastest = l1.fastestComputer();
				Computer mostRam = l1.mostRam();
				
				if (fastest.getRamSize() == mostRam.getRamSize()) {
					System.out.println("The fastest computer also has the most RAM");
				}
				else {
					System.out.println("The fastest computer does not have the most RAM");
				}
				
				sc.nextLine();
				
				System.out.println("Enter a manufacturer");
				String givenManufacturer = sc.nextLine();
				System.out.println(l1.sameManufacturer(givenManufacturer));
				
				System.out.println("Enter the current year: ");
				int currentYear = sc.nextInt();
				Computer[] expiring =  l1.expiresNextYear(currentYear);
				
				for (int i = 0; i < expiring.length; i++) {
					System.out.println(expiring[i].getSerialCode());
				}
				System.out.println(expiring.length);				
				
         }
         	
         
         
             catch (IOException iox) {
               System.out.println("You suck");
            }
      
      
      }
   }