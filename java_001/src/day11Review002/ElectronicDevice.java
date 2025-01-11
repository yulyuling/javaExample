package day11Review002;

public abstract class ElectronicDevice { //추상 클래스

	String brand;
	double price;
	
	ElectronicDevice(String brand, double price){//생성자
		this.brand = brand;
		this.price = price;
	}

	public void turnOn(){ //추상메서드 -- 구현되지 않음.

	}
	public void trunOff() {//추상메서드 --구현되지 않음. **자식이 구체적으로 '반드시'구현해야 한다.

	}
	public void displayInfo() {//일반메서드 -- 구현됨.
		System.out.println("브랜드 : " + brand);
		System.out.println("가격 : " + price);
		
	}
}

/*
 * 1. 추상 클래스 (abstract class) 정의
 * 
 *  추상 클래스는 공통적인 속성과 동작을 정의하기 위해 사용됩니다.
 *  추상 클래스는 인스턴스를 생성할 수 없으며, 자식 클래스가 반드시 구현해야 하는 추상 메서드와, 이미 구현된 일반 메서드를 함께 가질 수 있습니다.
 *  
 *   특징
 *  추상 클래스는 abstract 키워드로 선언됩니다.
 *  추상 메서드는 구현(코드 본문)이 없고, 자식 클래스가 이를 **구체적으로 * 구현(override)**해야 합니다.
 *  추상 클래스는 일반 메서드와 필드를 가질 수 있습니다.
 *  
 */
