/*
 File Name: Realty.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for using the PropertyDatabase class to perform the functions listed in the menu
				  
*/    
	
   import java.util.*;

   public class Realty {
      public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         PropertyDatabase pdb = new PropertyDatabase();
         int menuOption;
         final int EXITOPTION = -1;
         boolean exit = false;
      	
      	//id entered by user used in menu option 5
         int givenID;
      	
      	//matching is used to store the Property that has the same ID as entered in option 5
      	//it also stores the phantom property used for comparisons in optino 6
         Property matching;
      	
      	//variables used for menu option 6
         String propertyType;
         String zoneCode;
         double price;
         double size;
         int numBedrooms;
         boolean spec1;
         boolean spec2;
         boolean spec3;
         boolean spec4;
         boolean spec5;
         double percentage;
      	
      	//variables used for menu option 7
         String enteredZone;
         double avgPrice;
      	
      	//variables used for menu option 8
         Condo biggestCondo;
      	
      	//loops until the user enters -1 to quit
         do { 
            printMenu();
            System.out.print("\nEnter the number of the option you want to perform: ");
            menuOption = sc.nextInt();
         	
         	//quits out of the loop if user enters -1
				//performs the task in the menu based on what number the user entered
            switch (menuOption) {
               case -1:
                  exit = true;
               case 1:
                  pdb.loadPropertyList();
                  break;
               
               case 2:
                  pdb.printAllProperty();
                  break;
               
               case 3:
                  pdb.printAllCondo();
                  break;
               
               case 4:
                  pdb.printAllHouse();
                  break;
               
               case 5:
                  System.out.print("Enter in the ID of the property you're looking for: ");
                  givenID = sc.nextInt();
                  matching = pdb.searchByID(givenID);
                  
                  if (pdb.searchByID(givenID) == null){
                     System.out.println("NOT FOUND IN DATABASE");
                  }
                  else {
                     System.out.println(matching);
                     System.out.println(matching.getPrimSpec());
                     System.out.println(matching.getSecSpec() + "\n");
                  }
                  break;
               
               case 6:
                  sc.nextLine();
                  System.out.print("Enter type of property you wich to purchase: ");
                  propertyType = sc.nextLine();
                  
                  System.out.println("Enter the following information: ");
                  System.out.print("Desired zone: ");
                  zoneCode = sc.nextLine();
                  System.out.print("Maximum price: ");
                  price = sc.nextDouble();
                  System.out.print("Minimum size: ");
                  size = sc.nextDouble();
                  System.out.print("Number of bedrooms: ");
                  numBedrooms = sc.nextInt();
                  System.out.println();
                  
                  System.out.println("Enter Y if you want the following, and N if you do not");
                  sc.nextLine();
                  
                  if (propertyType.equals(PropertyDatabase.getHOUSEIDENTIFIER())) {
                                 	
                     System.out.print("Vacuum: ");
                     spec1 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Air Conditioning: ");
                     spec2 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Fireplace: ");
                     spec3 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Hardwood: ");
                     spec4 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Finished Basement: ");
                     spec5 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     //ID and address are initialized as 0 and "none" since this property does not exist in the list
                     //and they are not needed to check matching properties
                     matching = new House(0, "none",
                           zoneCode, price, size, numBedrooms,
                           spec1, spec2, spec3, spec4, spec5);
                  }
                     
                     //it is assumed that for right now the only two types of Property are House and Condo
                     //if you have an else if statement for Condo, the code will not compile because the phantom property has the possibility of not being created
                     //even though in the confines of the code it will definitely be one or the other
                  else {
                     
                     System.out.print("Pool: ");
                     spec1 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Excercise: ");
                     spec2 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Locker: ");
                     spec3 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Hydro Included: ");
                     spec4 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     System.out.print("Cable Included: ");
                     spec5 = PropertyDatabase.hasSpec(sc.nextLine());
                     
                     matching = new Condo(0, "none",
                           zoneCode, price, size, numBedrooms,
                           spec1, spec2, spec3, spec4, spec5);
                     
                  }
                  
                  System.out.print("Enter the percent of secondary specifications you want fulfilled: ");
                  percentage = sc.nextDouble();
                  
                  pdb.printAllMatch(matching, percentage);
                  
                  break;
               
               case 7:
                  sc.nextLine();
                  
                  System.out.print("Enter a zone: ");
                  enteredZone = sc.nextLine();
                  
                  avgPrice = pdb.averagePriceInZone(enteredZone);
                  if (avgPrice != -1) {
                     System.out.println("Average price in zone " + enteredZone + " is: $" + avgPrice);
                  }
                  else {
                     System.out.println("No properties in this zone");
                  }
                  System.out.println();
                  
                  break;
               
               case 8:
                  biggestCondo = pdb.largestCondo();
                  System.out.println(biggestCondo);
                  System.out.println(biggestCondo.getPrimSpec());
                  System.out.println(biggestCondo.getSecSpec());
                  break;
               
               default:
                  System.out.println("Invalid option");
               
            }
         
         } while(!exit);
      
      }
   	
		//helper method to print out the menu each time
      private static void printMenu() {
         System.out.println("1: Load properties from a file");
         System.out.println("2: List all properties");
         System.out.println("3: List all condominiums");
         System.out.println("4: List all houses");
         System.out.println("5: Search for a property by ID");
         System.out.println("6: Search for properties by specifications");
         System.out.println("7: Print average price of all properties in the specified zone");
         System.out.println("8: Find the largest condo");
         System.out.println("Enter -1 to exit this program");
      }
   
   }