package day6;

import java.util.Arrays;

public class Array00301 {

	public static void main(String[] args) {
		
//		int arr[] = {3,5,-4,-10,8,-15,6,2};
//		for(int i=0; i<arr.length-1; i++) {
//			int index = i;
//			for(int j=i+1; j<arr.length; j++) {
//				int orgNum = 0;
//				int argNum = arr[j] > 0 ? arr[j] : -arr[j];
//				int indexNum = arr[index] > 0 ? arr[index] : -arr[index];
//				if(argNum < indexNum) {
//					index = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
		
		
//		int arr[] = {3,5,-4,-10,8,-15,6,2};
//		for(int i=0; i<arr.length-1; i++) {
//			int index = i;
//			for(int j=i+1; j<arr.length; j++) {
//				int orgNum = 0;
//				if(arr[j]*arr[j] < arr[index]*arr[index] ) {
//					index = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
		
		
		int arr[] = {3,5,-4,-10,8,-15,6,2};
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(Math.abs(arr[j]) < Math.abs(arr[index])) {
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
