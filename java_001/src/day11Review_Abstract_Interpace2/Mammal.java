package day11Review_Abstract_Interpace2;

public class Mammal extends Animal {

	Mammal(String name, int age){
		super(name, age);
	}
	@Override
	public void displayInfo() {
		 System.out.println("사자의 이름은 : " + name + "나이는 : " + age + "입니다." );
	}	@Override
	public void makeSound() {
		System.out.println("으르렁!!");
	}
	@Override
	public void move() {
		System.out.println(name + "땅을 달립니다.");
	}
}
