package day11Review001_Extends;

public class Dog extends Animal{
	
	String name;
	String breed;
	
	Dog(String name, String breed){
		super(name);
		this.breed = breed;
	}
	@Override
	public void maskSound() {
		System.out.println(" 멍멍");
	}
	@Override
	public void displayInfo() {
		System.out.println("이름: " + super.name + " 품종" + breed);
	}
	
}
