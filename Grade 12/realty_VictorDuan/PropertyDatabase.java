/*
 File Name: PropertyDatabase.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for utilizing Property and its subclasses, as well as PrimarySpec, and SecondarySpec and its subclasses
 				  This class has an array of Properties, which is manipulated to perform functions such as:
				  creating an array of properties from a text file
				  finding a property by its ID
				  printing all properties that match the user's specs
				  finding the average price of a property in a given zone
				  finding the largest Condo			  
*/  
   import java.io.*;
	
   public class PropertyDatabase {
		//fields for PropertyDatabase
      private Property[] list;
      private int numProperty;
      private BufferedReader in;
   	
		//text file name will always be the same
		//a "N" constant is not needed since the opposite of Y (true) is simply false
      private static final String FILENAME = "data.txt";
      private static final String SPECPRESENT = "Y";
   	
		//identifies whether the information will pertain to a house or condo
      private static final String HOUSEIDENTIFIER = "house";
      private static final String CONDOIDENTIFIER = "condo";
   	
		//accessors to get constants to use in the runner method
   	public static String getHOUSEIDENTIFIER() {
			return HOUSEIDENTIFIER;
		}
		
		public static String getCONDOIDENTIFIER() {
			return CONDOIDENTIFIER;
		}
		
		public static String getSPECPRESENT() {
			return SPECPRESENT;
		}
		
		//method which reads in file and creates the array with the read info
      public void loadPropertyList() {
      
         try {
            in = new BufferedReader(new FileReader(FILENAME));
         	
            String propertyTypeRead;
            int idRead;
            String addressRead;
            String zoneCodeRead;
            double priceRead;
            double sizeRead;
            int numBedroomRead;
            boolean secSpec1Read;
            boolean secSpec2Read;
            boolean secSpec3Read;
            boolean secSpec4Read;
            boolean secSpec5Read;
         	
				//gets number of objects in file and creates array
            numProperty = Integer.parseInt(in.readLine());
            list = new Property[numProperty];
            in.readLine();
         	
				//gathers information for each object in the array, and creates them depending on whether they are a House or Condo
            for (int i = 0; i < numProperty; i++) {
            
               propertyTypeRead = in.readLine();
               idRead = Integer.parseInt(in.readLine());
               addressRead = in.readLine();
            	
               zoneCodeRead = in.readLine();
               priceRead = Double.parseDouble(in.readLine());
               sizeRead = Double.parseDouble(in.readLine());
               numBedroomRead = Integer.parseInt(in.readLine());
            	
               secSpec1Read = hasSpec(in.readLine());
               secSpec2Read = hasSpec(in.readLine());
               secSpec3Read = hasSpec(in.readLine());
               secSpec4Read = hasSpec(in.readLine());
               secSpec5Read = hasSpec(in.readLine());
            	
               if (propertyTypeRead.equals(HOUSEIDENTIFIER)) {
                  list[i] = new House(idRead, addressRead,
                     					zoneCodeRead, priceRead, sizeRead, numBedroomRead,
                     					secSpec1Read, secSpec2Read, secSpec3Read, secSpec4Read, secSpec5Read);
               }
               else if (propertyTypeRead.equals(CONDOIDENTIFIER)) {
                  list[i] = new Condo(idRead, addressRead,
                     					zoneCodeRead, priceRead, sizeRead, numBedroomRead,
                     					secSpec1Read, secSpec2Read, secSpec3Read, secSpec4Read, secSpec5Read);
               
               }
               in.readLine();
            }
         	
            in.close();
         }
            catch (IOException iox) {
               System.out.println("ERROR BUDDY");
            }
      
      }
   	
   	//helper method which indicates whether or not a spec is present
		//this method is not necessary, but I like the way I can call this method without an implicit object
		//in the case that we are not comparing strings for specs anymore,
		//other methods with the same name but different parameters can be used
		
      public static boolean hasSpec(String spec) {
         return (spec.equals(SPECPRESENT));
      }
   	
		//method which will return a Property object that has the same ID as the given ID
		//returns null if there are no objects with that ID
      public Property searchByID (int givenID) {
      	
         boolean exit = false;
         int currentProperty = 0;
			
         while ((currentProperty < numProperty) && (list[currentProperty].getID() !=  givenID)) {
				currentProperty++;
         }
      	
         if (currentProperty != numProperty) {
            return list[currentProperty];
         }
         else {
            return null;
         }
      }
   	
   	//method that prints out all Property objects that match all the user's specs
      public void printAllMatch(Property other, double percentage) {
         if (other != null){
            for (int i = 0; i < numProperty; i++) {
               if (list[i].matchProperty(other, percentage)) {
                  System.out.print(list[i]);
                  System.out.print(list[i].getPrimSpec());
                  System.out.print(list[i].getSecSpec());
						System.out.println();
               }
            }
         }
      }
   	
		//finds the average price of a property in a given zone
		//returns -1 if no properties are in the given zone
      public double averagePriceInZone (String givenZoneCode) {
         double avgPrice = 0;
         int numInZone = 0;
      	
         for (int i = 0; i < numProperty; i++) {
            if (givenZoneCode.equals((list[i].getPrimSpec()).getZoneCode())) {
               avgPrice += (list[i].getPrimSpec()).getPrice();
               numInZone++;
            }
         }
      	
         if (numInZone != 0) {
            return avgPrice/numInZone;
         }
         else {
            return -1;
         }
      }
   	
		//method that returns the Condo with the largest size
		//returns null if no Condo objects are in the array
      public Condo largestCondo () {
         int largestCondo = 0;
      	
      	//find first condo object in the array
         while (largestCondo < numProperty && !(list[largestCondo] instanceof Condo)) {
            largestCondo++;
         }
      	
      	//first if structure checks to make sure that there is at least one Condo in the array
         if (largestCondo < numProperty) {
            for (int i = largestCondo; i < numProperty; i++) {
               if (list[i] instanceof Condo) {
                  if (((list[i].getPrimSpec()).getSize()) > ((list[largestCondo].getPrimSpec()).getSize())) {
                     largestCondo = i;
                  }
               }
            }
            return (Condo)list[largestCondo];
         }
         
         else {
            return null;
         }
      }
   	
		//method that prints all properties and specs
      public void printAllProperty() {
         for (int i = 0; i < numProperty; i++) {
            System.out.println(list[i]);
            System.out.println(list[i].getPrimSpec());
            System.out.println(list[i].getSecSpec() + "\n");
         }
      }
   	
		//method that prints all House objects and specs
      public void printAllHouse() {
         for (int i = 0; i < numProperty; i++) {
            if (list[i] instanceof House) {
               System.out.println(list[i]);
               System.out.println(list[i].getPrimSpec());
               System.out.println(list[i].getSecSpec() + "\n");
            
            }
         }
      }
   	
		//method that prints all Condo objects and specs
      public void printAllCondo() {
         for (int i = 0; i < numProperty; i++) {
            if (list[i] instanceof Condo) {
               System.out.println(list[i]);
               System.out.println(list[i].getPrimSpec());
               System.out.println(list[i].getSecSpec() + "\n");
            }
         }
      }
   }