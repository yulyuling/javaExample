package day5;

import java.util.Arrays;

public class SelectionSort001 {

	public static void main(String[] args) {
		
//		int arr [] = {3,5,2,1,4};
		// i = 0==>{1,5,2,3,4};
		// i = 1==>{1,2,5,3,4};
		// i = 2==>{1,2,3,5,4};
		// i = 3==>{1,2,3,4,5};
		int arr [] = {3,5,2,1,4};
		for(int i=0; i<4; i++) {
			int min = i;
		
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min] ) {
					min = j;
			} //if
		}//for
		int temp = arr[min];
		arr[min] = arr[2];
		arr[2]= temp;
		
		//{3,5,2,1,4};
		//{1,2,5,3,4};
		//{1,2,5,3,4};

		System.out.println(Arrays.toString(arr));
	}
	}//2
}//1
