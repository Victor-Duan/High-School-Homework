public class BadassEuclid {
	
	public static void main(String[] args) {
		System.out.println(GCF(12,2));
	}
	
	public static int GCF (int m, int n) {
		if (m == n) {
			return m;
		}
		else if (m > n) {
			return (GCF(n, m-n));
		}
		else {
			return (GCF(n, m));
		}
	}
}