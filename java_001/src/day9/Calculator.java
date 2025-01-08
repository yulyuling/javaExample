package day9;

public abstract class Calculator { //abstract 가 붙었으면 추상클래스
									//추상클래스가 없어도 abstract가 붙으면 추상클래스
	//추상메소드는 전부 다 오버라이딩해야만 추상클래스가 아니게 된다.
	
	//추상클래스는 직접사용은 불가, 오버라이딩해야만 쓸 수 있다.
	//추상메소드가 있으면 클래스도 abstract를 꼭 달아야한다.

	int sum(int x, int y) {
		return x+y;
	}
	int sub(int x, int y) {
		return x-y;
	}
	abstract int mul(int x, int y); //추상메소드는 구체화가 안 된 애들인데. 밑에 구체화가 되어있어서 빨갛게 뜸
//		return x*y;
	abstract int div(int x, int y); 
//		return x/y;
	
}
