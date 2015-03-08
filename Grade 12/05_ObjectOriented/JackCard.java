public class JackCard {

 private static final double DISCOUNT1 = 0.02;
 private static final int DISCOUNT1AMOUNT = 100;
 
 private static final double DISCOUNT2 = 0.03;
  private static final double DISCOUNT2AMOUNT = 200;
 
 private static final double DISCOUNT3 = 0.05;
 private static final double DISCOUNT3AMOUNT = 500;
 
 private static final int POINTSVALUE1DOLLAR = 20;
 private static final double ONEPOINTPERXDOLLAR = 2;
 
 private static double balanceMax;
 
 private String name;
 private double balance;
 private int points;
 private int pinNum;
 private double discount;
 
 public JackCard() {
   name = "default";
   balance = 0;
   points = 0;
   pinNum = 1234;
   discount = 0;
 }
 
 public JackCard (String name,double balance, int pinNum) {
   this.name = name;
   this.balance = balance;
   this.pinNum = pinNum;
   giveDiscount();
 }
 
 //helper method that calculates which discount the user is applicable for
 private void giveDiscount() {
   if (balance >= DISCOUNT1AMOUNT && balance < DISCOUNT2AMOUNT) {
     discount = DISCOUNT1;
   }
   else if (balance >= DISCOUNT2AMOUNT && balance < DISCOUNT3AMOUNT) {
     discount = DISCOUNT2;
   }
   else if (balance >= DISCOUNT3) {
     discount = DISCOUNT3;
   }
   else {
     discount = 0;
   }
 }
 
 //accessor methods
 public static double getBalanceMax() {
  return balanceMax;
 }
 
 public String getName() {
  return name;
 }
 
 public double getBalance() {
   return balance;
 }
 
 public int getPoints() {
   return points;
 }
 
 public int getPinNum() {
   return pinNum;
 }
 
 public double getDiscount() {
   return discount;
 }
 
 //mutator methods
 public static void setbalanceMax(double maxBal) {
  balanceMax = maxBal;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 public void setBalance(double balance) {
   this.balance = balance;
 }
 
 public void setPoints(int points) {
   this.points = points;
 }
 
 public void setPinNum(int pinNum) {
   this.pinNum = pinNum;
 }
 
 public void setDiscount(double discount) {
   this.discount = discount;
 }
 
 //instance method that refills the balance on the card
 
 public boolean refill(double amountAdded) {
   
   boolean success  = false;
   if (balance + amountAdded <= balanceMax) {
     balance += amountAdded;
     success = true;
   }
   else {
     balance = balanceMax;
   }
   
   giveDiscount();
   return success;
 }
 
 public boolean pay (double amount, int pinNum, boolean usePoint) {
   boolean success = false;
   
   if (this.pinNum == pinNum) {
     if (usePoint) {
       if ((points/POINTSVALUE1DOLLAR) >= Math.ceil(amount)) {
         points -= (int) Math.ceil(amount*POINTSVALUE1DOLLAR);
         success = true;
       }
     }
     else {
       if (balance >= amount) {
         points += (int)balance / ONEPOINTPERXDOLLAR;
			balance -= amount * (1 + discount);
			giveDiscount();
			success = true;
       }
     }
   }
   return success;
 }
 
 public JackCard higherBalance(JackCard other) {
 	if (balance >= other.balance) {
		return this;
	}
	else {
		return other;
	}
 }
 
 public JackCard morePoints(JackCard other) {
 	if (points >= other.points) {
		return this;
	}
	else {
		return other;
	}
 }
 
 public void combinePoints(JackCard other) {
 	points += other.points;
 }
 
 public boolean changePIN(String enteredName, int pinNumber){
 
 	boolean success = enteredName.equals(name);
	if (success) {
		pinNum = pinNumber;
	}
	return success;
 }
 
 public String toString() {
 	String cardHolder = "Card Holder: " + name + "\n";
	String userBalance = "Balance: $" + balance + "\n";
	String userDiscount = "Discount rate: " + (discount * 100) + "%\n";
	String userPoints = "Points: " + points + "\n";
	String userPinNumber = "PIN: " + pinNum + "\n";
	return cardHolder + userBalance + userDiscount + userPoints + userPinNumber;
 }
}