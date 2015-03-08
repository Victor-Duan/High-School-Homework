/*
	File Name: Temperature.java
	Name: Victor Duan
	Class: ICS3U1
	Date: March 7, 2013
	Description: The program outputs an appropriate message based on what temperature they input
*/

   import java.util.*;

    public class Temperature {
       public static void main(String[] args) {
		 
		   //variable declaration
         Scanner sc = new Scanner(System.in);
         double temperature;
         final int COLDEST = -18;
         final int ZERO = 0;
         final int VERYCOOL = 10;
         final int MODERATE = 20;
         final int WARM = 30;
         final int HOT = 40;
         final int BOILINGPOINT = 100;
      	
			//gathers the current temperature
         System.out.print("Enter the temperature in degrees Celsius: ");
         temperature = sc.nextDouble();
      	
			//checks to see what category the current temp. belongs to
			//then outputs the appropriate message
			//if temperature greater than 100 is entered
			//no output is displayed
         if (temperature < COLDEST) {
            System.out.println("very cold");
         }
         else if (temperature >= COLDEST && temperature < 0) {
            System.out.println("cold");
         }
         else if (temperature == ZERO) {
            System.out.println("freezing point of water");
         }
         else if (temperature > ZERO && temperature <= VERYCOOL) {
            System.out.println("very cool");
         }
         else if (temperature > VERYCOOL && temperature <= MODERATE) {
            System.out.println("moderate");
         }
         else if (temperature > MODERATE && temperature <= WARM) {
            System.out.println("warm");
         }
         else if (temperature > WARM && temperature <= HOT) {
            System.out.println("hot");
         }
         else if (temperature > HOT && temperature < BOILINGPOINT) {
            System.out.println("extremely hot");
         }
         else if (temperature == BOILINGPOINT){
            System.out.println("boiling point of water");
         }
      }
   }