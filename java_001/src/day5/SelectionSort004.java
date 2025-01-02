package day5;

import java.util.Arrays;

public class SelectionSort004 {

	public static void main(String[] args) {

		/*
		 * //두번째 자리에 두번째 작은 값을 넣어봐
		 * 
		 * int index = 1; int temp = 0; for(int i=2; i<arr.length; i++) { if( arr[i] <
		 * arr[index] ) { index = i;
		 * 
		 * index = arr[1]; arr[1] = temp; temp = index; }
		 * 
		 * 
		 * }//if System.out.println(Arrays.toString(arr)); }//for
		 */
		// 0~3까지 출력
//		for(int k=0; k<4; k++) {

		int arr[] = { 1, 5, 2, 3, 4 };

		int index = 0;
		int temp = 0;
		for (int j = 0; j < 4; j++) {
			index = j;

			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i] < arr[index]) {
					index = i;
				}
			}

			temp = arr[j];
			arr[j] = arr[index];
			arr[index] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}
}
