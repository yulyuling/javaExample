package day15Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {

		// 과일가게^^
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

//		int money = 10000;
//		int myMoney = 0;
		while (true) {
			System.out.println("[(1)추가 (2)판매 (3)확인 (4)종료");
			HashMap<String, Object> map = new HashMap<>();
			int menu = scan.nextInt();

			if (menu == 1) {

				System.out.println("과일이름 : ");
				String name = scan.next();
				map.put("name", name);

				boolean flg = false;
				for (HashMap<String, Object> fruit : list) { // 매대에 손님이 말한 물건 있나 봐봐
					if (fruit.get("name").equals(name)) { // 같은 물건 있는지 찾아

						flg = true;
						System.out.println("중복된 이름이 있습니다.");
						break;
					}
				}
				if (!flg) {
					System.out.print("가격 : ");
					int price = scan.nextInt();
					map.put("price", price);
					System.out.print("갯수 : ");
					int num = scan.nextInt();
					map.put("num", num);

					list.add(map);
				}
			}
			if (menu == 2) {// 판매

				// 판매 -가 되지 않게 판매
				// 과일명:사과/구매개수:10/10개를 판매하여 30개 남았습니다.
				// 없는과일 입력, 없는 과일입니다. 다시 입력
				// 보유갯수보다 많은 갯수를 선택할 경우--현재 사과는 5개 남아있습니다.

				System.out.println("판매할 과일의 이름은 : ");
				String fruitName = scan.next();

				System.out.println("판매할 갯수는 : ");
				int sell = scan.nextInt();

				boolean toName2 = false;
				for (HashMap<String, Object> fruit : list) {
					if (fruit.get("name").equals(fruitName)) {
						int amount = (int) fruit.get("num") - sell;// 팔아 이제
						if (amount >= 0) { // 재고 확인
//							int total = (int) fruit.get("price") * sell;
//							if (total <= money) {
//								money = money - total;// 돈....내놔
//								myMoney = myMoney + total;
								fruit.put("num", amount);
								System.out.println(fruit.get("name") + "의 갯수는 " + fruit.get("num") + "개 남았습니다.");
//								System.out.println("상인은 " + myMoney + "원 갖고 있고, 손님은 " + money + "원 있습니다.");
//							} else {
//								System.out.println("돈 갖고 와");
//							}
						} else {
							System.out.println("재고가 없습니다.");
						}
						toName2 = true;
						break;
					}
				}
				if (!toName2) {
					System.out.println("없는 과일입니다.");
				}
			}
			if (menu == 3) {// 확인

				// 3번 입력하면 과일이름,가격,남은 갯수가 나온다!
				for (HashMap<String, Object> fruit : list) {
					String name = (String) fruit.get("name");
					int price = (int) fruit.get("price");
					int num = (int) fruit.get("num");
					System.out.println(name + "의 가격은 " + price + "고, 남은 갯수는 " + num + "입니다.");
				}
			}
		}
	}

}
