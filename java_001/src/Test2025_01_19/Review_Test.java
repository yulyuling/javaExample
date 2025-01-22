package Test2025_01_19;

import java.util.Arrays;
import java.util.Scanner;

public class Review_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		   2. 1부터 100까지 숫자 중 홀수이거나 8의 배수인 숫자를 출력하시오.
//		   		단, 50~60까지의 숫자를 출력하지 마시오.
//		   3. 6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게
//		   		숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		   		조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		   		조건2. 중복된 숫자는 들어가지 못하게 할 것
//		   		조건3. 배열 내림차순
//		   4. 아래 코드와 실행결과를 보고 Human, Student 클래스를 완성하시오.
		
		for(int i=1; i<=100; i++) {
			if((i % 2 != 0 || i % 8 == 0) && !(i >= 50 && i <= 60 )) {
				System.out.println(i + " ");
			}
		}
		Scanner scan = new Scanner(System.in);
		boolean flg = false;
		while(true) {
			
			int arr[] = new int [6];
			for(int i = 0; i<arr.length; i++) {
				System.out.println("숫자를 입력해: ");
				int num = scan.nextInt();
				if(num >= 1 &&  num <= 100) {
					arr[i] = num;
				} else {
					System.out.println("0~100 사이만 입력해라");			
					break;
				}
//				for(int j=1; j<; j++) {
//					if(arr[i] == arr[j]) {
//						System.out.println("중복된 값임! 다시 입력 ㄱㄱ");
//					} else {
//						break;
//					}
//					
//				}
				System.out.println(Arrays.toString(arr));
		}
			
				
		}
	}
}
