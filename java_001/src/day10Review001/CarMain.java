package day10Review001;

public class CarMain {

	public static void main(String[] args) {
		
		Car_Test car1 = new Car_Test();
		
		car1.carInfo(); // 자동차의 이름은 기본차, 색상은 하얀색 입니다.
		
		car1.setInfo("아반떼", "노란색", 0); // 0은 speed
		
		car1.carInfo(); // 자동차의 이름은 아반떼, 색상은 노란색 입니다.
		
		
		
		Car_Test car2 = new Car_Test("소나타","파란색",0);
		
		
		car2.carInfo(); // 자동차의 이름은 소나타, 색상은 파란색 입니다.
		
		car2.speedUp(10);
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		
		car2.speedUp(200); // 200 이상의 속도는 불가합니다. 200으로 변경됩니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		
		car2.speedDown(150); 
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		
		car2.speedDown(200); // 0 미만의 속도는 불가합니다. 0으로 변경됩니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
	}
}
