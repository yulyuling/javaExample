package day2;

public class Loop003 {
	public static void main(String[] args) {

		
		//합:55
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			//	int sum = 0; int sum을 for 문 안에 넣으면 밖에서 프린트가 불가능함.
			//	중괄호 안에서만 프린트 됨.**변수 선언, 프린트의 위치 중요함
			sum += i;
		//	sum = sum + i;
	}
			
			
			System.out.println("합 : " + sum);
			//for 문 안에 있으면 합계가 계속 실행됨.
			//for 문 밖에 있어야 한번에 합계가 실행됨.
			
		
	}
}
