/*
 File Name: Condo.java
 Name: Victor Duan
 Class: ICS4U1
 Date: November 10, 2013
 Description: 
*/

public class Insertion1 {
	public static void main(String[] args) {
		
		int[] num = {6,2,8,3,1,7,4};
		int temp1;
		int temp2;
		int currentIndex;
		
		for (int i = 1; i < num.length; i++) {
			temp1 = i;
			currentIndex = i-1;
			while (currentIndex >= 0) {
				if (num[temp1] < num[currentIndex]) {
					temp2 = num[temp1];
					num[temp1] = num[currentIndex];
					num[currentIndex] = temp2;
					temp1--;
				}
				currentIndex--;
			}
			for (int j = 0; j < num.length; j++) {
				System.out.println(num[j]);
			}
			System.out.println();
		}
	}
}