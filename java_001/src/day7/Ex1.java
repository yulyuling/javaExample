package day7;

public class Ex1 {
	
	int num1 = 10; // num1은 객체를 만들었을때만 접근 가능하다.
	static int num2 = 20; 
	static void printNum() {
		System.out.println(num1); //근데 여기서 접근해버리면 객체를 만들지 않은 num1에 접근을 시도하게 된다.
		//non-static은 해당 클래스를 가지고 객체를 만들엇을때만 메모리가 생긴다.
		//ex1main에서 num1을 안 만들었는데 접근하려고 하니깐 문제가 생긴다.
		

	}
			
}
