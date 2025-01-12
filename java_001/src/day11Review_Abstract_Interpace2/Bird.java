package day11Review_Abstract_Interpace2;

public class Bird extends Animal implements Flyable{
	
	
	Bird(String name, int age){
		super(name, age);
	}
	@Override
	public void displayInfo() {
		 System.out.println("새의 이름은 : " + name + "나이는 : " + age + "입니다." );
	}
	@Override
	public void makeSound() {
		System.out.println("끼이익!");
	}
	@Override
	public void move() {
		System.out.println(name + "날아다닙니다.");
	}
	@Override
	public void fly() {
		System.out.println(name + "이 높이 납니다.");
	}
	
}
