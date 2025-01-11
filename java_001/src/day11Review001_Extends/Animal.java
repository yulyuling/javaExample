package day11Review001_Extends;

public class Animal {
	
	String name;
	String maskSound;
	
	Animal(String name){
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("이름" + name);
	}
	public void maskSound() {
		System.out.println("some generic sound");
	}
	
}
