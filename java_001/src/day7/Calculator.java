package day7;

public class Calculator {
		
	//intro 메소드 생성
	//return x 호출 시 "계산기 객체입니다"출력
	//리턴타입이 없으면 void로 생성한다
	
	void intro () {
		System.out.println("계산기 객체 입니다.");
	}
	// int 형 숫자 2개를 받아서 더한 후 되돌려 주는 메소드를 만들것
	
	int	sum (int x, int y) { //int형 데이터를 되돌려주지 않아서 빨갛게 뜸. 무조건 return 해줘야하는 메소드
		return x+y;
	}
	// double 형 숫자 2개를 받아서 더한 후 되돌려 주는 메소드를 만들것
	// 소수점을 제거하고 int형 데이터로 되돌려 주는 메소드--이럴땐 int로 해도 됨
	int sum(double x, double y) {
		return (int) ( x + y ); //x+y만 쓰면 오류뜸.(int) ( x + y ) 이렇게 써야 함. x+y에 괄호를 빼면 x만 인트로 바뀌는 것.
		//(int)인 이유는 double형 데이터를 억지로 바꿔버리기 위해서 괄호를 사용함.		
	}
	int sum (int x, int y, double z) {
		return (int) ( x + y + z); // x + y + (int) z;
	} //x = 5, y = 3, z = 0.7
	 // 코드 1: (int) (5 + 3 + 0.7) → (int) 8.7 → 8
	 // 코드 2: 5 + 3 + (int) 0.7 → 5 + 3 + 0 → 8
	 // 이렇게 될 가능성이 있으니, double에만 강제 인트화를 시켜야만 하겠다.
	
	
}
