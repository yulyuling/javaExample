package day11Review_Abstract_Interpace.copy;

public abstract class ElectronicDevice { //추상 클래스

	String brand;
	double price;
	
	ElectronicDevice(String brand, double price){//생성자
		this.brand = brand;
		this.price = price;
	}

	public void turnOn(){ //추상메서드 -- 구현되지 않음.

	}
	public void trunOff() {//추상메서드 --구현되지 않음. /자식이 구체적으로 '반드시'구현해야 한다.

	}
	public void displayInfo() {//일반메서드 -- 구현됨.
		System.out.println("브랜드 : " + brand);
		System.out.println("가격 : " + price);
		
	}
	



}
