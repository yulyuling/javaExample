package day3;

import java.util.Scanner;

public class Loop004 {
	public static void main(String[] args) {

//		while (true) {
//			System.out.println("while 무한루프!"); //조건이 true라서 계속 실행
//	
		
		
		//사용자로부터 숫자를 입력받고 선택한 메뉴에 따라서 더하거나 빼는
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;		
		while (true) {
			System.out.println("메뉴 선택");
			System.out.println("(1) 덧셈 (2) 뺄셈 (3) 결과 (4) 종료");
			int menu = scan.nextInt();
			if(menu ==1 ) {
			//값을 입력받아서 sum에 값을 더하고 저장한다
				System.out.println("더할 숫자를 입력 : ");
				sum += scan.nextInt();
				/*
				 * int value =scan.nextInt();
				 * sum += value;
				 * 이렇게 만들어야 하는 것을 간단한게 줄였음.
				 */
		}	else if(menu == 2) {
			System.out.println("뺄 숫자를 입력 : ");
			sum -= scan.nextInt();
		    //값을 입력받아서 sum에서 빼기
		}	else if(menu == 3) {
			System.out.println("현재 값 : "+ sum);
			//sum에 있는 값 출력
		}	else if(menu == 4) {
			System.out.println("종료되었습니다.");
			System.out.println("최종 값 : "+ sum);
			break;
			//프로그램 종료
		}	else {
			System.out.println("1~4중 하나를 입력해주세요.");
			//잘못된 숫자 입력시 출력
		}
		}
		
	}
}
