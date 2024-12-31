package day4_Test;

import java.util.Scanner;

public class Test241231Yul002 {

	public static void main(String[] args) {
		/*
		 * 2. 스캐너를 통해 숫자를 입력받은 후 50이상의 숫자일 경우 "50 이상 입니다." 아닐 경우 "50 미만 입니다." 출력하시오
		 */	 

		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("숫자를 입력하세요 : ");
		
		
		int num = scan.nextInt();
		
		if(num >= 50) {
			System.out.println("50 이상 입니다.");
		}  else if (num <=50) {			
			System.out.println("50 미만 입니다.");
		}
	}
				
}
	


