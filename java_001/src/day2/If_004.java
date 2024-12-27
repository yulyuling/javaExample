package day2;

import java.util.Scanner;

public class If_004 {

	public static void main(String[] args) {
				// 스캐너로 나이를 입력받아서
				// 입력받은 숫자가 20미만이면 "성인이 아닙니다."
				// 20~29 => "20대 입니다."
				// 30~39 => "30대 입니다."
				// 40~49 => "40대 입니다."
				// 50이상 => "50세 이상입니다."
		
			Scanner scan = new Scanner(System.in);
			System.out.print("나이를 입력하세요 : ");

			int num = scan.nextInt();
			
			if(num <=19 ) {
				System.out.println("성인이 아닙니다.");
				}else if(num <= 29) {
					System.out.println("20대 입니다.");
				}else if(num <= 39) {
						System.out.println("30대 입니다.");
				}else if(num <= 49) {
							System.out.println("40대 입니다.");
						}else if(num >= 50) {
							System.out.println("50세 이상입니다.");
					}
		}
	}
		
			
		
