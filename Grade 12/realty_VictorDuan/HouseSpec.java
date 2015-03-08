/*
 File Name: CondoSpec.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for creating HouseSpec objects
 				  A branch of SecondarySpec, this class has the 
				  capability to confirm whether or not a property's secondary specs match the user's desires
				  
				  
*/  
  
    public class HouseSpec extends SecondarySpec{
      private boolean vacuum;
      private boolean ac;
      private boolean fireplace;
      private boolean hardwood;
      private boolean basement;
   	//constant which is the number of total specs
      private static final double NUMSPECS = 5;
   	
   	//constructor initializing all fields to what the user has entered 
       public HouseSpec(boolean vacuum, boolean ac, boolean fireplace, boolean hardwood, boolean basement) {
         this.vacuum = vacuum;
         this.ac = ac;
         this.fireplace = fireplace;
         this.hardwood = hardwood;
         this.basement = basement;
      }
   	
   	//checks to see how many specs match the user's specifications
   	//returns a boolean if the percent matching is greater than the percentage
   	//of the amount the user wants
       public boolean matchSpec(SecondarySpec userEntries, double percentage) {
      
         double fulfilledSpecs = 0;
      	
      	//checks if each field matches individually
      	//to overwrite the abstract method in SecondarySpec, the object field must be SecondarySpec
      	//therefore a check is needed to make sure the object is a HouseSpec
      	//and casting the object is required to compare
         if (userEntries instanceof HouseSpec && userEntries != null) {
            if (vacuum == ((HouseSpec)userEntries).vacuum) {
               fulfilledSpecs++;
            }
            if (ac == ((HouseSpec)userEntries).ac) {
               fulfilledSpecs++;
            }
            if (fireplace == ((HouseSpec)userEntries).fireplace) {
               fulfilledSpecs++;
            }
            if (hardwood == ((HouseSpec)userEntries).hardwood) {
               fulfilledSpecs++;
            }
            if (basement == ((HouseSpec)userEntries).basement) {
               fulfilledSpecs++;
            }
         }
      
         return (fulfilledSpecs/NUMSPECS * 100 >= percentage);
      }
   	
		//toString which prints out availability of all specs
       public String toString() {
         String vacuumInfo = "Vacuum: ";
         if (vacuum) {
            vacuumInfo += "Yes\n";
         }
         else {
            vacuumInfo +="no\n";
         }
      	
         String acInfo = "Air Conditioning: ";
         if (ac) {
            acInfo += "Yes\n";
         }
         else {
            acInfo += "No\n";
         }
      	
         String fireplaceInfo = "Fireplace: ";
         if (fireplace) {
            fireplaceInfo += "Yes\n";
         }
         else {
            fireplaceInfo += "No\n";
         }
      	
         String hardwoodInfo = "Hardwood: ";
         if (hardwood) {
            hardwoodInfo += "Yes\n";
         }
         else {
            hardwoodInfo += "No\n";
         }
      	
         String basementInfo = "Basement: ";
         if (basement) {
            basementInfo += "Yes\n";
         }
         else {
            basementInfo += "No\n";
         }
      	
         return vacuumInfo + acInfo + fireplaceInfo + hardwoodInfo + basementInfo;
      }
   }