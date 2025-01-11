package day11Review002;

import java.util.Random;
import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "홍길동 ";
		System.out.print(name);
		
		int age = 30;
		System.out.print(age);
		
		String addr = ", 인천";
		System.out.println(addr);
		System.out.println("=============");
		
		System.out.print("숫자를 입력해주세요: ");
		
		
		
		int num = scan.nextInt();
		
		if(num < 50) {
			System.out.println("50 미만입니다.");
		}else {
			System.out.println("50 이상입니다.");
		}
		
		
		System.out.println("=============");
		System.out.print("숫자를 입력해주세요: ");
		
		int num2 = scan.nextInt();
		if(num2 < 0 || num2 >= 11) {
		System.out.println("계산할 수 없습니다.");
		}else if( num2 % 2 == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		System.out.println("=============");
		System.out.print("숫자를 입력해주세요 : ");
		
		int i = scan.nextInt();	
		for(int j=1; j<=9; j++) {
				int temp = i * j;
				System.out.println(i + "x" + j + "=" + temp);
			}
		System.out.println("=============");

		for(int x=1; x<=30; x++) {
			if( x >= 9 && x <= 19) {
				
				continue; //조건에 맞으면 continue로 현재 반복을 건너뛴다.
		}
			System.out.print(x);
		}
		
		
		int temp2 = 0;
		for(int q = 2; q < 10; q++) {
			for(int w = 1; w < 10; w++) {
				temp2 = q*w;

				if( q == 5 || q == 8) {
					continue;
				}System.out.print(q + "x" + w + "=" + temp2 + "\t");
			
				
				
		
			System.out.println("===============");
			Random ran = new Random();
			int target = ran.nextInt(100)+1;
			int count = 0;
			System.out.println("UP & Down 게임에 오신 것을 환영합니다.");
			System.out.println("1부터 100 사이의 숫자를 맞춰보세요!!");
			
			while(true) {
				System.out.print("숫자를 입력해주세요 : ");
				int guess = scan.nextInt();
				count++;
			if(guess < target) {
				System.out.println("Up!");
			}else if(guess > target) {
				System.out.println("Down!");
				
			}else {			
				System.out.println("정답입니다!");
				System.out.println( count +"번 만에 맞추셨습니다.");
			break;
			}
			}
			}
		}
	}
}
