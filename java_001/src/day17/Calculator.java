package day17;

public interface Calculator {
	//완전 설계목적
	//추상메소드들만 정의해놓는다.
	//설계목적이기에 주석을 잘 달아줘야함.
	
	//숫자 2개 받아서 더한 후 리턴
	int sum(int x , int y);
	//숫자 3개 받아서 더한 후 리턴
	int sum(int x, int y, int z);
	//숫자 2개 받아서 곱한 후 리턴
	int multiple(int x, int y);
	//숫자 2개 받아서 나눈 후 리턴
	int divide(int x, int y);
	
	//숫자 2개 받아서 큰 수를 리턴
	int max(int x, int y);

	
}
