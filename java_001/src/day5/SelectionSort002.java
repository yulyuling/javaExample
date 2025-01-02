package day5;

public class SelectionSort002 {

	public static void main(String[] args) {
		
		int arr [] = {3,5,2,1,4};
		/*
		 * int minIndex = 0; for(int i=1; i<arr.length; i++) { if(arr[i] < arr[minIndex]
		 * ) { minIndex = 1; } } int temp = arr[minIndex]; arr[minIndex] =arr[0]; arr[0]
		 * = temp;
		 */
		//{1,5,2,3,4};
		// 2번째부터 비교
		int minIndex = 2; //index 위치 *0 1 2 3 4 
						  // for 위치 0 *1 2 3 4   0과 1을 비교
		for(int i=3; i<arr.length; i++) {
				if(arr[i] < arr[minIndex] ) {
					minIndex = 1;
				}
			}
		int temp = arr[minIndex];
		arr[minIndex] =arr[2];
		arr[2] = temp;
		
		//{1,2,5,3,4};
		
		
		int minIndex = 2; //index 위치 0 1 2 3 4 중 2
		for(int i=3; i<arr.length; i++) {
				if(arr[i] < arr[minIndex] ) {
					minIndex = 1;
				}
			}
		int temp = arr[minIndex];
		arr[minIndex] =arr[2];
		arr[2] = temp;
	}
}
