package day10Review001;

public class Car_Test {

	private static final String Info = null;
	String name;
	String color;
	int speed;
	Car_Test(){
		this.name = "기본차";
		this.color = "하얀색";
	}
	
	Car_Test(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	void carInfo() {
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + "입니다.");
	}
	String setInfo(String name, String color,int speed) {
		this.name = "아반떼";
		this.color = "노란색";
		this.speed = 0;
		
		return Info;
	}
	Car_Test(String name, String color, int speed){
		this.name = "소나타";
		this.color = "파란색";
		this.speed = 0;
	}
	int speedUp(){
		return this.speed;
	}
	int getSpeed() {
		return speed;
	}
	int speedUp(int increment) {
		if(this.speed + increment > 200) {
		this.speed = 200;
		System.out.println(this.speed +"이상의 속도는 불가합니다. " + this.speed + "으로 변경됩니다.");
	} else {
		this.speed += increment; //속도 증가
	}
		return this.speed;
	}
	int speedDown() {
		return this.speed;
	}
	int speedDown(int decrement) {
		if(this.speed - decrement < 0) {
			this.speed = 0;
			System.out.println(this.speed +"미만의 속도는 불가합니다. " + this.speed + "으로 변경됩니다.");
		} else {
			this.speed -= decrement;
		}
		return this.speed;
}
}