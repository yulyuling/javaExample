package day11Review002;

import java.util.Arrays;

public class SelectionSort001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {3,2,1,4,5};
		
		for(int i=0; i<arr.length-1; i++) { //0부터 끝까지 돌리면서 찾는다.
			int minIndex = i;				//작은 값(i)을 찾아서 min에 넣는다.
			for(int j=i+1; j<arr.length; j++) { //j로 i의 다음 배열부터 끝까지 돌면서 작은값찾아
				if(arr[j] < arr[minIndex]) {//찾은 값은 i랑 비교해서 j에 넣어.
					minIndex = j;	//j를 작은 값으로 계속 갱신. 갱신값은 min에 넣어
				}
			}
				int temp = arr[minIndex]; //min에 넣은 제일 작은 값을 새 상자에 담아.
				arr[minIndex] = arr[i]; //그리고 i(다음 작은 값)을 min에 넣어
				arr[i] = temp; //temp에 있는 가장 작은값을 i에 넣어.
						
		}	
		System.out.println(Arrays.toString(arr));
		
	}

}
