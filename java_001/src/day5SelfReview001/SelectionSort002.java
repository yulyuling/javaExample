package day5SelfReview001;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,5,2,4,1};
		
		for(int i = 0; i<arr.length-1; i++) { // 여기선 i가 현재 위치
			int minIndex = 1; // 정렬되지 않은 부분의 시작 인덱스를 최소값으로 설정
			
			for(int j=i+1; j<arr.length; j++) { //나머지 부분에서 최소값 찾기
				if(arr[j] < arr[minIndex]) {
					minIndex = j; //최소값의 인덱스 업데이트
					
				}//if
				
			}//for2
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}//for1
		
		System.out.println(Arrays.toString(arr));
		
	}

}
