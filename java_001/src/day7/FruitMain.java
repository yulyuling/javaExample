package day7;

public class FruitMain {
	
		private String name;
		private int price;
		private int num;
		
			FruitMain(String name, int price, int num){
			this.name = name;
			this.price = price;
			this.num = num;
			}
			
			FruitMain(String name, int price){
				this(name, price, 0);
				//this.name=name;
				//this.price=price;
				//this.num=0;
			}
//			void toString() {
				
//			}
		
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
