package day2;

import java.util.Scanner;

public class If_002 {

	public static void main(String[] args) {
		
		// 스캐너로 값을 입력받아서
		// 입력 받은 숫자가 홀수인지 짝수인지 판별
		// 홀수면 "홀수 입니다."
		// 짝수면 "짝수 입니다."
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");

		int num = scan.nextInt();
		
		if(num % 2 == 0) { // num % 2 == 0, 참인지 거짓인지 확인해야함.
			//그래서 (==) 사용해야함
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
		
		
	}

}
