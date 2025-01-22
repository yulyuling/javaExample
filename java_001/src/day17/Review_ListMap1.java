package day17;

import java.util.ArrayList;
import java.util.HashMap;

public class Review_ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(35);
		list.add(15);
		System.out.println(list);
		
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		System.out.println(map);
		
		ArrayList<HashMap<String,Object>> userList = new ArrayList<>();
		
		userList.add(map);
		System.out.println(userList);
	}

}
