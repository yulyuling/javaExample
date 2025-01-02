package day5SelfReview001;

import java.util.Arrays;

public class BubbleSort004 {

	public static void main(String[] args) {
		
		int arr[]= {3,2,5,1,4};
		
		int temp = 0;
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {			
				if(arr[j] < arr[j+1]) {
					temp = arr[j+1];
					
					
					arr[j+1] = arr[j];
					arr[j] = temp;
					temp = arr[j+1];
					
				}//if
			
			}//for
			
		}//for 
		System.out.println(Arrays.toString(arr));
}//2
}//1
