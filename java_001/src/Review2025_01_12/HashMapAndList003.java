package Review2025_01_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapAndList003 {

	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>>list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("1 추가, 2 확인, 3 종료 ==>");
			int menu = scan.nextInt();
			
			if( menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.println("이름: ");
				map.put("이름", scan.next());
				System.out.println("나이: ");
				map.put("나이", scan.next());
				System.out.println("주소: ");
				map.put("주소", scan.next());
				list.add(map);
				  
			} else if (menu == 2){
				System.out.println("확인 중입니다. 잠시만 기다려주세요.");
				for(int i = 0; i<list.size(); i++) {
					System.err.println((i) + ",");
					System.out.println("이름: " + list.get(i).get("이름"));
					System.out.println("나이: " + list.get(i).get("나이"));
					System.out.println("주소: " + list.get(i).get("주소"));
				}
			} else if (menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			} else { 
				System.out.println("다시 입력해주세요");
					
				}
			
			
		}
		
	}
}
