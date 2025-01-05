package day5Review001;

import java.util.Arrays;

public class BubbleSort001 {

	public static void main(String[] args) {
		//[3, 5, 2, 4, 1] 
		//[3, 2, 4, 1, 5] // 가장 큰 값 5가 마지막으로 이동  첫 번째 반복 후 (i = 4):
		//[2, 3, 1, 4, 5] // 두 번째로 큰 값 4가 정렬  두 번째 반복 후 (i = 3):
		//[2, 1, 3, 4, 5] 세 번째 반복 후 (i = 2):
		//[1, 2, 3, 4, 5] 네 번째 반복 후 (i = 1):
		//버블정렬
				   //0 1 2 3 4
		int arr[] = {3,5,2,4,1};
		int temp = 0;
		
		for(int i=arr.length-1; i>0; i--) { //i--를 시키는 이유? 마지막으로 보내기 때문에, 다시 비교할 필요가 없어서 마지막 갯수를 줄인다. [루프 반복 제어]
			//i는 배열의 끝에서부터 줄여나감.//i는 마지막으로 비교할 인덱스//외부루프에서 실행될 최대 인덱스 제한
			for(int j=0; j<i; j++ ) { //  [j는 하나씩 증가하며 인접한 인덱스와 비교]//현재 인덱스 //내부 루프 비교담당
				if(arr[j] < arr[j+1]) {
					temp = arr[j]; //템프에 넣어서 작은 값을 뒤로 보낼거야
					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					temp=arr[j];
					
				}//if
				
			}//for내부
		}//for외부
		System.out.println(Arrays.toString(arr));
		
		
		
	}//1
}//2