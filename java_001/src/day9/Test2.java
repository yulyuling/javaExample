package day9;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
	
		
		//1. 배열에서 가장 작은 값을 찾아서 리턴해주는 메소드
		//2. 배열에서 가장 큰 값과 작은 값의 위치를 바꿔주는 메소드
		
		int arr[] = {1,3,5,4,2};
		
		
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = 0;
			for( int j=j+1; j<i; j++){
				if(arr[j+1] < minIndex) {
					minIndex = j;
				}
				arr[j] = arr[j+1];
				arr[j+1] = minIndex;
				minIndex = arr[j];
				
			}System.out.println(Arrays.toString(arr));
		}
		
	}

}
