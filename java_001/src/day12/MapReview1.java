package day12;

import java.util.HashMap;
import java.util.Scanner;

public class MapReview1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Object> map = new HashMap<>();//객체생성,()는 객체생성 호출==필수
		map.put("name", "홍길동");
		map.put("java", 80);
		map.put("oracle", 70);
		
		System.out.println("과목 : ");
		String subject = scan.next(); //** containsKey **
		if(map.containsKey(subject)) { //원치 않는 결과를 방지하기 위해
									// 저장된 키를 포함하고 있으면 true 리턴
			System.out.println("새 점수");
			int score = scan.nextInt();
			map.put(subject, score);
			
	} else {
		System.out.println("없는 과목임"); //없으면 없는과목이라고 리턴
	}
		System.out.println(map);
	}

}
