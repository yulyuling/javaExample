package day1;

public class Variable001 {

	public static void main(String[] args) {
		// Ctrl + Shift + F = 자동들여쓰기

		String name = "홍길동";
		int stuNum = 20241226;
		int age = 30; // integer (정수)
//		age = 30;
		double height = 170.5;
		boolean isSingle = true; // false

		System.out.println(name);
		System.out.println(age);		
		System.out.println(height);
		
		age = 31;
		System.out.println(age);
		
		final double PI = 3.141592; // final 상수 선언
		// PI = 3.14; 앞에 PI에 final_붙음. 상수라서 수정 불가능		
		
		
		// 홍길동의 나이는 31 입니다.
		
		System.out.println(name + "의 나이는 " + age + " 입니다");
		 
		
	}
	

}
