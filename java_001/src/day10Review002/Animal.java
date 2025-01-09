package day10Review002;

public class Animal {
	
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void info(){
	System.out.println("이름: " + name + ", 나이: " + age);
	}
	void maskSound() {
		System.out.println("동물이 소리를 냅니다.");
	}

}
