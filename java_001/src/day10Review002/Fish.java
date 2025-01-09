package day10Review002;

public class Fish extends Animal {
	

	String swim;

	Fish(String name, int age){
	super(name, age);
	
	}
	
	@Override
	void maskSound() {
		System.out.println("물고기는 소리를 내지 않습니다.");
	}
	 void swim() {
		System.out.println("물고기가 헤엄칩니다.");
	}
}
