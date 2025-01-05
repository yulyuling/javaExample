package day5Review001;

import java.util.Arrays;

public class SelectionBlind002 {

	public static void main(String[] args) {
		
		
		int arr[] = {2,1,5,4,3};
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}//if
				
			}//for
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}//for
			
		System.out.println(Arrays.toString(arr));
		
	}

}
