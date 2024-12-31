package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGugudan2_test {

	public static void main(String[] args) {
		
		//문제 수를 입력해 주세요. 0이하 숫자 입력 시 종료됩니다.
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");

		
		int count = 0;
		int total = scan.nextInt();		
		
			
				
		while(true) {
			int x = ran.nextInt(8)+2; //
			int y = ran.nextInt(9)+1; //
			System.out.println(x + " * " + y + " = ");
			
		
			int answer = scan.nextInt();
			
			
			if(answer == 0) {
				System.out.println("종료되었습니다.");
				System.out.println("총 " + total +  " 문제중" + count + " 개 맞추셨습니다.");
				break;
			
	
			}else if(answer == x*y){
				System.out.println("정답입니다.");
				total++;
				count++;
			}else if (answer != x*y){
				System.out.println("오답입니다. 정답은 " + x*y + " 입니다!");
				total++;
				
				
			}else {
				System.out.println(total);
				System.out.println("종료되었습니다.");
				System.out.println("총 " + total +  " 문제중" + count + " 개 맞추셨습니다.");
				break;

				
		
			}
//		} for(int num = scan.nextInt()) {
//			break;
		}
	}
}
			
				Random ran = new Random();
				Scanner scan = new Scanner(System.in);
				System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");
				
				int total = scan.nextInt();
				for(int i=1; i<=total; i++)
