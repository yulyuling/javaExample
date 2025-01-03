package day6;

public class CalcMain {

		public static void main(String[] args) {
			
		
		Calculator calc = new Calculator();
		calc.sum(3, 5);
		int a = calc.sum2(3, 5);
		System.out.println("합 : " + a);
		System.out.println("sum : " + a);
		
		//b = 5*2*3;
		
		int b = calc.multiple(5, 2, 3);
		System.out.println(b);
		int c = calc.multiple(10, 20);
		System.out.println(c);
		double d = calc.muliple(5, 7.5); //갯수가 같아도 타입이 다르면 int_double처럼 그러면 사용이 가능함
		System.out.println(d);
		
		
		
		
		
	}

}
