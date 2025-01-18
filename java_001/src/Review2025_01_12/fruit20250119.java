package Review2025_01_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fruit20250119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		
		int myMoney = 0; //내 돈
		
		while(true) {
			System.out.print("1추가, 2확인, 3수정, 4판매, 5종료  ");
			String input = scan.next();
			
			
			if(!input.matches("\\d+")) { //아닌거니깐 ! 해줘야함 까먹었음 ㅎ
				
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue; 
			}
			int menu = Integer.parseInt(input);
			
			if(menu == 1) { //추가
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("이름", name);
				
				boolean flg = false; 
				
				for(HashMap<String, Object> fruit :list) {
					if(fruit.get("이름").equals(name)) {
						System.out.println("중복된 이름입니다.");
						System.out.println("추가 항목 수정을 원하시면 0번을 입력해주세요.");
						System.out.println("초기 화면으로 넘어가시려면 9번을 입력해주세요.");
					
						int action = scan.nextInt();
						
						if(action == 0) { //가격 추가
					
							 System.out.println("가격 증감: ");
							 int price = scan.nextInt();
							 System.out.println("개수 추가: ");
							 int num = scan.nextInt();
							 
							 int currentPrice = (int) fruit.get("가격");
							 int currentNum = (int) fruit.get("개수");
							fruit.put("가격", currentPrice + price);
							fruit.put("개수", currentNum + num);
							 System.out.println("추가 사항이 저장되었습니다.");
							 System.out.println("현재 상태 : " + fruit);
							 
						} else if(action == 9){
							System.out.println("다음 항목으로 넘어갑니다.");
						}
											
						flg = true;
						break;
					}
				}
				if(!flg) {
					System.out.print("가격: ");
					int price = scan.nextInt();
					map.put("가격", price);
					System.out.print("개수: ");
					int num = scan.nextInt();
					map.put("개수", num);
					
					list.add(map);
					System.out.println("추가되었습니다.");
				}
				
			} else if (menu == 2) { //확인
				System.out.print("확인할 과일 입력: ");
				String name = scan.next();
				
				for(HashMap<String, Object> fruit :list) {
					if(fruit.get("이름").equals(name)){
						System.out.println(fruit.get("이름") + "의 가격은 " + fruit.get("가격") + "이고,"
								+ " 남은 개수는 " + fruit.get("개수") + "개 입니다.");
						
					} else {
						System.out.println("존재하지 않는 과일 입니다.");
					}
					
				}
								
			} else if (menu == 3) { //수정
				System.out.print("수정할 과일 입력: ");
				String name = scan.next();
				
				boolean flag = false;
				
				for(HashMap<String, Object> fruit :list) {
					if(fruit.get("이름").equals(name)){
						
						flag = true;
						
						System.out.print("이름 변경 : ");
						String changeName = scan.next();
						System.out.print("가격 변경 : ");
						String changePrice = scan.next();
						System.out.print("개수 변경 : ");
						String changeNum = scan.next();
						
						fruit.put("이름", changeName);
						fruit.put("가격", changePrice);
						fruit.put("개수", changeNum);
						
						System.out.println("수정 사항이 저장되었습니다.");
						System.out.println(fruit.get("이름") + "의 가격은 " + fruit.get("가격") + "이고,"
								+ " 남은 개수는 " + fruit.get("개수") + "개 입니다.");
						
					}
				}
				if(!flag) {
					System.out.println("존재하지 않는 과일입니다.");
				}
				
			} else if (menu == 4) { //판매
				System.out.print("판매할 과일 입력: ");
				String name = scan.next();
				int moneyReceived = 0; //받은 금액
				int change = 0;
				boolean found = false;
				
				for(HashMap<String, Object> fruit :list) {
					if(fruit.get("이름").equals(name)){
						found = true;
						
						System.out.print("판매할 개수 입력: ");
						int salePrice = scan.nextInt();		//판매개수
						
						//값이 string인지 확인하고 반환
						
						int stockQuantity = fruit.get("개수")instanceof String
								? Integer.parseInt(fruit.get("개수").toString())
								: (int) fruit.get("개수");
						
						if(salePrice <= stockQuantity) { //가격도 강제 int화 대신 예외규칙 확인 후 반환
							int pricePerUnit = fruit.get("가격") instanceof String
									? Integer.parseInt(fruit.get("가격").toString())
									: (int) fruit.get("가격");
							
							int amount = pricePerUnit * salePrice; //판매금액 계산
							
							System.out.print("받은 금액 입력: ");
							moneyReceived = scan.nextInt(); //받은금액
							
						 if(moneyReceived >= amount) { //받은 금액이 구매하기에 충분한 경우
							 change = moneyReceived - amount; //거스름돈 계산
							 myMoney += amount;				// 총 판매 금액 누적
							 
							 //재고 감소
							 fruit.put("개수", (int) fruit.get("개수") - salePrice);
							 
							 System.out.println(fruit.get("이름") + "을 " + salePrice + "개 판매합니다.");
							 System.out.println("받은 금액은 " + moneyReceived + "원이고, 판매 금액은 " + amount +
									 "원입니다. 거스름 돈은 " + change +"원입니다.");
							 System.out.println("현재까지 총 판매 금액은 : " + myMoney + "원입니다.");	
							 
						 	} else {
						 		System.out.println("돈이 부족하십니다롱");
						 	}
						} else {
								System.out.println("재고가 부족합니다롱");
						}
						break;
					}	
						
				}
				if(!found) {
					System.out.println("존재하지 않는 과일입니다.");
				}
						
			} else if (menu == 5) { //종료
				System.out.println("이용해주셔서 감사합니다.");
				break;
				
			} else {
				System.out.println("잘못 입력된 값입니다. 다시 입력해주세요.");
			}
			
		}
		

	}

}
