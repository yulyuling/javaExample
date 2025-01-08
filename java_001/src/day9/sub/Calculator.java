package day9.sub;

public interface Calculator {

	int sum(int x, int y); //인터페이스에서는 추상메소드이다.
	//덧셈
	int sub(int x, int y);
	//뺄셈
	int mul(int x, int y);
	//곱셈
	int div(int x, int y);
	//나눗셈
}
