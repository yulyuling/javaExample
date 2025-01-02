package day5;

import java.util.Arrays;

public class BubbleSort001 {

	public static void main(String[] args) {
		
		//버블 정렬 해결하기
		//내림차순으로 정렬해보자
		
		int arr[] = {3,5,2,4,1};
		int box;
		
		for(int i=arr.length-1; i>0; i--){ //index를 어디서 어디까지 검색할지
			//***다른 방법 for(int i=1; i<arr.length; i++){
			for(int j=0; j<i; j++){//index 찾기
				//***다른방법 for(int j=0; j<arr.length-i; j++) 전체 갯수에서 한개를 빼고, 다시 더함.
				//j가 0일때(인덱스 갯수가 0부터), j가 i보다 작을때(i는 인덱스의 길이), j를 하나씩 더해라
				//j=인덱스 위치 찾기
				//j<i; j가 i보다 작을때. i=3번
					if(arr[j] < arr[j+1]) {
					box = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = box;					
				}
					
				}//if
				
		}//for
		System.out.println(Arrays.toString(arr));
		
		
	}

}
