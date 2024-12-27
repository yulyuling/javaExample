package day2;

import java.util.Scanner;

public class If_004_1 {

	public static void main(String[] args) {
		// 스캐너로 나이를 입력받아서
		// 입력받은 숫자가 20미만이면 "성인이 아닙니다."
		// 20~29 => "20대 입니다."
		// 30~39 => "30대 입니다."
		// 40~49 => "40대 입니다."
		// 50이상 => "50세 이상입니다."
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int age = scan.nextInt();
		
		if(age < 20)
			System.out.println("성인이 아닙니다.");
		else if(age < 30)
			System.out.println("20대 입니다.");
		else if(age < 40)
			System.out.println("30대 입니다.");
		else if(age < 50)
			System.out.println("40대 입니다.");
		else
			System.out.println("50대 입니다.");
	}

}
