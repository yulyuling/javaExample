package day2;

import java.util.Scanner;

public class Loop006 {

	public static void main(String[] args) {
		
		// 사용자가 스캐너로 입력 받은 값의 숫자의 합 구하기
		// 홀수들의 합, 짝수들의 합 구하기
		// 홀수의 합은 : 000. 짝수의 합은 : 000
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		
		int num = scan.nextInt();
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1; i<=num; i++) {
			if(i % 2 == 1);{
			sum += i;
		} else {
			sum2 += i;
		}
			for(int j=1; j<=num; j++) {
				if(j % 2 == 0);
				sum2 += j;
		}
		System.out.println("홀수들의 합 : "+ sum);	
		System.out.println("짝수들의 합 : "+ sum2);
		
		}
	}
	}

