package day1;

public class Calculator {

	public static void main(String[] args) {

		int x = 10;
		int y = 3;
		int z = x/y; // int z = 10/3;
		// 정수(int)간의 나눗셈은 결과가 정수로 나온다.
		// 둘 중 하나라도 double로 바꾸면 실수로 나온다.
		
		
		System.out.println(x + 10);
		System.out.println(y * 20);
		System.out.println(z);
		System.out.println(x + y);
		
		System.out.println("x + y =" + (x + y));
		//문자열의 더하기는 문자열이 됨(이어붙이기)
		
		int num1 = 10;
		num1 = (int) 12.5;
		// 실수형 타입의 숫자를 강제로 int형으로 바꿈
		// (소수점을 날려버림=형변환) int=>double로 가는 건 상관없음.
		int num2 = 3;
		double num3 = 3.5;
		num3 = 10;
		System.out.println(num1 + num3);
				
		
	}

}
