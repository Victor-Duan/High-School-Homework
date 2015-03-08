import java.util.*;

public class TestJackCard {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int maxBal;
		
		JackCard c1 = new JackCard();
		JackCard c2 = new JackCard("Bobby", 100, 3443);
		
		System.out.println("Enter max card balance: ");
		JackCard.setbalanceMax(sc.nextInt());
		
		c1.refill(50);
		
		c2.pay(60,3443,false);
		
		JackCard c3 = c1.higherBalance(c2);
		c3.pay(10,c3.getPinNum(), false);
		
		c3 = c1.morePoints(c2);
		c3.pay(5, c3.getPinNum(), true);
		
		c1.combinePoints(c2);
		
		c1.pay(5, c1.getPinNum(), true);
		
		sc.nextLine();
		
		System.out.println("Enter name");
		String userName = sc.nextLine();
		System.out.println("Enter PIN");
		int userPin = sc.nextInt();
		c1.changePIN(userName, userPin);
	}
}