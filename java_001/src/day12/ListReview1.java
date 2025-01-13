package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview1 {

	public static void main(String[] args) {
		
		// ArrayList. 가변적인 특징이 있다. 몇개든 늘려서 넣을 수있음.
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(2);
//		list.add(1, 10);
		//숫자 입력받아서 list에 넣고
		//총 합을 구해라.
		//단, -1을 입력하면 종료
		//무한 루프
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = scan.nextInt();
			if(input != -1) {
				list.add(input);
				
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		System.out.println(list);
		
		

	}//2

}
