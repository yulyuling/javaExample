package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);

	//중복된 코드를 정리함.
	// 자바(0~40), 오라클(0~35), html(0~25)
	//메소드의 특징을 활용해봐!
	
	public static int setScore(String msg, int max) { //String msg = 메세지를 받겠다.
		while(true) {						//max로 받을 수 있게 해준다.
			System.out.print(msg + "점수 : ");

			int score = scan.nextInt();
			if(score <= max && score >= 0) { //둘다 만족할때
				return score;
		}	
		System.out.println("0~" + max + " 사이 값을 입력해주세요.");
	}
}
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		//이름(name), 자바점수(java), 오라클점수(oracle),
		//html점수(html) 입력받아서 map에 저장
		//전제조건 : 점수는 0~100사이만 가능
		// map을 list에 추가
		
		while(true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("[(1) 추가 (2) 수정 (3) 확인 (4) 종료] ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.err.print("이름 : ");
				String name = scan.next();
				map.put("name", name);
				
				
				// 자바(0~40), 오라클(0~35), html(0~25)
				map.put("java", setScore("자바", 40));
				map.put("oracle", setScore("오라클", 20));
				map.put("html", setScore("HTML", 25));
				
				list.add(map);
			
			
		} else if(menu == 2 ) {
				System.out.println("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						System.out.println("과목");
						String subject = scan.next();
						
						user.put("java", setScore(subject, 40));
						
					}
				}
		}else if(menu == 3 ) {
				System.out.println(list);
				
		}else if(menu == 4) {
				System.out.println("종료합니다.");
				break;
			
		}
		
	}
	}
}
