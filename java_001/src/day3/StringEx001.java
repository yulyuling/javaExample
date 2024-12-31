package day3;

import java.util.Scanner;

public class StringEx001 {

	public static void main(String[] args) {

		/*
		 * String = 클래스임. 근데 일반 변수처럼 쓰긴 함.
		 * 일반 변수가 아님. 객체임
		 * 객체 특징:
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if(input.equals("종료")) { // false가 된다.
				//==대신 equals()라는 메소드를 써야함. "종료".equals 도 있음
				//숫자는 ==쓰면 됨
			
			System.out.println("종료되었습니다.");
		}else {
		System.out.println("실행 중입니다.");
	}

	}
}
