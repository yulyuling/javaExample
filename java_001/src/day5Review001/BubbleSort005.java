package day5Review001;

import java.util.Arrays;

public class BubbleSort005 {

	public static void main(String[] args) {
		
		
		int arr[] = {3,5,2,1,4};
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}//if
				
			}//for2
			
		}//for
		System.out.println(Arrays.toString(arr));
	}//2

}
