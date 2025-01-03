package day6;

public class Food {

		private String name;
		private int price;
		//get, set 메소드를 사용해서 프라이빗의 메소드를 만든다
		//우클릭=>소스=>getter and setter
		
		
		
		Food(String name, int price){
			this.name = name;
			this.price = price;
			
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		void sell() {
			System.out.println(price + "원에 판매했습니다.");
		}
		/*void setPrice(int price) {
			if(price < 0) {
				System.out.println("가격을 다시 확인해주세요.");
				return; //리턴에 아무것도 넣지 않으면 메소드를 그냥 빠져나감.
				}
			System.out.println("정말 " + price + "가 맞습니까?");
			
			this.price = price;
			//프라이빗에서 메소드로 운영하면, 잘못 입력했을떄 제어가 가능하다.
		}
		int getPrice() {
			return price; //가격을 출력하고시픈데 안될때
*/			
//		}
		
}
