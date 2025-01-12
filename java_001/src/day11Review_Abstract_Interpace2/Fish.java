package day11Review_Abstract_Interpace2;

public class Fish extends Animal implements Swimmable{

	Fish(String name, int age){
		super(name, age);
	}
	@Override
	public void displayInfo() {
		 System.out.println("물고기의 이름은 : " + name + "나이는 : " + age + "입니다." );	
	}
	@Override
	public void makeSound() {
		System.out.println("...");
	}
	@Override
	public void move() {
		System.out.println(name + "이 물 속에서 헤엄칩니다.");
	}
	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다.");
	}
		
	}
