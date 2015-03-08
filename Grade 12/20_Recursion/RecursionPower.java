public class RecursionPower {
	public static void main(String[] args) {
		System.out.println(power(4,3));
	}
	
	public static int power(int power, int base) {
		if (power == 1) {
			return base;
		}
		else {
			return power(power - 1, base) * base;
		}
	}
	
}