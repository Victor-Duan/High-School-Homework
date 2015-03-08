public class CrazySquares {
	
	public static void main(String[] args) {
		System.out.println(square(7));
	}
	
	public static int square(int num){
		if (num == 1) {
			return 1;
		}
		else {
			return (square(num - 1) + 2 * num - 1);
		}
	}
}