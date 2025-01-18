package day16Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		
		while(true) {			
			System.out.print("1추가, 2확인, 3수정, 4판매, 5종료");
			String input = scan.next();
			
			if(input.matches("\\d+")) {
				System.out.println("숫자만 입력해주세요: ");
				continue;
			
			}
			int menu = Integer.parseInt(input);	
			
			if(menu == 1) { //추가
				
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 입력: ");  //이름 입력하라는 문구 출력
				String name = scan.next();		//스캔으로 이름을 입력받아
				map.put("이름", name);			//받은 이름을 해시맵에 저장
			
				boolean flg = false;//예외규칙 -- 동일 이름이 있을때 걸러내기 위해서 **중복이 없다고 가정**
			
				for(HashMap<String, Object> fruit : list) {	//리스트 안의 해시맵의 키와값을 순회한다.
					if(fruit.get("이름").equals(name)){		//순회하면서 입력받은 이름과 저장된 이름이 같은지 비교
						System.out.println("중복된 이름이 있습니다.");//같은 이름이 있으면 if를 통과, 중복이름출력
						flg = true;								// **중복이 발견되었으므로 상태를 변경**
						break;									
						
					}
				}
				if(!flg) {										// **중복이 없으면 flg는 여전히 없는 상태**
					System.out.print("가격: ");					//나머지 가격과 갯수를 입력받아서 리스트에 저장
					int price = Integer.parseInt(scan.next());
					map.put("가격", price);
					System.out.print("갯수: ");
					int num = Integer.parseInt(scan.next());
					map.put("갯수", num);
					
					list.add(map);
					System.out.println("추가되었습니다.");
				}		
				
			} else if(menu == 2) {//확인					
				System.out.print("검색할 과일 입력: ");			//검색할 과일 입력문구 출력
				String name2 = scan.next();					//이름을 스캔으로 입력받음
				
				boolean found = false;
				
				for(HashMap<String, Object> fruit : list) {	//리스트 내의 해시맵을 순회하며 돌게 만듬.
					if(fruit.get("이름").equals(name2)){		//돌면서 저장된이름과 받은 이름 비교 검사
						System.out.println("해당 과일의 이름은 "+fruit.get("이름")+"이고, 가격은 "
								+fruit.get("가격") + ", 남은 갯수는 "+fruit.get("갯수")+"개 입니다.");
								//해당이름이 있따면 위의 문구 출력
						found = true;
						break;
						
					}
				}
				if(!found) {
					System.out.println("해당 과일이 없습니다.");
				}
				
			} else if(menu == 3) {//수정
				System.out.print("검색할 과일 입력: ");		//검색할 과일 입력문구 출력
				String name = scan.next();				//검색할 과일 이름 입력받음
				
				boolean found = false;					// **false는 작업이 시작되지않거나, 실패했음을 뜻함**
				
				for(HashMap<String, Object> fruit :list) {	//리스트 내의 해시맵을 순회하며 돌게 만듬
					if(fruit.get("이름").equals(name)){		//돌면서 저장된 이름과 받은 이름 비교 검사
						
						found = true;					// **중복이 발견됐으니 작업성공. 다시 검사하기 위해 바꿈**
						
						System.out.print("바꿀 이름을 입력: ");  //바꿀 이름 입력받음.
						String ChangeName = scan.next();
						System.out.print("바꿀 가격을 입력: ");
						int ChangePrice = Integer.parseInt(scan.next());
						System.out.print("바꿀 갯수를 입력: ");
						int ChangeNum = Integer.parseInt(scan.next());
						
						fruit.put("이름", ChangeName);	//입력받은 이름을 프룻(list)에 다시 저장
						fruit.put("가격", ChangePrice);
						fruit.put("갯수", ChangeNum);
						
						System.out.println("수정되었습니다."); //수정문구 출력
						System.out.println("해당 과일의 이름은 "+fruit.get("이름")+"이고, 가격은 "
								+fruit.get("가격") + ", 남은 갯수는 "+fruit.get("갯수")+"개 입니다.");
						break; //끝났으니 브레이크
					}
					
				}
				if(!found) { //
					System.out.println("해당 과일이 없습니다.");
				}
			}				
			else if (menu == 4) { //판매
				System.out.print("판매할 과일을 입력: ");
				String saleName = scan.next();
				
				boolean found = false;
				
				for(HashMap<String, Object> fruit :list) {
					if(fruit.get("이름").equals(saleName)) {
						System.out.print("판매할 갯수: ");
						int saleNum = Integer.parseInt(scan.next());
						if( 0 < saleNum && saleNum <= (int) fruit.get("갯수")) {
							int salePrice = saleNum * (int) fruit.get("가격");
							fruit.put("갯수", (int) fruit.get("갯수") - saleNum);
			
							System.out.print("받은 금액 입력: ");
							int received = Integer.parseInt(scan.next());
							if( received >= salePrice ) {
								int remainder = received - salePrice;
								System.out.println(saleName + "를(을) " + saleNum + "개를 판매합니다. "
										+ "받은 금액: " + received + ", 거스름돈: " + remainder);							
								} else {
									System.out.println("금액이 부족합니다. 판매를 취소합니다.");
								}
							} else {
								System.out.println("갯수를 확인해주세요. 판매가 취소됩니다.");						
							}
							found = true;
							break;
					}
				}
				if(!found) {
					System.out.println("해당 과일이 없습니다.");
				}
			
			}else if(menu == 5) {
				System.out.println("종료합니다.");
				
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}

//if(!input.matches("\\d+")) {
//System.out.println("숫자만 입력해주세요. 다시 입력해주세요.");
//continue;
//}
//
//int menu = Integer.parseInt(input);
