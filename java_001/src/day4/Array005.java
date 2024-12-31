package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array005 {

	public static void main(String[] args) {
		
		// 값을 5개 받아서 배열에 넣을 것이다.
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
//		int num = 0;
		for(int i=0; i<arr.length; i++) {
//			num = scan.nextInt();
			System.out.print((i+1) + "번째 값 입력 : ");
			arr[i] = scan.nextInt();
//			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}
}

