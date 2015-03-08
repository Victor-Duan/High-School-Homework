public class PatternGenerator {
	public static void main(String[] args) {
		generate(4,2,"");
	}
	
	public static void generate(int n, int k, String pattern) {
		if (n == 0) {
			System.out.println(pattern);
		}
		else {
					if (k > 0) {
				generate(n - 1, k - 1, pattern + "1");
			}
			if (n - k > 0) {
				generate(n - 1, k, pattern + "0");
			}

		}
	}
}