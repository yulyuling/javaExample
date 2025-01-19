package Review2025_01_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fruit002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		int myMoney = 0;
		
		while(true) {
			System.out.print("1,추가 2,확인 3,수정 4,판매 5,종료");
			HashMap<String, Object> map = new HashMap<>();
			String input = scan.next();
			
			
			if(!input.matches("\\d+")) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			
			}
			int menu = Integer.parseInt(input);
			
			if(menu == 1) {//추가				
				System.out.print("이름 입력: ");
				String name = scan.next();
				map.put("이름", name);
								
				boolean flg = false;				
				
				for(HashMap<String, Object> fruit :list) {
					if(fruit.get("이름").equals(name)) {
						map.put("이름", fruit);
						System.out.println("추가되었습니다.");
						
						
						
						System.out.println("중복된 이름입니다.");
						System.out.println("추가 수정을 하시려면 0번을 눌러주세요.");
						System.out.println("초기메뉴로 돌아가시려면 9번을 눌러주세요.");
						flg = true;
					}
					if(!flg) {
						System.out.print("가격: ");
						int price = scan.nextInt();
						map.put("가격", price);
						System.out.print("개수: ");
						int num = scan.nextInt();
						map.put("개수", num);
						
						list.add(map);
						
					}
				}
				
			}
		}
	}

}
