package day5Review001;

import java.util.Arrays;

public class SelectionSort001 {

	public static void main(String[] args) {
		//내림차순
		
		//얘는 버블이랑 반대임
		//앞에서부터 정렬
		//{1,2,3,4,5}
		
		int arr[] = {3,5,2,4,1};
		
		
		for(int i=0; i<arr.length-1; i++) { //외부루프=최소값 찾기 //정렬끝부분	
			int minIndex = 1;
			
			for(int j=i+1; j<arr.length; j++) { //내부루프=최소값 찾기 // i+1부터 배열 끝까지 0은i,1은j
			if(arr[j] < arr[minIndex]) {
				minIndex = arr[j]; //index 작은 수
				
			}//if		
			}//for2
				

				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
				
				
	}//for1 전체
		System.out.println(Arrays.toString(arr));
	}

}
