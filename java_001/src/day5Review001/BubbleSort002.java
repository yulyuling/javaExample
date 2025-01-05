package day5Review001;

import java.util.Arrays;

public class BubbleSort002 {

	public static void main(String[] args) {
			
		int arr[] = {3,5,2,4,1};
		
		int temp = 0;
		
			for(int i=arr.length-1; i>0; i--) {
				for(int j=0; j<i; j++) {
					if(arr[j] < arr[j+1]) {
					temp = arr[j]; //저장할거야
					
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					temp = arr[j];
					
					}//if
			}//for1
			}//for2
			System.out.println(Arrays.toString(arr));
	}//2

}//1
