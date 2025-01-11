package day11Review002;

public interface Rechargeable {
	
	void charge(); //메서드 구현 없음. public abstract가 암묵적으로 포함.
}
/*
 * 인터페이스 (interface) 정의
 * 
 * 인터페이스는 **구현해야 할 메서드의 틀(설계)**을 제공합니다. 
 * 모든 메서드는 기본적으로 추상메서드이며, 구현(코드 본문)이 없습니다. 
 * 자식 클래스는 인터페이스를 implements 키워드로 구현해야 합니다.
 * 
 * 특징 
 * 인터페이스는 * interface 키워드로 선언됩니다.
 * 모든 메서드는 암묵적으로 public abstract이며, 필드는 public static * final입니다. 
 * 한 클래스는 **여러 개의 인터페이스를 구현(implements)**할 수 있습니다.
 */