/*
 File Name: Condo.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for creating Condo objects
 				  The difference between House and Condo is what type of secondary specifications it has, which is addressed here
*/
  
   public class Condo extends Property {
   	
   	//constructor for Condo
   	//this constructor will help to differentiate between which secSpec to use
   	//in the case of Condo, a CondoSpec object is created
      public Condo (int id, String address,
      String zoneCode, double price, double size, int numBedroom,
      boolean secSpec1, boolean secSpec2, boolean secSpec3, boolean secSpec4, boolean secSpec5) {
      
      	//calls the super constructor to create the object
         super (id, address,
            new PrimarySpec(zoneCode, price, size, numBedroom),
            new CondoSpec(secSpec1, secSpec2, secSpec3, secSpec4, secSpec5));
      
      }
   	
   }