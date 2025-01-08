package day9;

public class Test {
	
	static void increase(int n) { //얘는 일반 변수
		n = n+1; // n++;
	}//n=31;
	 //리턴받은 게 없어서 30이다!?
	
	static void increase(Circle c) {
		//메소드 오버로딩--타입이 다름
		c.radius++;
		
	}
	public static void main(String[] args) {
		
		int n = 30;
		
		increase(n); // increase 메소드 호출 //increase를 복사해서 받은 것이다.
		System.out.println(n); //결과=30;

		Circle c = new Circle(50); //객체 레퍼런스 == Circle c
		increase(c);				// 주소 레퍼런스를 보낸것임.
		System.out.println(c.radius); // 객체는 주소를 복사한다.
	}
}
class Circle{
	int radius ;
	
	Circle(int r){
		radius = r;
		
	}
}
