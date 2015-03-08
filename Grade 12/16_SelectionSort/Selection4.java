public class Selection4 {
	public static void main(String[] args) {
	
		int[] list = {6,1,2,7,3,12,8,4,9,11,5,10,18};
		int largestIndex;
		int currentIndex;
		int temp;
		int numOrdered = 10;
		
		for (int i = 0; i < numOrdered; i++) {
			largestIndex = list.length - 1 - i;
			currentIndex = largestIndex;
			for (int j = 0; j < currentIndex; j++) {
				if (list[largestIndex] < list[j]) {
					largestIndex = j;
				}
			}
			temp = list[currentIndex];
			list[currentIndex] = list[largestIndex];
			list[largestIndex] = temp;
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}