package day18;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Review001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 오버로딩 : 오버로딩은 내 메소드를 다른 클래스가 쓸 수 있게 해준다??
		//2. 오버라이딩 : 오버라이딩은 다른 클래스에 있는 메소드를 사용할 수 있게 한다.
		//3. 생성자 : 객체를 초기화(사용)할 수 있게 하는 것. 생성자를 만들지 않아도 자동으로 생성되며,
		//		    가장 큰 특징은 클래스명과 생성자명은 같은 이름이다.
		//4. 가비지 컬렉션 : 더이상 주소를 받지 않는(사용할 수 없는) 객체?를 가비지라고 부르며, 자바에서는 일정 용량이
		//				 되면 자동으로 삭제 된다.
		
		//2. 1부터 100까지 숫자 중 홀수이거나 8의 배수인 숫자를 출력하시오.
		//   단, 50~60까지의 숫자를 출력하지 마시오.
		for(int i=1; i<101; i++) {
			if(i % 2 == 1 || i % 8 == 0) {
			} if ( i < 50 && i > 60 ) {
			}
			System.out.println(i);
		}
		
		//3. 6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게
		//숫자를 입력받아서 배열의 모든 공간에 넣으시오.
		//조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
		//조건2. 중복된 숫자는 들어가지 못하게 할 것
		//ex) [1,3,4,1,2] => [4,3,2,1] (1은 중복되므로 하나의 값만 입력)
		
		Scanner scan = new Scanner(System.in);
		int arr [] = new int [6];
		int count = 0;
		while(true) {
			
			System.out.println("숫자를 입력해주세요: ");
			int num = scan.nextInt();

			if( num > 100 || num < 0) {
				continue;				
		

			for(int i=0; i <arr.length; i++) {
						System.out.println("중복된 숫자입니다.");
						boolean flg = false;
						flg = true;
						continue;
					}							
					if(!flg) {
						arr[i] = num;
						System.out.println(Arrays.toString(arr));
						}
			}
			for(int i = 0; i<arr.length-1; i++) {
				int min = i;
				for(int j = i+1; j<arr.length; j++) {
					if(arr[j] < arr[min]) {
						min = j;
					}
				}
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
			}
		}
		
	}

}
