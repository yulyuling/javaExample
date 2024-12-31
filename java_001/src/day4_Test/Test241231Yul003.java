package day4_Test;

import java.util.Scanner;

public class Test241231Yul003 {

	public static void main(String[] args) {
		/*
		 * 3. 스캐너를 통해 숫자를 입력받은 후 홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오. 단, 0이하의 숫자나 11이상의 숫자일
		 * 경우 "계산할 수 없습니다." 를 출력하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요: ");
		
		int num = scan.nextInt();
		if(num % 2 == 0 ) {
			System.out.println("짝수");
	} else {
		System.out.println ("홀수");
	}
	}
			
		}
	

