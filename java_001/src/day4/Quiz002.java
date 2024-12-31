package day4;

import java.util.Scanner;

public class Quiz002 {

	public static void main(String[] args) {
		
		//스캐너를 통해 숫자 5개를 입력받고 가장 작은 수를 구하시오.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력하세요.");
		int min = 0;
		int input = 0;
		
		for(int i=1; i <= 5; i++) {
			System.out.println(i + "번째 숫자 입력 : ");
			input = scan.nextInt();
			if(i == 1) {
				min = input;			
			}
			if(input < min) {
				min = input;
				
			}
			System.out.println("가장 작은 수는: " + min + "입니다");
			
			}
			
		}
		/*__다른 방법__삼항연산자 이용
		 * 
		 * if(i==1){
		 *  min=input; 
		 *  continue; 
		 *  }
		 *  min = min > input ? input : min;
		 *  
		 */	
	
		
	}


