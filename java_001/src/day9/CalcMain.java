package day9;

public class CalcMain {

	public static void main(String[] args) {
		
//		Calculator calc = new Calculator(); // 추상클래스에서는 객체 생성 불가. XXX new XXX
		//추상클래스는 객체 생성 불가능
		
		GoodCalc calc = new GoodCalc();
		int div = calc.div(5, 10);
		int mod = calc.mod(5, 2);
		int sum = calc.sum(3, 2);
		int mul = calc.mul(3, 5);
		int sub = calc.sub(10, 5);
		
		
	}
}
