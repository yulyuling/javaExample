package day15Review;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,4,2,1};

		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i; //i라는 기준 위치를 넣어.
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) { //j랑 비교를해서 작은걸 찾고
					minIndex = j; //여기에 작은걸 넣어
					
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i]; //그리고 기준 위치랑 작은걸 바꿔야 다음 애랑 비교할 수 있겠지? 그래서 i랑 비교함.
			arr[i] = temp;
		}System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}