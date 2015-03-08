public class Palindromes {
	
	public static void main(String[] args) {
		System.out.println(palindrome("racecar"));
	}
	
	public static boolean palindrome(String s) {
		if (s.length() == 1 || s.length() == 0) {
			return true;
		}
		else if ((s.charAt(0) == s.charAt(s.length() - 1)) && palindrome(s.substring(1,s.length()-1))) {
			return true;
		}
		else {
			return false;
		}
	}
}