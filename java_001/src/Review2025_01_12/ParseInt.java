package Review2025_01_12;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String binaryStr = "1101"; //2진수
		int number = Integer.parseInt(binaryStr, 2); //2진수로 변환
		System.out.println("변환된 숫자: " + number); //13출력
		
		
		//입력값을 변환하기 전에 정규식으로 검증
		
		System.out.print("숫자를 입력해주세요: ");
		String input = scan.next();
		
		if(input.matches("\\d+")) {//숫자만 포함된 문자열인지 확인
			int number2 = Integer.parseInt(input);
			System.out.println("변환된 숫자: " + number2);
		} else {
			System.out.println("숫자가 아닌 값이 입력되었습니다.");
		}

	}

}
