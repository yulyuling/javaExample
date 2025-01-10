package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>(); 
			//<String, Object>==Obj를 더 많이 쓰게 될 것이다.
		
		while(true) {
			System.out.print("[(1) 추가 (2) 확인 (3) 삭제 (4) 종료] : ");
			int menu = scan.nextInt();
			if( menu == 1 ) {//입력
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				map.put("name", scan.next());
				System.out.print("나이 : ");
				map.put("age", scan.nextInt());
				System.out.print("주소 : ");
				map.put("addr", scan.next());
				list.add(map);
				
//				System.out.println("-------------------------");
		
			
		} else if ( menu == 2) { //출력
			for(int i=0; i<list.size(); i++) {
				System.out.println((i+1) + ". ");
				System.out.println("이름 : " + list.get(i).get("name") +",");
				System.out.println("나이 : " + list.get(i).get("age") +",");
				System.out.println("주소 : " + list.get(i).get("addr")+ ",");
			}
		}else if (menu == 3) { //삭제
			System.out.println("삭제할 사용자의 이름을 입력해주세요 : ");
			String name = scan.next();
			boolean deleteflg = false;
			for(int i=0; i<list.size(); i++) {
//				HashMap<String, Object> map = new HashMap<>();
//				if(name.equals(map.get("name"))) {
				if(list.get(i).getName().equals(name)) {
					list.remove(i);
					deleteflg = true;
					break;
				}
			} if(deleteflg) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("이름을 다시 확인해주세요.");
			}
		}else if (menu == 4) {
			System.out.println("종료되었습니다.");
			break;
			
		} else {
			System.out.println("1~3번 중에 선택하세요.");
		}
			}
		}
}
		
			
//		HashMap<String, Object> map = new HashMap<>();
//		System.out.print("이름 : ");
//		map.put("name", scan.next());
//		System.out.print("나이 : ");
//		map.put("age", scan.nextInt());
//		System.out.print("주소 : ");
//		map.put("addr", scan.next());
//		list.add(map);
//		
//		System.out.println(list);
		
		
		
		
		
	

//		while(true) {
//			System.out.println("삭제할 사용자의 이름을 입력해주세요 : ");
////			String name = scan.next();
//			
//		}if(list.get(name)==name ){
//				
//				list.remove(scan.next());
//				System.out.println("삭제되었습니다.");
//				break;
//			}else if(list.equals(false)){
//			System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
//			break;
//			}
//		}