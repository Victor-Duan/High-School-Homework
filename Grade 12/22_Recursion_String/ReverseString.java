public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("Aabcdef"));
	}
	
	public static String reverse(String given) {
		if (given.length() == 1) {
			return given;
		}
		else if (given.length() > 1) {
			return (reverse(given.substring(1)) + given.charAt(0));
		}
		else {
			return "";
		}
	}
}