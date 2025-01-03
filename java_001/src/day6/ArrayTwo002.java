package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwo002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{ 스캔으로 받아서 입력하기
		//{10,20}
		//{30,40}
		//{5,3}
		//{9,100}
		//}
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int [2][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(i+" , "+j+"번째의 값 : ");
			
				arr[i][j] = scan.nextInt();
		}

	}
			for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
	}
	}
	}
