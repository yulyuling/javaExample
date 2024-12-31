package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGugudan1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
				
		
//		for(int i=1; i<=30; i++) { 
//			int x = ran.nextInt(10); //0~9<개발자 숫자+10개>__10일때 최대숫자=9/0부터 세니깐
//			int x = ran.nextInt(10)+1; //1~10
		
			int x = ran.nextInt(8)+2; //2~9
			int y = ran.nextInt(9)+1; //1~9
		System.out.println(x + " x " + y + " ="); //인트형 -21~21억 사이의 숫자가 나올 것
		int k = x*y;
		
		int num = scan.nextInt();
		if(num == x*y) {
			System.out.println("정답!");
		}else {
				System.out.println("오답! 정답은 : " + (x*y) + "입니다!");
			}
	}
}
		
		
/*	}
		Scanner scan = new Scanner(System.in) {
		int num = scan.nextInt();
			
			if(scan == true) {		
				System.out.println("정답입니다.");
		
			else if(scan != true) 
				System.out.println("오답입니다. 정답은" + k +" 입니다");
			}
		}
		}*/

			
			
		
		






