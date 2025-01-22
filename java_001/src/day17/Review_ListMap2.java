package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름 나이 주소를 입력받아서
		//맵에 저장하고 list에 추가하기
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
			
		
		for(int i=0; i<3; i++) {
			
			HashMap<String, Object> map = new HashMap<>();
			
			System.out.print("이름:");
			String name = scan.next();

			System.out.print("나이:");
			int age = scan.nextInt();
			
			System.out.print("주소:");
			String addr = scan.next();
		
			map.put("name", name);
			map.put("age", age);
			map.put("addr", addr);
				
				list.add(map);
				break;
			}
			
//		System.out.println(list);
		
		//수정할 사용자 입력 : 홍길동
		// 리스트 안의 맵에 홍길동이 있으면 ->주소 수정할 수 있게
		// 없으면 "없는 사용자 입니다."
		
			System.out.println("이름을 입력해주세용");
			String name = scan.next();
			
			boolean flg = false;
			
				
			for(HashMap<String, Object> human : list) {
				if(human.get("name").equals(name)){
					System.out.println(human);
					
					flg = true;
					
					System.out.println("주소 수정 : ");
					String newAddr = scan.next();					
					human.put("addr", newAddr);
					
					System.out.println(human.get("name") +"의 수정된 주소는 "+ human.get("addr")+"입니다.");
					
					break;
				}
				
			}
			if(!flg) {
				System.out.println("등록되지 않은 이름입니다.");
			}

	}

}
