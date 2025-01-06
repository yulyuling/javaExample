package day7;

public class StaticEx1 {
	int num = 10; //디폴트가 생략됨.
	int money = 50000;
	static final double PI = 3.141592; //static 으로 선언함--공통값은 static으로 선언함.
	//3.141592, 3.14등 값이 다를 수 있어서
	//final은 아예 접근이 안됨. set메소드로도 안 됨.
	//static final 은 같이 사용하면 아예 접근을 할 수 없음.
	
	int sum(int x, int y) {
		return x+y;
	}
	
	static int staticSum(int x, int y) {
		return x+y;
	}
}
	
