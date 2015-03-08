   public class Permutations {
      public static void main(String[] args) {
      //System.out.println(permute("abc"));
         permute("abcd");
      }
   
      public static void permute (String toPermute) {
         permute(toPermute, "");
      }
   
      public static void permute(String unpermute, String permute) {
      	String newPermute;
			String newUnpermute;
      	//smaller problem is adding the first char to the combo of other characters
      	
         if (unpermute.length() == 1) {
            System.out.println(permute + unpermute);
         }
         else {
            for (int i = 0; i < unpermute.length(); i++) {
               if (i == unpermute.length() - 1) {
                  newUnpermute = unpermute.substring(0,i);
               }
               else {
                  newUnpermute = unpermute.substring(0,i) + unpermute.substring(i+1);
               }
               newPermute = permute + unpermute.charAt(i);
					
					permute(newUnpermute, newPermute);
            }
         }
      	
      	
      //          String newUnpermute;
      //          String newPermute;
      //       
      //          for (int i = 0; i < unpermute.length(); i++) {
      //             if (i == unpermute.length() - 1) {
      //                newUnpermute = unpermute.substring(0,i);
      //             }
      //             else {
      //                newUnpermute = unpermute.substring(0,i) + unpermute.substring(i+1);
      //             }
      //             newPermute = permute + unpermute.charAt(i);
      //          
      //             System.out.println(permute + permute(newUnpermute, newPermute));
      //          }
         
      }
   
   }