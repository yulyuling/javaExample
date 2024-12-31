package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array009 {

	public static void main(String[] args) {
		// 1. 양수만 들어갔음 좋겠땅
		// 2. 숫자를 몇개 저장하시겠습니까?

		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 숫자 저장? ");
		
		
			
		int size;
			while(true){
				size = scan.nextInt();
				if(size < 1) {
					System.out.println("다시 입력하세요");
		} else {
			break;
		}		
			}			
			int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			if (input > 0) {
				arr[i] = input;

			} else {
				System.out.println("1이상의 양수를 입력해주세요.");
				i--;
			}
		} // for

		System.out.println(Arrays.toString(arr));

		
		


	} // end

}// end2

}