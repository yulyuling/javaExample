package day11Review001_Extends;

public class Cat extends Animal {

	String name;
	String color;
	
	Cat(String name, String color){
		super(name);
		this.color = color;
	}
	@Override
	public void maskSound() {
		System.out.println(" 냐옹");
	}
	@Override
	public void displayInfo() {
		System.out.println("이름 : " + super.name + " 색상" + color);
	}
}
