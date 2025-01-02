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
			
			
		}
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