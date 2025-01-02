package day5;

import java.util.Arrays;

public class Review2 {

	public static void main(String[] args) {
		
		int arr[] = {3, 5, 10, 2, 4};
		int sum = 0;
		int max = arr[0]; //가장 큰 값 찾기
		int index = 0; // 가장 큰 값의 위치(i의 위치 찾기)
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
				sum = sum + arr[i]; // sum+= arr[i];
				if(arr[i] > max){ //i가 인덱스 위치를 나타냄
				
					//가장 큰 값을 찾기
				max = arr[i];
				} //if2 close
				
				//가장 큰 값의 위치를 찾기
				if (arr[i] > arr[index]) {
					index = i;
					
				}
				
		}//for close
		
		
		
	} //main close

} //class close
