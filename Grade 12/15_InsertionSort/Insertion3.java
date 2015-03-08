public class Insertion3 {
	public static void main(String[] args) {
		
		int[] list = {1,4,2,6,8,3,7,5};
		int tempIndex;
		int temp2;
		int currentIndex;
		
		for (int i = 1; i < list.length; i++) {
			tempIndex = i;
			currentIndex = i-1;
			while (currentIndex >= 0) {
				if (list[tempIndex] < list[currentIndex]) {
					temp2 = list[tempIndex];
					list[tempIndex] = list[currentIndex];
					list[currentIndex] = temp2;
					tempIndex--;
				}
				currentIndex--;
			}
		}
		
		for (int j = 0; j < list.length; j++) {
			System.out.println(list[j]);
		}
	}
}