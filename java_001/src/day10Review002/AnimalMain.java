package day10Review002;

public class AnimalMain {

	public static void main(String[] args) {

		Bird chichi = new Bird("치치", 7);
		
		chichi.info();
		chichi.maskSound();
		chichi.fly();
		
		System.out.println();
		
		Fish momo = new Fish("모모", 10);
		momo.info();
		momo.maskSound();
		momo.swim();
		
		
	}

}
