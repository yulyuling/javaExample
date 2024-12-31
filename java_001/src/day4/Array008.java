package day4;

import java.util.Arrays;

public class Array008 {

	public static void main(String[] args) {
		
/*		int arr[] = {3, 5, 2, 4, 1};
		int num = 0;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			num = i;
		if (i == 1 );
			max = num;
			if ( num < max );
			arr[i] = max;
					
			if(arr[i] == max);
			System.out.println(arr[i]);
		*/

		//가장 큰 숫자를 가진 인덱스 위치 찾기
		
		int arr[] = {3, 2, 5, 4, 1};
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) { //1부터 시작한 이유
											//maxindex=0이 1번인덱스
			//가장 큰 값의 위치
			if(arr[i] > arr[maxIndex]) {	//인덱스끼리 비교 arr[i] > arr[0]
				maxIndex = i;				//
			}
			//가장 작은 값의 위치			
			minIndex = arr[i] < arr[minIndex] ? i : minIndex;
		System.out.println(maxIndex);
		System.out.println(minIndex);
		
		} //i의 값이 더 작다면, i의 값을 minIndex값으로 변경해라
		  //{3, 2, 5, 4, 1}
		  //{3, 2, 1, 4, 5}
		
		int box = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = box;
		System.out.println(Arrays.toString(arr));
		}
			}
		


