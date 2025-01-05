package day6Review001;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,4,1};
		
		for(int i=0; i<arr.length; i++) {
			int minIndex = i; //minIndex를 0으로 계속 되돌리기 위해서 i로 초기화한다.
			for (int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					
					minIndex = j; // j와 i 값을 비교해서, j를 i(빈상자)에 넣는다.
				
				}//f2
			}
					
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

}
