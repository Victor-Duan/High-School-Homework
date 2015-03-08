public class Prime {
	public static void main(String[] args) {
		System.out.println(prime(9));
	}
	
	public static boolean prime (int num) {
		return prime (num, num - 1);
	}
	
	public static boolean prime (int num, int num2) {
		boolean next;
		
		if (num2 == 1) {
			return true;
		} 
		else if (num % num2 != 0) {
			next = prime(num, num2 - 1);
		}
		else {
			return false;
		}
		
		return next;
// 		if (num2 == 1) {
// 			return true;
// 		}
// 		else if (num % num2 != 0) {
// 			prime(num, num2 - 1);
// 		}
	}
}