package day11Review_Abstract_Interpace.copy;

public class Laptop extends ElectronicDevice implements Rechargeable{

	private int batteryLife;
	
	
	Laptop(String brand, double price, int batteryLife){
		super(brand, price);
		this.batteryLife = batteryLife;
	}
	@Override
	public void turnOn() { //반드시 구현해야 했던 추상메서드
		System.out.println("Laptop is turning on...");
	}
	@Override
	public void trunOff() {
		System.out.println("Laptop is shutting down...");
	}
	@Override
	public void charge() {
		System.out.println("Laptop is charging...");
	
	}
}