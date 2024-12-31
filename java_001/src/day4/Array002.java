package day4;

import java.util.Arrays;

public class Array002 {

	public static void main(String[] args) {
		
		int[] arr = new int [5]; // {0,0,0,0,0}
		
			for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			}
			System.out.println(Arrays.toString(arr));
		
	}

}
