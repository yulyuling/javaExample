package day9;

public class GoodCalc extends Calculator{
	
	//추상클래스로 쓰기 싫으면 여기서 재정의해서 쓰면 된다
	//추상메소드는 전부 다 오버라이딩해야만 추상클래스가 아니게 된다.

	@Override //오버라이딩해서 원래 갖고 있던 부모클래스의 메소드는 다 사용할 수 있음
	int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	@Override
	int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	
	//나머지 연산modulo
	int mod(int x, int y) {
		return x%y;
	}
}
