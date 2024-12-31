package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array006 {

	public static void main(String[] args) {
		
		// 5개의 숫자를 입력받아서 배열에 저장
		// 0이나 음수가 입력되면 배열에 저장하지 않고 다시 입력받도록 수정
	
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 값 입력 : ");

			int input = scan.nextInt();
			if(input > 0) {
			arr[i] = input; //여기까지하면 -가 0이 되어버림.
			} else {
				
				System.out.println("0보다 큰 수를 입력해주세요");
			i--;
			
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}


}
