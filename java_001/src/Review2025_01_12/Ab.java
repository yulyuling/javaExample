package Review2025_01_12;

import java.util.Scanner;

public class Ab {

	public static void main(String[] args) {
		//두 자연수 A와 B가 주어진다. 이때, 
		//A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해라.");
		int sum = 0;
		System.out.print("a 숫자를 입력: ");
		int a = scan.nextInt();
		System.out.print("b 숫자를 입력: ");
		int b = scan.nextInt();
		
		sum = a-b;
		
		System.out.println(sum);
		
	}

}
