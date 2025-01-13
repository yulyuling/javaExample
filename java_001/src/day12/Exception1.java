package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			
		try {
			System.out.print("나뉘는 수 : ");
			int num1 = scan.nextInt();
			System.out.print("나눌 수 : ");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);
			break; //브레이크를 못 만나면 catch로 넘어가서 다시 첫번째로 루프를 돈다.
			
//		}catch (ArithmeticException e) {
//			System.out.print(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.out.print("숫자 입력하셈");
//			scan.nextLine(); //버퍼없앤다????
//							// 
		} catch (Exception e) { //장점=모든 예외를 처리해준다
								//단점=사용자에게 명확한 에러를 알려줄 수 없다.
			System.out.println("예기치 못한 에러 발생");
		}
	}
		
	
	}

}
