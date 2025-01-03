package day6;

import java.util.Arrays;

public class Array003 {

	public static void main(String[] args) {
		
			//
		
			int arr[] = {3, 5, -4, -10, -15, 6, 2};
			int min = 0;
			
			for(int i=arr.length-1; i>0; i--) {
				for(int j=0; j<i; j++) {
					if (arr[j] < arr[j+1]) {
						min = arr[j];
					}else {
						 
								
//					} else if(arr[j] > arr[j+1]) {
						
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						
					}//i
					}
				
			}System.out.println(Arrays.toString(arr));
			
		
		
	}

}
