package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mangHam {

		static Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		public static int setNumber(String msg, int min, int max) {
			
			while(true) {
				System.out.println(msg + ": ");
				int number = scan.nextInt();
				if( min <= number || number >= max) {
		
					return number;
				}
				System.out.println(min + "~부터" + max + "값을 입력해주세요");
			}
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			ArrayList<HashMap<String, Object>> list = new ArrayList<>();		
//			HashMap<String, Object> map = new HashMap<>();
			
			// 과일가게 
			// 1번 메뉴 과일 추가
			// 2번 메뉴 과일 판매
			// 3번 메뉴 과일 확인
			// 4번 메뉴 종료
			
			while(true) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("[(1) 추가, (2) 판매, (3) 확인, (4) 종료 ]" + " ");
				
			int menu = scan.nextInt();
				
			 if (menu == 1){ //추가(과일명name),가격(price),개수(num),를 입력받아서 map의 list에 저장
				 
				 
				System.out.print("과일 이름 : ");
				String name = scan.next();
				map.put("name", name);
							
//				if(name.equals(user.get("name"))) {
//				user = list.get(i);
				
				boolean updateFlg = false;
				for(int i = 0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(list.get(i).get("name"))) {
						int num = setNumber("개수", 1, 300 - (int) user.get("num"));
						user.put("num", (int) user.get("num") + num);
						updateFlg = true;
						break;
						
//						map.put("num", (int) list.get(i).get("num") + num);
					}
				}
				if(!updateFlg) {
					int price = setNumber("가격", 100, 10000);
					map.put("price", price);
					int num = setNumber("개수", 1, 300);
					map.put("num", num);
									
					list.add(map);
			 }
				
				
			}else if(menu == 2) {//판매 -가 되지 않게 판매/과일명:사과/구매개수:10/10개를 판매하여 30개 남았습니다. //없는과일 입력, 없는 과일입니다. 다시 입력
								//보유갯수보다 많은 갯수를 선택할 경우--현재 사과는 5개 남아있습니다.
	 			System.out.print("과일명 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))) {
						System.out.println("판매 개수: ");
					} else {
						System.out.println("없는 과일입니다.");
						break;
					}
				}
						for(int j=0; j<list.size(); j++) {
							HashMap<String, Object> num2 = list.get(j);
							int sell = scan.nextInt();
						if(sell > 0 ) {
							num2.put("num", (int) num2.get("num") - sell);
							System.out.println(sell + "개를 판매하여 " + num2 + "개 남았습니다.");
						} else {
							System.out.println("현재 사과는 " + num2 + "개 남아있습니다.");
							break;
						}
					}
				
			}else if(menu == 3) {//확인 -잔액
				System.out.println(list);
			}else if(menu == 4) {//종료
				
			}else { 
				//다시 시도
			}
			
			}
			}
		}
	//while(true) {
//		System.out.print(msg + ": ");
//		int number = scan.nextInt();
//		if(min <= number || number >= max) {
//			return number;
//		} 
//		  System.out.println(min + "~" + max + "값을 입력해주세요");
	//}

		
	}

}
