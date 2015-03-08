/* Victor Duan
   ICS3U1
   Question 5.9
   February 12, 2013
   This program asks the user for the number of burgers, fries and soda, and displays the total, the 8% gst and 5% pst, and the total cost
*/

import java.util.*;

public class FastFood{
	public static void main(String[] args){
		int burgerNum,friesNum,drinkNum; //variable declaration
		double paidAmount, totalBurger,totalFries, totalDrink ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee, enter the number of burgers the customer wants: "); //user input
		burgerNum = sc.nextInt();
		System.out.print("Employee, enter the number of orders of fries the customer wants: ");
		friesNum = sc.nextInt();
		System.out.print("Employee, enter the number of orders of drinks the customer wants: ");
		drinkNum = sc.nextInt();
		
		totalBurger = burgerNum * 1.69;
		totalFries = friesNum * 1.09;
		totalDrink = drinkNum * 0.99;
		//variables are assigned values at this point now that burgerNum, friesNum and drinkNum have values

		System.out.println("The cost of the burgers is: $" + totalBurger);//calculations
		System.out.println("The cost of the fries is: $" + totalFries);
	   System.out.println("The cost of the drinks is: $" + totalDrink);
		
		System.out.println("The PST for the order is: $" + (totalBurger + totalFries + totalDrink)*0.08);//tax calculations
		System.out.println("The GST for the order is: $" + (totalBurger + totalFries + totalDrink)*0.05);
		
		System.out.println("The total cost of the order is: $" + (totalBurger + totalFries + totalDrink)*1.13);	
		
		//start of 7b
		//asks the user to input amounr customer paid, displays change required
		System.out.println("How much money did the customer give you? ");
		paidAmount = sc.nextDouble();
		
		//will display negative number if amount customer gave is too small
		//makes sense, but not user friendly
		System.out.println("You owe the customer $" + (paidAmount - (totalBurger + totalFries + totalDrink)*1.13)+ " in change");
		
		
	}
}