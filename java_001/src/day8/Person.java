package day8;

public class Person { //입력 -- 부모클래스
	
	String name;
	private int age;
	String addr;
	
	Person(){ // 기본 생성자
		System.out.println("부모 클래스 생성자 실행!");
	}
	
	Person(String name, int age, String addr){ //생성자 이름과 동일한 메소드!!!!!!!!!!
		this.name = name;
		this.age = age;
		this.addr = addr;
		
	}
	
	
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
}
