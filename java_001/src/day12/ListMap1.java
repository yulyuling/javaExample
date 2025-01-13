package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		
		for(;;) {
			HashMap<String, Object> map 
				= new HashMap<String, Object>();
			System.out.print("[(1) 추가 (2) 확인 (3) 종료] ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				
				boolean updateFlg = false; //불값을 넣어서 동일이름 제어
				//최초 0이라서 아래 for문 건너뛰고 if로 넘어가서 새로 추가
				//같은 이름 입력시 for문으로 들어와서 포인트를 추가해주고, if문은 true=>false가 되어서 건너뜀
				
				
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name")) ) {
						int newPoint = (int) list.get(i).get("point") + point;
						list.get(i).put("point", newPoint);
						updateFlg = true; //같은 이름이 없으면 //트루로 다시 바꿔준다
						break;
					}
				}
				
				if(!updateFlg) { //새롭게 맵에 넣어서 리스트에 넣는다.
					//updateflg == false와 같은 말.
					map.put("name", name);
					map.put("point", point);
					list.add(map);
				}
				
//				map.put("name", scan.next());
				
			} else if(menu == 2) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.println("과목 : ");
				String targetSubject = scan.next();
				
				boolean isNameFound = false;
				
				 Iterator<HashMap<String, Object>> iterator = list.iterator();
			  while (iterator.hasNext()){
						HashMap<String, Object> user = iterator.next();
						 if(user.get("이름").equals(name)) {
							isNameFound = true;
						 	iterator.hasNext();
						 	break;
					}
				}
				// "ooo님의 포인트는 ooo 입니다."
				
			}
		}
		
		
		
	}
}