package day5Review001;

import java.util.Arrays;

public class SelectionSort003 {

	public static void main(String[] args) {
		
		
		int arr[] = {3,5,2,4,1};
		
		for(int i=0; i<arr.length-1; i++) { //i가 0일때, 4보다 작으면 증감.
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) { //j가 i보다 하나 클때, j는 길이만큼 증감
				
				if(arr[j] < arr[minIndex]) { // j가  min보다 작을때 min에 대입함.
					minIndex = arr[j];
					
				}//if
			}//for2
			//arr[i] 는 배열의 특정위치(인덱스)를 가르킴.  temp는 임시 변수, 독립적으로 쓸 수 있는 상자.
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
	
			
		}//for1
			System.out.println(Arrays.toString(arr));
	}//22

}//11
