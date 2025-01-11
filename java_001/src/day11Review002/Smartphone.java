package day11Review002;

public class Smartphone extends ElectronicDevice implements Rechargeable{
	
	//**implements**는 클래스가 인터페이스에서 정의한 메서드를 구현하겠다는 약속입니다.
	//한 클래스에서 추상 클래스를 상속받고, 인터페이스를 구현할 수 있습니다.

	private int cameraResolution;
	
	Smartphone(String brand, double price, int cameraResolution){
		super(brand, price);
		this.cameraResolution = cameraResolution;
	}
	
	@Override
	public void turnOn() {//반드시 구현해야 했던 추상메서드
		System.out.println("smartphone is turning on...");
	}
	
	@Override
	public void trunOff() {
		System.out.println("smartphone is turning off...");
	}
	
	@Override
	public void charge() {//인터페이스에서 가져옴. 반드시 구현해야 함.

		System.out.println("smartphone is charging...");
		
	}
	
}
