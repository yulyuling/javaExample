package day10Review001;

public class Animal {
		
    String name;
    int age;
    String sound;
    
    
    Animal(String name, int age){
    	this.name = name;
    	this.age = age;
    }
    void info() {
    	System.out.println("이름 : "+ name + ", 나이 " + age);
    }
    void sound() {
    	System.out.println(name + "이 " + sound + " 소리를 냅니다.");
	}

}
