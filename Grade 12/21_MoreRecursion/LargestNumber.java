public class LargestNumber {
	public static void main(String[] args) {
		int[] list = {1,5,2,7,3,9,3,37,16,99,17,4};
		System.out.println(LargestNum(list, 0, list.length - 1));
	}
	
	public static int LargestNum(int list[], int start, int finish) {
		
		int previousLargest;
		
		if (start == finish) {
			return list[start];
		}
		else if (list[start] > (previousLargest = LargestNum(list, start + 1, finish))) {
			return list[start];
		}
		else {
			return previousLargest;
		}

// 		if (start == finish) {
// 			return list[start];
// 		}
// 		else if list[start{
// 			return LargestNum(list, start + 1, finish);
// 		}	
	}
}
