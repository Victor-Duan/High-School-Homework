public class BinarySearch {

	public static void main(String[] args) {
		int[] list = {23,27,30,34,41,49,51,55,57,60,67,72};
		System.out.println(binary(list, 0 , list.length - 1, 50));
	}
	
	public static int binary(int[] list, int startIndex, int endIndex, int searching) {
		int middleIndex = (startIndex + endIndex) / 2;
		int foundIndex;
		
		if (list[middleIndex] == searching) {
			foundIndex = middleIndex;
		}
		else if (startIndex >= endIndex) {
			foundIndex = -1;
		}
		else {
			if (list[middleIndex] < searching) {
				foundIndex = binary(list, middleIndex + 1, endIndex,  searching);
			}
			else {
				foundIndex = binary(list, startIndex, middleIndex - 1,searching); 
			}
		}
		return foundIndex;
	}
}

