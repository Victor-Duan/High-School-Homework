public class NTriangle {
	public static void main(String[] args) {
		System.out.println(printTriangle(5));
	}
	
	public static String printTriangle(int num) {
		
		if (num > 0) {
			return (printTriangle(num - 1) + printRow(num));
		}
		else {
			return "";
		}

	}
	
	public static String printRow(int num) {
		String row = "";
		for (int i = 0; i < num; i++) {
			row += "*";
		}
		return row + "\n";
	}
}