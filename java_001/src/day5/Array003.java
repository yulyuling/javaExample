package day5;

import java.util.Arrays;

public class Array003 {

	public static void main(String[] args) {
		//1.2.3.4.5로 출력되게 만들어라
		//버블정렬
		int arr[] = {3, 5, 2, 4, 1};
		int box;
//		for(int i=0; i<arr.length; i++) {
			for(int i=arr.length-1; i>0; i--) { //4부터 줄여가면서 반복.늘리면 5를 초과함 ==인덱스 찾는 방법을 어디서, 어디까지 실행할지==
				//arr.length-1; 인 이유 0 1 2 3 4 라서 i=4였는데?
				//arr.length :: 전체 길이중 몇번 실행할지
				//i-- :: 어디서 어디로 이동하면서 반복할지
				for(int j=0; j<i; j++) {  //index가 0부터 시작해서 0. ==인덱스 위치 찾기==
					if(arr[j] > arr[j+1]) { //j+1이어도 4개라서 초과하지 않음. ==인덱스 위치를 어디서, 어디를 비교할지==
						box = arr[j+1]; 	// ==인덱스를 어디에 백업할지==
						arr[j+1] = arr[j];  // ==인덱스 백업한 자리에 뭘 넣을지==
						arr[j] = box; 		// ==백업한 인덱스를 어디에 넣을지==
						
					}//for2(내부)
		}//for1
		
		
			} //2
			System.out.println(Arrays.toString(arr));
	
	} //2
}//1
