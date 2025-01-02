package day5SelfReview001;

import java.util.Arrays;

public class BubbleSort003 {

	public static void main(String[] args) {
		
		
		int arr[] = {2,5,3,1,4};
		
		int minindex=0;
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[j+1]) {
					arr[minindex] = arr[j]; //

					arr[j]=arr[j+1];
					arr[j+1]=arr[minindex];
					arr[minindex]=arr[j];
					
				}//if
				
			}//for
		}//for
		System.out.println(Arrays.toString(arr));	
		
	}

}
