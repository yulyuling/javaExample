package Review2025_01_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapAndList001 {
	
		
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	ArrayList<HashMap<String, Object>>
	list = new ArrayList<>();
	//list에 hashmap으로 사람의 정보를 만들어서 넣을것이다.
	
	
	while(true) { //while문으로 사람의 정보를 계속출력할 것이다. 종료전까지.
		System.out.print("[ (1) 추가 (2) 확인 (3) 종료 ] ==> ");
		int menu = scan.nextInt();
		
		if(menu == 1) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("이름: ");
			map.put("name", scan.next());
			System.out.println("나이: ");
			map.put("age", scan.next());
			System.out.println("주소: ");
			map.put("addr", scan.next());
			list.add(map);
			
		}else if(menu == 2) {
			System.out.println("유저를 확인하겠습니다.");
			for(int i=0; i<list.size(); i++) {
				System.out.println((i+1) + ",");
				System.out.println("이름: " + list.get(i).get("name") + ",");
				System.out.println("나이: " + list.get(i).get("age") + ",");
				System.out.println("주소: " + list.get(i).get("addr"));
			}
			} else if(menu == 3){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4번 중에 선택하세요.");
		}
	}
}
}
	


