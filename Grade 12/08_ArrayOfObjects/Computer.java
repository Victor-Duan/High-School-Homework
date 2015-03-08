/*
 File Name: Computer.java
 Name: Victor Duan
 Class: ICS4U1
 Date: October 9, 2013
 Description:
*/

    public class Computer {
      private String serialCode;
      private String manufacturer;
      private int yearOfMake;
      private int yearOfPurchase;
      private double processorSpeed;
      private double ramSize;
      private int warrantyExpiryYear;
   
       public Computer() {
         serialCode = "A123456Z";
         manufacturer = "Victor";
         yearOfMake = 2013;
         yearOfPurchase = 2013;
         processorSpeed = 1;
         ramSize = 1;
         warrantyExpiryYear = 2014;
      }
   
       public Computer (String serialCode, String manufacturer, int yearOfMake,
       					int yearOfPurchase, double processorSpeed, double ramSize, int warrantyExpiryYear) {
         this.serialCode = serialCode;
         this.manufacturer = manufacturer;
         this.yearOfMake = yearOfMake;
         this.yearOfPurchase = yearOfPurchase;
         this.processorSpeed = processorSpeed;
         this.ramSize = ramSize;
         this.warrantyExpiryYear = warrantyExpiryYear;
      }
   //accessor methods
   
       public String getSerialCode() {
         return serialCode;
      }
   
       public String getManufacturer() {
         return manufacturer;
      }
   
       public int getYearOfMake() {
         return yearOfMake;
      }
   
       public int getYearOfPurchase() {
         return yearOfPurchase;
      }
   
       public double getProcessorSpeed() {
         return processorSpeed;
      }
   
       public double getRamSize() {
         return ramSize;
      }
   
       public int getWarrantyExpiryYear() {
         return warrantyExpiryYear;
      }
   
   //mutator methods
   
       public void setSerialCode(String serialCode) {
         this.serialCode = serialCode;
      }
   
       public void setManufacturer(String manufacturer) {
         this.manufacturer = manufacturer;
      }
   
       public void setYearOfMake(int yearOfMake) {
         this.yearOfMake = yearOfMake;
      }
   
       public void getYearOfPurchase(int yearOfPurchase) {
         this.yearOfPurchase = yearOfPurchase;
      }
   
       public void getProcessorSpeed(double processorSpeed) {
         this.processorSpeed = processorSpeed;
      }
   
       public void getRamSize(double ramSize) {
         this.ramSize = ramSize;
      }
   
       public void getWarrantyExpiryYear(int expiryYear) {
         this.warrantyExpiryYear = warrantyExpiryYear;
      }
   	
   	//method that compares the speed of two computers, and returns the object that is faster
		public Computer compareSpeed (Computer other) {
			if (processorSpeed >= other.processorSpeed) {
				return this;
			}
			else {
				return other;
			}
		}
		
		//method that compares the ram of 2 computers, and returns there object that has more ram
		public Computer compareRamSize(Computer other) {
			if (ramSize >= other.ramSize) {
				return this;
			}
			else {
				return other;
			}
		}
		
		//method which compares the ages of 2 computers, and returns the computer which is newer
		public Computer compareAge(Computer other) {
			if (yearOfMake >= other.yearOfMake) {
				return this;
			}
			else {
				return other;
			}
		}
		
   //toString method which will allow information about the computer to be printed
       public String toString() {
      
         String serialCodeInfo = "Serial Code: " + serialCode + "\n";
         String manufacturerInfo = "Manufacturer: " + manufacturer + "\n";
         String yearOfMakeInfo = "Year of Make: " + yearOfMake + "\n";
         String yearOfPurchaseInfo = "Year of Purchase: " + yearOfPurchase + "\n";
         String processorSpeedInfo = "Processor Speed: " + processorSpeed + "GHz\n";
         String ramSizeInfo = "RAM Size: " + ramSize + "GB\n";
         String warrantyExpiryYearInfo = "Year of Warranty Expiration: " + warrantyExpiryYear + "\n";
         return serialCodeInfo + manufacturerInfo + yearOfMakeInfo + yearOfPurchaseInfo + processorSpeedInfo + ramSizeInfo + warrantyExpiryYearInfo;
      }
   }