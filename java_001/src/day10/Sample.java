package day10;

public class Sample {
	
	String name;
	int age;
	
	Sample(String name, int age){
		this.name = name;
		this.age = age;
		static int money = 100000;
	}

	Sample obj() { //return 타입에 Sample이 붙은 이유.==int,String== **Sample을 리턴하겠다(this)**
		return this; //
	}
}
