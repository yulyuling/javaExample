package day4;

import java.util.Scanner;

public class ScannerTest001 {

	public static void main(String[] args) {

		//숫자 5개를 입력받은 수 중에서 가장 큰 수, 가장 작은 수의 평균을 구하시오.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력해주세요");
		//5개로 명시했기 때문에 무한 루프가 아니어도 됨.
		
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.print( i +"번째 숫자 입력 : ");
			int input = scan.nextInt();
			sum += input;
			if(input > max) {
				max = input;
			if(i == 1) { //i == 1 첫번째 입력이라는 뜻__0에서 입력한 첫번째 숫자를 집어넣음.
				max = input;
				min = input;
			}	else {
				if(input > max) // max = math.max(max,input); //math 클래스 이용
					max = input;
				//큰 수 갱신
				if(input < min) { //min = math.min(min,input);
					min = input;
				//작은 수 갱신
			}
			}
			}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + max);
		System.out.println("평균 : " + ((double)sum / 5));
		
		//이거 왜 이상하게 출력됨?
	
}
		}
	}

//		
//		int i = 0;
//		
//		while(true) {
//			int j = scan.nextInt();
//			
//			if(j > i) {j = i} {
//				if (j < i) {j = i} {
//					
//					
//					
//				}
//				
//			//if(input>max) {max =input}	
//			}
//			}
//			
//			
//			
//		}
//	}

		
	


