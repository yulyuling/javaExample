package day5Review001;

import java.util.Arrays;

public class MaxAndMin002 {

	public static void main(String[] args) {

				//큰 값을 찾아라
				//작은 값과 바꿔라
						//{5,2,6,3,1}
		int arr[] = {5,2,1,3,6};
		
		for(int i=0; i<arr.length-1; i++) {
		int minIndex = i;

		for(int j=i+1; j<arr.length; j++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = arr[i];
			}
		
		}
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
				
				
			}//if
				 
		System.out.println(Arrays.toString(arr));
		
	}//2

}
