package day17;

public class Pig extends Animal{

	Pig(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	void sound() { //추상클래스를 상속받을때 추상메소드를 무조건 오버라이드 해야한다.
		System.out.println("꿀꿀");
	}

}
