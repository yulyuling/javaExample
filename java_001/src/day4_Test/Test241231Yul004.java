package day4_Test;

import java.util.Scanner;

public class Test241231Yul004 {
public static void main(String[] args) {
	/*
	 * 4. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 출력하시오. (ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ...
	 * 2*9=18 출력)
	 */
	
		Scanner scan = new Scanner(System.in);
	
		
			
		int num = scan.nextInt();
			for (int i=1; i<=9; i++){
			
				System.out.println(num + "*" + i + "=" + num*i);
		}
	}
}




