package day2;

import java.util.Scanner;

public class Scanner001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next(); //문자열을 입력받을 수 있는 기능
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); //숫자를 입력받을 수 있는 기능
		System.out.println(name + "의 나이는 " + age + " 입니다.");
		
	
	}

}
