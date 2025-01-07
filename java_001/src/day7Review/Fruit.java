package day7Review;

public class Fruit {
	// name, price, num 변수에 오렌지, 1500, 5 를 넣을 것
//	orange.toString(); // 결과 : "오렌지는 개당 1500원 입니다."
	
		private String name;
		private int price;
		private int num;
		
		Fruit(String name, int price, int num){
		this.name = "오렌지";
		this.price = 1500;
		this.num = 5;
		
	}
		Fruit(String name, int price){
			this.name = name;
			this.price = price;
			this.num = 0;
			
			
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
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}

		

}
