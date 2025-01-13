package day12Review001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(;;) {
			System.out.print("[(1) 추가 (2) 확인 (3) 종료] ");
			HashMap<String, Object> map = new HashMap<>();
			
			int menu = scan.nextInt();
			
			if(menu == 1) {
				
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("나이 : ");
				int age = scan.nextInt();
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				
				boolean toName = false;
				for(int i = 0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("이름"))) {
						int newPoint = (int) list.get(i).get("point") + 30;
//						toName = true;
						map.put("age", age);
						map.put("name", name);
						map.put("point", point);

						list.add(map);	
					}
					
				} if(!toName) {
			} map.put("age", age);
			  map.put("name", name);
			  map.put("point", point);
		      list.add(map);
					
			} else if ( menu == 2) {
				System.out.println(list);
			}
		}
	}
}

