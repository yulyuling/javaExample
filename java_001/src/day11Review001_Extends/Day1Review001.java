package day11Review001_Extends;

import java.util.Scanner;

public class Day1Review001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 스캐너로 값을 입력받아서
		// 입력 받은 숫자가 홀수인지 짝수인지 판별
		// 홀수면 "홀수 입니다."
		// 짝수면 "짝수 입니다."
		
//		System.out.print("숫자를 입력해 주세요: ");
//		for(;;) {
//		int i = scan.nextInt();
//			if(i % 2 == 0) {
//				System.out.println( "짝수 입니다.");
//			} else {
//				System.out.println( "홀수 입니다.");
//			}
		
		
		//스캐너로 숫자하나 입력받아서 1부터 입력받은 숫자까지의 합 구하기
		//스캐너로 입력한 숫자들을 전부 더해보기.
		//여러개의 숫자를 입력하고 싶어.
		
		System.out.print("(1)시작 (2)계산 및 종료 : ");

		int num = scan.nextInt();
		int sum = 0;
		int menu = scan.nextInt();
		
		while(true) {
			if(menu == 1) {
				for(int j=0; j<num; j++) {
					num = scan.nextInt();
					System.out.println("시작 합니다!");
				}
		} else if (menu == 2) {
				sum += j;
				System.out.println("계산 합니다!");
				
		} else {
			
			System.out.println("합계는 " + sum);
		}
			
		}//f
	}
}
		



