package day14Review001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap001 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
	
			// 과일가게 
			// 1번 메뉴 과일 추가
			// 2번 메뉴 과일 판매
			// 3번 메뉴 과일 확인
			// 4번 메뉴 종료


		while (true) {
			System.out.print("[(1) 추가, (2) 판매, (3) 확인, (4) 종료 ]" + " ");
			HashMap<String, Object> map = new HashMap<>();
			int menu = scan.nextInt();
			
			if(menu == 1) {
				//여기서 같은 이름은 중복 안되게 할거야.
				//계속 반복해야 알 수 있겠지?
			
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("name", name);
				
				boolean toName = false;					//toname은 처음 거짓임.
				for(HashMap<String, Object> map2 : list) { //리스트를 돌면서 map2에 넣을거야.
					if(map2.get("name").equals(map.get("name"))) {   // 이름이 다른지 비교해봐.
					
						toName = true;
						System.out.println("중복된 이름이 있습니다.");
						break;
	
					}
				}
			
		
				if (!toName) {
	
				System.out.print("가격 : ");
				int price = scan.nextInt();
				map.put("price", price);
	
				System.out.print("갯수 : ");
				int num = scan.nextInt();
				map.put("num", num);
			
				list.add(map);
				}
				
		}if(menu == 2) {
			//판매 -가 되지 않게 판매
			//과일명:사과/구매개수:10/10개를 판매하여 30개 남았습니다.
			//없는과일 입력, 없는 과일입니다. 다시 입력
			//보유갯수보다 많은 갯수를 선택할 경우--현재 사과는 5개 남아있습니다.
			
			System.out.println("판매할 과일을 입력해주세요 : ");
			String name1 = scan.next();
			//귤
			boolean flg = false;
			
			int numForSell = scan.nextInt();
			for(HashMap<String, Object> fruit : list) {
				if(fruit.get("name").equals(name1)){//이름 찾았어
					int stock= (int) fruit.get("num")-numForSell;//찾았으니까 이제 재고확인
					if(stock >= 0) { ///팔수있는데 위에 팔았으니까 장부정리해
						fruit.put("num", stock); // 재고 있을때 끝남 //이제 재고없을때는 어케해
						System.out.println("팔고 남은 " + fruit.get("name") + "의 갯수는 " + fruit.get("num") + " 입니다.");
					} else {
						System.out.println(fruit.get("name") + "의 갯수가 " + fruit.get("num") + "이기 때문에 사고자 하는 갯수인 " + numForSell + "보다 적기 때문에 못 팔아요"); //찾는 과일 없으면? 못팔아
					}
					flg = true;
					break;
				}
				
			}
			if(!flg) {
				System.out.println("없는 과일 못 팜");
			}
			
			
		}if(menu == 3) {
			//확인
			//과일명: 사과
			//사과의 가격은 000, 개수는 0개 남았습니다.
			
			
			System.out.println("재고를 확인할 과일 이름을 입력하세요 : ");
			String name2 = scan.next();
			for(HashMap<String, Object> fruit2 : list) { //사과 오렌지 귤
				if(fruit2.get("name").equals(name2)) {
			
				System.out.println(fruit2.get("name") + "의 개수는 " + fruit2.get("num") + "개 남았습니다.");
				
				
			}
		} if (menu == 4) {
			
			System.out.println("종료합니다.");
			break;
		}
		}
			}
	}//2
}
// 1
