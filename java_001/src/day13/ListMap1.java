package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[]<리스트,{}맵,
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("name", "홍길동");
		user1.put("age", 30);
		list.add(user1);
						
		HashMap<String, Object> user2 = new HashMap<>();
		user2.put("name", "채티");
		user2.put("age", 20);
		list.add(user2);
		
//		System.out.println(list);
		
//			for(int i = 0; i<list.size(); i++) {
//				if("김철수".equals(list.get(i).get("name"))) {
//					list.get(i).put("addr", "인천");
//				}
//			}
		
		for(int i = 0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			if("채티".equals(user.get("name"))) {
				user.put("addr", "인천");
				
			}
		}
			System.out.println(list);
		}
		
	}
