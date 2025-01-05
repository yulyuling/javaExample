package day5Review001;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort004 {

	public static void main(String[] args) {

		
		int arr[] = {3,5,2,1,4};
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {//i+1 0부터 할 필요가 없어서
				if(arr[j] < arr[minIndex]) {
					minIndex = j; //min 위치임, 값x
					
				}//if
					
			}//for2
			
				int temp = arr[minIndex];
				arr[minIndex] = arr[i]; // i는 가장 첫번째 값
				arr[i] = temp;
		} //for
		System.out.println(Arrays.toString(arr));
	} //2

}
