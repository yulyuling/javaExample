package day5SelfReview001;

import java.util.Arrays;

public class SelectionBlind004 {

	public static void main(String[] args) {

		/*
		 * int arr[] = {3,5,1,2,4};
		 * 
		 * for(int i=0; i<arr.length-1; i++) { int temp = i; for(int j=i+1;
		 * j<arr.length; j++ ) { if( arr[j] < arr[temp]) { temp = arr[j];
		 * 
		 * }//if }//for
		 * 
		 * int min = arr[i]; arr[i] = arr[temp]; arr[temp] = min;
		 * 
		 * }//for System.out.println(Arrays.toString(arr));
		 * 
		 */
		
		
		int arr[] = { 3, 5, 1, 2, 4 };
		
		
		for(int i=0; i<arr.length-1; i++){
			int temp = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[temp]) {
					temp = j;
					
				}//if
				
			}//for2
			int max = arr[temp];
			arr[temp] = arr[i];
			arr[i] = max;
		}
		System.out.println(Arrays.toString(arr));
		
	}// 1
}// 2