package day12Review001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			int menu = scan.nextInt();
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[(1) 추가 (2) 확인 (3) 종료] ");
			
			boolean flg = false;
			
			if( menu == 1) {
				
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("포인트 : ");
			int point = scan.nextInt();
			
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).equals("name")) {
					int newpoint = (int) list.get(i).get("point") + point;
					
					list.get(i).put("point", newpoint);
					flg = true;
					break;
				}
			}
			if(!flg) {
				map.put("name", name);
				map.put("point", point);
				list.add(map);
			}
			
		if (menu == 2) {
			HashMap<String, Object> user = new HashMap<>();
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("과목 : ");
			String subject = scan.next();
			
			user.put("name", name);
			user.put("subject", name);
			
			list.add(user);

		}
			}System.out.println(list);
		}
	} 

}
