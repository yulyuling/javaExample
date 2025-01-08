package day9.sub;

public class GoodCalc implements Calculator { //인터페이스 구현은 클래스에서 한다.
					//implements 구현한다
					//인터페이스의 메소드를 모두 다 구현하지 않으면 에러가 생김.


	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
}
