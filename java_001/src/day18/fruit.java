package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		
		while(true) {
			System.out.print("=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ===");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				
				
				System.out.println("과일 이름 : ");
				String name = scan.next();
				map.put("이름", name);
				
				boolean flg = false;
				
				for(HashMap<String, Object> fruit : list) {
					if(fruit.get("이름").equals(name)){
							
						System.out.println("중복된 이름입니다.");
						System.out.print("개수를 추가합니다: ");
						int countPlus = scan.nextInt();
						
							int count1 = (int) fruit.get("개수")+countPlus;
							if(count1 >= 0 && count1 <= 100) {
							fruit.put("개수", count1);
							System.out.println(fruit.get("이름") + "의 개수는 " + countPlus +
									"개 추가되어, 총 " + count1 + "개 입니다.");
					
						}else {
							System.out.println("0개에서 100개 사이의 값을 입력해주세요");
						}
						flg = true;
						break;
					}
				}
				if(!flg) {
					System.out.print("가격 : ");
					int price = scan.nextInt();
					map.put("가격", price);
					if((int) map.get("가격") <= 10000 && (int) map.get("가격") >= 100) {
					} else {
						System.out.println("100원에서 10000원 사이의 값을 입력해주세요.");
					}
					System.out.print("개수 : ");
					int count = scan.nextInt();
					map.put("개수", count);
					if((int) map.get("개수") >= 0 && (int) map.get("개수") <= 100) {
					}else {
						System.out.println("0개에서 100개 사이의 값을 입력해주세요");
					}
					
					list.add(map);
				}
			} else if(menu == 2) {//과일판매
				System.out.println("판매할 과일의 이름 : ");
				String saleName = scan.next();
				int sale = 0; //구매자가 구매할 총 가격
				for(HashMap<String, Object> fruit : list) {
					if(fruit.get("이름").equals(saleName)){
						System.out.print("개수 : ");
						int saleCount = scan.nextInt();
						sale = (int) fruit.get("가격") * saleCount;
						System.out.println(fruit.get("이름") + "를(을) " + saleCount + "개 판매합니다.");
						System.out.println("총 금액은 " + sale + "원 입니다.");
					}else{
						System.out.println("존재하지 않는 과일입니다.");
								
					}
				}
				
			} else if(menu == 3) {//가격슈정
				
				System.out.println("가격을 수정할 과일을 입력해주세요 : ");
				String name = scan.next();
				
				for(HashMap<String, Object> fruit : list) {
					if(fruit.get("이름").equals(name)){
						System.out.println("가격 변경:");
						int changePrice = scan.nextInt();
						fruit.put("가격", changePrice);
						System.err.println("수정되었습니다.");
						System.out.println(fruit.get("이름") + "의 가격은 " + changePrice + "원 으로 변경 되었습니다.");
					}
				}
				
			} else if(menu == 4) {//현황파악
				
				System.out.println("재고를 파악합니다.");
				for(HashMap<String, Object> fruit : list) {
					System.out.println(fruit.get("이름") + "의 가격은 " + fruit.get("가격") +
							"이고, 개수는 " + fruit.get("개수") + "개 입니다.");
					 
					
				}
				
			} else {//그외종료
				System.out.println("종료합니다.");
				break;
			}
			

		}
	}
}
