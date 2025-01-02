package day5SelfReview001;

import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {

		//큰 값을 찾아라
		//1.큰 값을 찾기 위해 반복해서 0~5를 이동한다
		
		int [] arr = {3,4,2,5,1};
		int temp = 0; //상자 이름
		int max = 0; //큰 값의 이름
		for(int i=1; i<arr.length; i++ ) { //어떻게 찾을 것인가? **0~길이까지 순서대로 이동한다.
			if(arr[max] < arr[i]) {
				max = i;
				
				System.out.print(arr[max]);
			} //if
			
			
			/*이건 교환
			arr[temp] = arr[max]//찾은 값을 어디에 넣을 것인가? **temp에 max를 넣는다
			arr[max] = arr[min] //비어있는 max 자리에 뭘 넣을 것인가? **		
				
			*/
			
		}//for
		
	}//22
		
	}//11


