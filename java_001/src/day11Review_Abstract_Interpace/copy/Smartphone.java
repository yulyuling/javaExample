package day11Review_Abstract_Interpace.copy;

public class Smartphone extends ElectronicDevice implements Rechargeable{

	private int cameraResolution;
	
	Smartphone(String brand, double price, int cameraResolution){
		super(brand, price);
		this.cameraResolution = cameraResolution;
	}
	
	@Override
	public void turnOn() {
		System.out.println("smartphone is turning on...");
	}
	
	@Override
	public void trunOff() {
		System.out.println("smartphone is turning off...");
	}
	
	@Override
	public void charge() {
		System.out.println("smartphone is charging...");
		
	}
	
}
