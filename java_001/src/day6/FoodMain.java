package day6;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food beer = new Food("맥주", 3000);
		beer.setPrice(3500); //메소드를 통해 간접적으로 수정 가능 /직접 진입 못함.
		
		System.out.println(beer.getPrice());
	}

}
