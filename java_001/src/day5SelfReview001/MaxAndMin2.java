package day5SelfReview001;

import java.util.Arrays;

public class MaxAndMin2 {

	public static void main(String[] args) {

					//{3,1,2,5,4}
		
		int arr[] = {3,5,2,1,4};
		
		int minIndex=0; //작은 숫자 상자
		int temp=0; //빈 상자
		int maxIndex=0; // 큰 숫자 상자
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < arr[i+1]) { // i가 작은 숫자라면
				minIndex = i;

				for(int j=0; j<arr.length; j++)
					if(arr[j] > arr[j+1]) {
						maxIndex = j;
				
						temp = maxIndex; //큰 숫자
						maxIndex = minIndex;
						minIndex = temp;			
					
			}
							
			}//if
		
			
		}//for
		System.out.println(Arrays.toString(arr));

}//2
}//1
		
	
