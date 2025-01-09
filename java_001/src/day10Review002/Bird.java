package day10Review002;

public class Bird extends Animal{
	
	String fly;
	
	Bird(String name, int age){
		super(name, age);       //super는 부모클래스의 메서드 호출할떄 사용.
								//자식 클래스에서 메서드를 오버라이딩하면서 부모 클래스의 기본 동작을 유지하거나 확장
	}
	
	@Override
	void maskSound() { //"동물이 소리를 냅니다."를 출력하고, 자식 클래스에서 "새가 지저귑니다."를 추가로 출력
		System.out.println("새가 지저귑니다."); //--부모클래스의 것을 바꿔서 사용한다.
	}
	void fly() {
		System.out.println("새가 하늘을 납니다.");
	}
}		//this.fly를 사용하려면 String fly; 같은 필드를 클래스에 정의해야 합니다.
		//필드는 **객체가 고유하게 가지는 상태(데이터)**를 저장할 때 사용됩니다. 즉, 객체가 특정 "상태"를 유지해야 할 때 필요합니다.
		//출력만 한다면 필드가 필요하지 않음
		//만약 단순히 "새가 하늘을 납니다."라는 고정된 문장을 출력하려는 경우라면, 상태를 저장할 필요가 없기 때문에 필드를 선언하지 않아도 됩니다.