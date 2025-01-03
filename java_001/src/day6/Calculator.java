package day6;

public class Calculator { //클래스는 계산 작업(덧셈, 곱셈)을 수행하는 메서드를 제공

	
	/*
	 *   sum: 두 정수를 더하고 결과를 출력.
	 *   sum2: 두 정수를 더하고 결과를 반환.
	 *   multiple: 세 정수를 곱하고 결과를 반환
	 */

		void sum(int x, int y) {
			
			System.out.println( "두 수의 합은 + " + (x+y));
			
		}
		
		int sum2(int x, int y) {
			return x+y;
	
		}
		int multiple(int x, int y) { //아래와 동일한 이름의 메소드
			return x*y;				// 매개변수를 다르게 해야함.(int x, int y), (int x, int y, int x)마냥
			
		}
		int multiple(int x, int y, int z) {
			return x*y*z;
		}
		double muliple(int x, double y) {
			return x*y;
	
		
	}
}

