package day6;

import java.util.Arrays;

public class Array002 {

	public static void main(String[] args) {
		
		// 음수는 다 버리고 정렬
		// {3,5,6,2}
		int arr[] = {3, 5, -4, -10, -5, 6, 2};
		int arr2[];
		int count = 0; //배열의 크기 찾기
		
		for(int num : arr) {
					if( num > 0) {
							count++;		
				}//if
	}
		arr2 = new int[count];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				arr2[index++] = arr[i];
				
			}
		}
		System.out.println(Arrays.toString(arr2));
		
/*			
		for(int num : arr) {
			if(num > 0) {
				new arr[index++] = num;
				}
*/
		}	
		
}