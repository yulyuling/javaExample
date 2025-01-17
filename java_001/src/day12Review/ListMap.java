package day12Review;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap {
	//이름(name), 자바점수(java), 오라클점수(oracle),
	//html점수(html) 입력받아서 map에 저장
	//전제조건 : 점수는 0~100사이만 가능
	// map을 list에 추가

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>>list = new ArrayList<>();
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[(1) 추가 (2) 수정 (3) 확인 (4) 종료] ");
			
			int menu = 0;
			
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				
				map.put("이름", name);
				map.put("포인트", point);
				
				list.add(map);
				
			}
			
		
		}
		
		
	}

}
