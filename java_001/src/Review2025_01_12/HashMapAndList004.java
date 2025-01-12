package Review2025_01_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapAndList004 {
	private static boolean isNameFound;

	public static void main(String[] args) {
		
	 Scanner scan = new Scanner(System.in);
	 ArrayList<HashMap<String, Object>>list = new ArrayList<>();
	 boolean isNameFound;
	 
	 
	 while(true) { //종료까지 반복
		
		 System.out.print("[ 1.추가  2.확인  3.삭제  4.종료]");
		 int menu = scan.nextInt();
		 
		 
		 if(menu == 1) {
			 HashMap<String, Object>map = new HashMap<>();
			 
			 System.out.print("이름 : ");
			 map.put("이름", scan.next());
			 System.out.print("나이 : ");
			 map.put("나이", scan.next());
			 System.out.print("주소 : ");
			 map.put("주소", scan.next());
			 list.add(map);			 
			 System.out.println("사용자 정보가 추가되었습니다.");
			 
		 }else if(menu == 2) {
			 System.out.println("저장된 사용자 정보: ");
			 for(int i = 0; i<list.size(); i++) {
				 System.out.println("[" + (i+1) + "]");
				 System.out.print("이름: " + list.get(i).get("이름") + ", ");
				 System.out.print("나이: " + list.get(i).get("나이") + ", ");
				 System.out.print("주소: " + list.get(i).get("주소"));
			 }
			 if (list.isEmpty()) {
				 System.out.println("저장된 정보가 없습니다.");
			 }
			 
			 } else if (menu == 3) { // 삭제하는 방법
				 System.out.print("삭제할 이름을 입력해주세요");
				 String nameToDelete = scan.next();
				 
				 isNameFound = false;
			
				//이터레이터를 사용하여 안전하게 삭제
				 Iterator<HashMap<String, Object>> iterator = list.iterator();
			  while (iterator.hasNext()){
						HashMap<String, Object>user = iterator.next();
						 if(user.get("이름").equals(nameToDelete)) {
							isNameFound = true;
						 	iterator.remove();
						 	System.out.println("일치하는 이름을 삭제합니다.");
						 	break;
					
			 }
		 }		
		 if (!isNameFound) {
		 		System.out.println("입력한 이름이 리스트에 없습니다.");
		 }
				 
		 } else if (menu == 4) {
				 System.out.println("종료합니다.");
				 break;
				 
		} else {
				System.out.println("다시 입력해주세요.");
 	}

    }
  }
}

