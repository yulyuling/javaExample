package day11Review002;

public class ElectronicDeviceMain {
	public static void main(String[] args) {
		
	        ElectronicDevice[] devices = {
	        		
	            new Laptop("Dell", 1500, 10),// Dell 브랜드의 노트북 (가격: 1500, 배터리 수명: 10시간)
	            new Smartphone("Samsung", 1200, 108)// Samsung 브랜드의 스마트폰 (가격: 1200, 카메라 화소: 108)
	        };
	        
	        
	        for (ElectronicDevice device : devices) {
	            device.displayInfo();
	            device.turnOn();
	            if (device instanceof Rechargeable) {
	                ((Rechargeable) device).charge();
	            }
	            System.out.println();
	    }
	}

}
