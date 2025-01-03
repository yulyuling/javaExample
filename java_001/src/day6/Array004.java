package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[2][4];
		//{
		//{10,20}
		//{30,40}
		//{5,3}
		//{9,100}
		//}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(i+" , "+j+"번째의 값 : ");
				
				arr[i][j] = scan.nextInt();
				
			
//			System.out.println(arr[2][1]);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
