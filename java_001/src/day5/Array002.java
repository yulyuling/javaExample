package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array002 {

	public static void main(String[] args) {
		
		//이 배열의 인덱스의 숫자 만큼 *** 찍혔으면 좋겠다
/*		
		int arr[] = {3, 5, 2, 4, 1};
		int num = 0;
		String star = "*";
		for(int i = 0; i<arr.length; i++) {
			num = arr[i];
			
			System.out.println(num+"star"+"="+Arrays.toString(arr));
			/**Arrays.toString(arr) 은 배열안의 값을 String으로 변환해서 출력한다.
			/**1차원 배열이기에 1차원 배열에서만 쓸 수 있다.
			 * 다차원 배열은 Arrays.deepToString() 을 쓴다.
			 */
			 
			
		/*}
		 * //for1
		 * 
		 * for(int i = 0; i<arr.length; i++) { System.out.println(arr[i]); }
		 */// for2
/*
	for(

	int i = 0;i<3;i++)
	{
		System.out.print("*");
	}*///for3

		int arr[] = {3, 5, 2, 4, 1};
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i]; j++) {
			System.out.print("*");
		}System.out.println();
		}

	}
}