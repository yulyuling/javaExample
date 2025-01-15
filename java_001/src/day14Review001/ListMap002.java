package day14Review001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		//입력받아서 (과일이름,가격,갯수),확인,종료
		
		
		System.out.print("[(1)과일 (2)확인 (3)종료]");
		int menu = scan.nextInt();
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();

			if(menu == 1) { //과일 이름 넣기!
							/*1.과일이름 입력받기
							2.입력받은 이름 map에 넣기
							3.map을 list에 넣기
							4.2번을 누르면 list내용 확인하기.
							4-1 어떻게 확인할건데?
							4-2 아!! 0부터 끝까지 돌면서 확인
							5.3번을 누르면 종료하기
							*/
				
				System.out.print("과일 이름: ");
				String name = scan.next();
				map.put("name", name);							
				
				System.out.print("가격: ");
				int price = scan.nextInt();
				map.put("price", price);
				
				System.out.print("갯수: ");
				int num = scan.nextInt();
				map.put("num", num);
				
				list.add(map);
				
			}
			else if(menu == 2) {
				for(HashMap<String, Object> map2 : list) {
				System.out.println(map.get("name")+"의 가격은 "+ map.get("price") + "이고, 갯수는 "+ map.get("num") + "입니다");
				
				}
			}
			else if(menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			
			
			
		
		}
	}

}
