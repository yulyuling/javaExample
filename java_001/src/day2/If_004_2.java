package day2;

import java.util.Scanner;

public class If_004_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 :");

		int age = scan.nextInt();
		
		
		if(age < 20)
			System.out.println("미성년자 입니다.");
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
