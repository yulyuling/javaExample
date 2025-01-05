package day6Review001;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		//BubbleSort
		int arr[] = {3,5,2,1,4};
		int temp = 0;
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[j+1]) {

					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}//i
			}//f
				
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
