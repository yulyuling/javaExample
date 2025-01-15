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
		
		
		while(true) {
			int menu = scan.nextInt();
			System.out.print("[(1)과일 (2)확인 (3)종료]");
			HashMap<String, Object> map = new HashMap<>();

			if(menu == 1) { //과일 이름 넣기!
			
				
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
				
//				System.out.println(list);
			}
			else if(menu == 2) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.println(map.get("name")+"의 가격은 "+ map.get("price") + "이고, 갯수는 "+ map.get("num") + "입니다");
				
			}
			else if(menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			
			
			
		
		}
	}

}
