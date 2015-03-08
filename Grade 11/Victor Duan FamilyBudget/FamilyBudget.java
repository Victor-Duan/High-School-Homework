/* 
	File Name: FamilyBudget.java
	Name: Victor Duan
	Class: ICS3U1
	Date: February 22, 2013
	Description: This program produces a report about
					 income, the tax, investment and other expenses they have paid
					 based on input received from the user
*/

	import java.util.*;

	public class FamilyBudget {
		public static void main(String[] args){
		
			//variable declaration
			//sorted by part
			
			//weeks and hoursWorked are set as a double in case the user worked something like 2.5 weeks
			//not really how people say it, more of a safety net
			Scanner sc = new Scanner(System.in);
			int salary, houseSold, carSold;
			double houseCost, carCost;
			double hourRate, hoursWorked, weeks;
			
			double incomeMama, incomeJunior, totalIncome, averageIncome;
			double papaTax, mamaTax, juniorTax, totalTax, overallTaxRate;
			double netIncome, averageNetIncome;
			
			int stockWhole, stockNumerator, stockDenominator, numStocks;
			double investmentAmount, decimalStockValue, actualAmountInvested, leftoverInvestment;
		
			int discountMonths;
			double unitNum, totalWDiscount, totalWRebate, totalEnergy;			

			double totalMinutes, minutesBlock, costBlock, totalPhone;
			
			double distance, fuelEfficiency, averageGasPrice, totalGas;
			String brand, type;
			
			double mortgageBWAmount, mortgageTotal;
			
			double otherTotal, amountGroceries, amountEntertainment, amountSavings, expensesWO_Other;
			
			double totalExpenses;
			
			//constant declaration and initialization
			//sorted by part
			
			final double HOUSECOM = 0.125;
			final double CARCOM = 0.098;
			final int MONTHS = 12;
			
			final double PAPATAXRATE = 0.2;
			final double MAMATAXRATE = 0.15;
			final double JUNIORTAXRATE = 0.05;

			final double INVESTMENTPERCENT = 0.08;
			
			final double UNITCOST = 0.16;
			final double UTILITYTAX = 0.02;
			final double ENERGYDISCOUNT = 0.1;
			final int ENERGYREBATE = 50;
			
			final int MORTGAGEPAYNUM = 26;
			
			final double GROCERIESPERCENT = 0.6;
			final double ENTERTAINMENTPERCENT = 0.25;
			final double SAVINGPERCENT = 0.15;
			
			//part 1: INCOME
			
			//headers are placed for improved readability
			System.out.println("1. INCOME");
			
			//gathers variables for Papa's, Mama's and Junior's income respectively
			System.out.print("\nWhat is Papa's yearly salary? ");
			salary = sc.nextInt();
			
			System.out.print("\nWhat is the total amount of money from house insurance sold by Mama Jackson? ");
			houseCost= sc.nextDouble();
			System.out.print("What is the total amount of money from car insurance sold by Mama Jackson? ");
			carCost= sc.nextDouble();
			
			System.out.print("\nWhat is Junior's hourly rate? ");
			hourRate = sc.nextDouble();
			System.out.print("How many hours does Junior work in a week? ");
			hoursWorked = sc.nextDouble();
			System.out.print("How many weeks does Junior work in a year? ");
			weeks = sc.nextDouble();
			
			//calculations to find income for Mama and Junior, as well as total income/ average monthly income
			incomeMama = (HOUSECOM * houseCost) + (CARCOM * carCost);
			incomeJunior = (hourRate * hoursWorked * weeks);
			totalIncome = salary + incomeMama + incomeJunior;
			averageIncome = totalIncome / MONTHS;
			
			//final output for first section
			//outputs each person's income, as well as total and average monthly income
			System.out.println("\nPapa will make $" + salary + " in 2012");
			System.out.println("Mama will make $" + incomeMama + " in 2012");
			System.out.println("Junior will make $" + incomeJunior + " in 2012");
			System.out.println("The total income for the family is $" + totalIncome);
			System.out.println("The average monthly salary for the family is $" + averageIncome);
			
			//part two : TAXES
			
			//creates a pause so that the first two parts do not flash by
			//first sc.nextLine flushes out the \n created from the last user input
			//the second one allows for the program to gather anything to be entered
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("\n2. TAXES");
			
			//calculations to find individual and total taxes
			papaTax = PAPATAXRATE * salary;
			mamaTax = MAMATAXRATE * incomeMama;
			juniorTax = JUNIORTAXRATE * incomeJunior;
			totalTax = papaTax + mamaTax + juniorTax;
			
			//calculations for overall tax rate, net income and average monthly net income
			//note that netIncome = (1 - (totalTax / totalIncome)) * totalIncome as well
			overallTaxRate = (totalTax / totalIncome) * 100;
			netIncome = totalIncome - totalTax;
			averageNetIncome = netIncome / MONTHS;
			
			//outputs individual taxes as well as total tax
			System.out.println("\nPapa has to pay $" + papaTax + " in taxes");
			System.out.println("Mama has to pay $" + mamaTax + " in taxes");
			System.out.println("Junior has to pay $" + juniorTax + " in taxes");
			System.out.println("\nThe family has to pay $" + totalTax + " in taxes total");
			
			//outputs overall tax rate, as well as net income/monthly net income
			//blank line inserted purely for cosmetic purposes
			System.out.println("\nThe overall tax rate for the family is " + (overallTaxRate) + "%");
			System.out.println("The net income for the family in 2012 is $" + netIncome);
			System.out.println("The average monthly net income for 2012 is $" + averageNetIncome + " per month");
			
			//part 3 : INVESTMENT
			
			//only requires one sc.nextLine because there is no \n to flush out
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			
			System.out.println("\n3. INVESTMENT");
			
			//gathering the price of the stock
			System.out.print("Please enter the whole dollar portion of the stock: ");
			stockWhole = sc.nextInt();
			System.out.print("Please enter the numerator for the fraction portion of the stock: ");
			stockNumerator = sc.nextInt();
			System.out.print("Please enter the denominator for the fraction portion of the stock: ");
			stockDenominator = sc.nextInt();
			
			//calvulations for the investment amount and number of stocks bought
			investmentAmount = netIncome * INVESTMENTPERCENT;
			//finding the cost of one stock in decimal format
			//explicit casting on stockNumerator from int to double to perform real division
			decimalStockValue = (double) stockNumerator / stockDenominator + stockWhole;
			//explicit casting from double to int
			//truncating decimals gives the correct whole number of stocks
			numStocks = (int)(investmentAmount / decimalStockValue);
			actualAmountInvested = numStocks * decimalStockValue;
			leftoverInvestment = investmentAmount - actualAmountInvested;
			
			//outputs the total amount available for investment, number of stocks bought
			//as well as actual amount invested and leftover amount
			System.out.println("\nThe amount that can be invested in stocks is $" + investmentAmount);
			System.out.println("The number of shares that $" + investmentAmount + " can buy is " + numStocks);
			System.out.print("$" + actualAmountInvested + " is the actual amount invested, leaving $");
			System.out.println(leftoverInvestment + " left over");
			
			//part 4 : EXPENSES - ELECTRICITY BILL
						
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("\n4. EXPENSES - ELECTRICITY BILL");
			
			//gathers number of units and number of months where the discount is applicable
			System.out.print("\nEnter the number of units of electricity used this year: ");
			unitNum = sc.nextDouble();
			System.out.print("Enter the number of months the 10% discount is applied to: ");
			discountMonths = sc.nextInt();
			
			//Finds the cost for the months where the discount applies
			totalWDiscount = (UNITCOST * unitNum * discountMonths / MONTHS) * (1 - ENERGYDISCOUNT + UTILITYTAX);
			//discountMonths explicitly cast from int to double to perform real division
			//there is a flaw with calculating the total with rebate
			//if the discount applies for all 12 months, there should be no rebate
			//however, the program will subtract the rebate regardless.
			totalWRebate = (UNITCOST * unitNum * (1 - ( (double) discountMonths / MONTHS))- 50) * (1 + UTILITYTAX) ;
			totalEnergy = totalWDiscount + totalWRebate;
			
			//outputs the total cost for energy
			System.out.println("\nThe total cost of energy for the year is $" + totalEnergy);
			
			 
			//part 5 : EXPENSES - PHONE BILL
						
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("\n5. EXPENSES - PHONE BILL");
			
			//gathers input for phone bill calculations
			System.out.print("\nPlease enter the number of minutes used over the year: ");
			totalMinutes = sc.nextDouble();
			System.out.print("Please enter the number of minutes in one block of time: ");
			minutesBlock = sc.nextDouble();
			System.out.print("Please enter the amount charged for a block of time in dollars: ");
			costBlock = sc.nextDouble();
			
			//finds the total cost of the phone bill
			//explicit casting done on totalMinutes / minutesBlock
			//because you are only charged for that block when it is completely used up
			totalPhone = (int)(totalMinutes / minutesBlock) * costBlock;
			
			System.out.println("\nThe total cost of the phone bill this year is $" + totalPhone);
			
			//part 6 : EXPENSES - GAS
			
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("\n6. EXPENSES - GAS");
			
			//gathering car make, as well as distance, fuel efficiency and gas price
			System.out.print("\nPlease enter the brand of car you own: ");
			brand = sc.nextLine();
			System.out.print("Please enter the type of car you own: ");
			type = sc.nextLine();
			
			System.out.print("\nPlease enter the distance the car has travelled in km: ");
			distance = sc.nextDouble();
			System.out.print("Please enter the fuel efficiency of the car in km/L: ");
			fuelEfficiency = sc.nextDouble();
			System.out.print("Please enter the average gas price of the year in $/L: ");
			averageGasPrice = sc.nextDouble();
			
			//calculation to find the cost of total gas
			//dividing averageGasPrice by fuelEfficiency gives you $/Km
			//multiplying that by distance gives you total cost
			totalGas = distance * averageGasPrice / fuelEfficiency;
			
			System.out.println("\nThe total cost of gasoline for the year is $" + totalGas);
		
			//part 7 : EXPENSES - MORTGAGE
			
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("\n7. EXPENSES - MORTGAGE");
			
			//gathers cost of 1 payment from the user
			System.out.print("\nEnter the amount of money one bi-weekly mortgage payment is: ");
			mortgageBWAmount = sc.nextDouble();
			
			//because mortgage is payed biweekly, total amount is amount per payment * 26
			mortgageTotal = MORTGAGEPAYNUM * mortgageBWAmount;
			
			System.out.println("\nThe total cost of the mortgage this year is $" + mortgageTotal);
			
			//part 8. EXPENSES - OTHER EXPENSES
			
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();
			sc.nextLine();
			
			System.out.println("\n8.EXPENSES - OTHER EXPENSES");
			
			//calculations to find seperate amounts of other expenses
			expensesWO_Other = totalPhone + totalEnergy + mortgageTotal + totalGas;
			otherTotal = netIncome - (actualAmountInvested + expensesWO_Other);
			
			amountGroceries = GROCERIESPERCENT * otherTotal;
			amountEntertainment = ENTERTAINMENTPERCENT * otherTotal;
			amountSavings = SAVINGPERCENT * otherTotal;
			
			System.out.println("\nThe amount spent on groceries this year was $" + amountGroceries);
			System.out.println("The amount spent on entertainment this year was $" + amountEntertainment);
			System.out.println("The amount put into savings this year was $" + amountSavings);
			
			//part 9. SUMMARY
			
			System.out.println("\nPress enter when you are ready to continue");
			sc.nextLine();

			System.out.println("\n9. SUMMARY");
			
			//final summary output
			System.out.println("\nTotal household gross income: $" + totalIncome);
			System.out.println("Total tax paid: $" + totalTax);
			System.out.println("Total Expenses: $" + (expensesWO_Other + otherTotal - amountSavings));
			System.out.println("Total reserve: $" + (actualAmountInvested + amountSavings));
		}
	}