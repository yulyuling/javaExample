package day10Review001;

public class Dog extends Animal{
	
	
	Dog(){
		super("알 수 없음", 0);
	}
	
	String breed;
	
	Dog(String name, int age, String breed){
		super(name, age);
		this.breed = breed;
	}
	@Override
	public void info() {
		System.out.println(name +", 나이 :" + age);
	}
	@Override	
	public void sound() {
		System.out.println("멍멍!");
	}
	String getBreed() {
		return breed;
	}
	
}
