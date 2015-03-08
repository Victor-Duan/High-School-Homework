public class StarRow {
	public static void main(String[] args) {
		System.out.println(printRow(-1));
	}
	
	public static String printRow(int num) {
		if (num == 1) {
			return "*";
		}
		else if (num > 1) {
			return printRow(num - 1) + "*";
		}
		else {
			return "";
		}
	}
}