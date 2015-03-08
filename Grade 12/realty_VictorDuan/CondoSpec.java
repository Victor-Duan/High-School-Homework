/*
 File Name: CondoSpec.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: This class is responsible for creating CondoSpec objects
 				  A branch of SecondarySpec, this class has the 
				  capability to confirm whether or not a property's secondary specs match the user's desires
				  
				  
*/  
	
	 public class CondoSpec extends SecondarySpec {
      private boolean pool;
      private boolean exRoom;
      private boolean locker;
      private boolean hydroIncluded;
      private boolean cableIncluded;
		//constant which is the number of total specs
      private static final double NUMSPECS = 5;
   	
		//constructor initializing all fields to what the user has entered 
       public CondoSpec(boolean pool, boolean exRoom, boolean locker, boolean hydroIncluded, boolean cableIncluded) {
         this.pool = pool;
         this.exRoom = exRoom;
         this.locker = locker;
         this.hydroIncluded = hydroIncluded;
         this.cableIncluded = cableIncluded;
      }
   	
		//checks to see how many specs match the user's specifications
		//returns a boolean if the percent matching is greater than the percentage
		//of the amount the user wants
       public boolean matchSpec(SecondarySpec userEntries, double percentage) {
      
         double fulfilledSpecs = 0;
      	
			//checks if each field matches individually
			//to overwrite the abstract method in SecondarySpec, the object field must be SecondarySpec
			//therefore a check is needed to make sure the object is a CondoSpec
			//and casting the object is required to compare
         if (userEntries instanceof CondoSpec && userEntries != null) {
            if (pool == ((CondoSpec)userEntries).pool) {
               fulfilledSpecs++;
            }
            if (exRoom == ((CondoSpec)userEntries).exRoom) {
               fulfilledSpecs++;
            }
            if (locker == ((CondoSpec)userEntries).locker) {
               fulfilledSpecs++;
            }
            if (hydroIncluded == ((CondoSpec)userEntries).hydroIncluded) {
               fulfilledSpecs++;
            }
            if (cableIncluded == ((CondoSpec)userEntries).cableIncluded) {
               fulfilledSpecs++;
            }
         }
      
         return (fulfilledSpecs/NUMSPECS * 100 >= percentage);
      }
		
		//toString which prints out availability of all specs
		public String toString() {
			String poolInfo = "Pool: ";
			if (pool) {
				poolInfo += "Yes\n";
			}
			else {
				poolInfo +="No\n";
			}
			
			String exRoomInfo = "Excercise Room: ";
			if (exRoom) {
				exRoomInfo += "Yes\n";
			}
			else {
				exRoomInfo += "No\n";
			}
			
			String lockerInfo = "Lockers: ";
			if (locker) {
				lockerInfo += "Yes\n";
			}
			else {
				lockerInfo += "No\n";
			}
			
			String hydroIncludedInfo = "Hydro Included: ";
			if (hydroIncluded) {
				hydroIncludedInfo += "Yes\n";
			}
			else {
				hydroIncludedInfo += "No\n";
			}
			
			String cableIncludedInfo = "Cable Included: ";
			if (cableIncluded) {
				cableIncludedInfo += "Yes\n";
			}
			else {
				cableIncludedInfo += "No\n";
			}
			
			return poolInfo + exRoomInfo + lockerInfo + hydroIncludedInfo + cableIncludedInfo;
		}
   	
   }