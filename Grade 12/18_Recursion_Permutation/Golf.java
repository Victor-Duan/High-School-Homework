   public class Golf {
      public static void main(String[] args) {
         int [] clubs = {40,30,15};
         System.out.println(findMinShots(clubs, 100));
      }
   
      public static int findMinShots(int[] clubs, int distance) {
      
			int numShots;
			
         if (distance == 0) {
            numShots = 0;
         }
         else if (distance < 0) {
            numShots = -1;
         }
         else {
				for (int i = 0; i < clubs.length; i++) {
					numShots = findMinShots(clubs, distance - clubs[i]) + 1;
				}
				//return findMinShots(clubs, distance - clubs[i]) + 1;
         }
			return numShots;
      	      	
      }
   }