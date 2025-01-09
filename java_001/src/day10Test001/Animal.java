package day10Test001;

public class Animal {

	 String name;
	 int age;
	 String sound;
	
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	Animal(String name, int age, String sound){
		this.name = name;
		this.age = age;
		this.sound = sound;
	}
	
	void Info(){
		System.out.println("이름 : " +name+", 나이"+age);
	}
	void sound() {
		System.out.println(name + "이 가"+sound+"를 냅니다");
	}
		
	}


