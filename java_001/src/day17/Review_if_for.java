package day17;

import java.util.Arrays;

import PackA.ClassA;

public class Review_if_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				int gugudan = i * j;
//				System.out.println(i + "x" + j + "=" + gugudan);
//			}
//		}
//		String arr[] = {"햄버거", "김치찌개", "피자"};
//		
//		ClassA arr2[] = new ClassA[3];
		
		int arr [] = {1, 5, 4, 2, 6, 3};
		
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
