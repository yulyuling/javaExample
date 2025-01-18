package day16Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class fruit001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		
		while(true) {
			System.out.print("1.추가 2.확인 3.종료 ");
			int menu = scan.nextInt();
			if (menu == 1){
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일 추가: ");
				String name = scan.next();
				map.put("이름", name);
				
				boolean newName = false;
				
				for(HashMap<String, Object> fruit : list) {
					if(fruit.get("이름").equals(name)){
						map.put("이름", fruit);
						newName = true;
						System.out.println("중복된 이름입니다.");
						break;
					}					
				}
				if(!newName) {
					
					System.out.print("가격 : ");
					int price = scan.nextInt();
					map.put("가격", price);
					System.out.print("갯수 : ");
					int num = scan.nextInt();
					map.put("갯수", num);
					
					list.add(map);
				}
			}
			if(menu == 2) { //확인
				System.out.print("검색 입력: ");
				String name2 = scan.next();
								
				for(HashMap<String, Object> fruit : list) {
					if(fruit.get("이름").equals(name2)){
						System.out.println(fruit.get("이름")+"의 가격은 " + fruit.get("가격") + "원 이고, 남은 갯수는 " + fruit.get("갯수") + "개 입니다.");
					}
				}
			}
			if(menu == 3) {//종료
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
