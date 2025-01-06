package day7;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(); // 1. 객체 생성 먼저 해야 한다.
		calc.intro();
		//System.out.println(calc.sum(5, 10));//calc.sum(5, 10); 
		//메소드 안에 다른 메소드를 넣은 거임.
		int sum = calc.sum(5, 10);
		System.out.println(sum); // 보기가 좀 그래서 이렇게 쓴다.
		sum = calc.sum(300, 1500);
		System.out.println(sum);
		sum = calc.sum(5.3, 3.1);
		System.out.println(sum);
		sum = calc.sum(10, 20, 30.5);
		System.out.println(sum);
	}

}
