/*
 File Name: House.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for creating House objects
 				  The difference between House and Condo is what type of secondary specifications it has, which is addressed here
*/  
  
   public class House extends Property {
   
		//constructor for House
		//this constructor will help to differentiate between which secSpec to use
		//in the case of House, a HouseSpec object is created

      public House (int id, String address,
      String zoneCode, double price, double size, int numBedroom,
      boolean secSpec1, boolean secSpec2, boolean secSpec3, boolean secSpec4, boolean secSpec5) {
      
         super (id, address,
            new PrimarySpec(zoneCode, price, size, numBedroom),
         	new HouseSpec(secSpec1, secSpec2, secSpec3, secSpec4, secSpec5));
      
      }
   }