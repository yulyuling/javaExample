package day8;

public class FruitMain { //최종 관리자-캡슐화

		static void fruitBoxing(Fruit f, int num) {
			//하나의 객체마다 메소드를 만들지 않고, 부모클래스로 메소드를 만들어 여러개를 만들지 않아도 되게 한다.
			//자식클래스를 부모클래스로 만든 것.
			//Object로 받을 수는 있으나 접근 자체가 안됨. object에 name이라는 필드가 없기때문에. <최상위 클래스>
			//
			System.out.println(f.name + "를 담았습니다.");
		}
//	static void orangeBoxing(Orange o, int num) {
//		System.out.println(o.name + num + "개 박스에 담았습니다.");
//	}
//	static void appleBoxing(Apple a, int num) {
//		System.out.println(a.name + num + "개 박스에 담았습니다.");
//	}
//	static void bananaBoxing(Banana b, int num) {
//		System.out.println(b.name + num + "개 박스에 담았습니다.");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
//		fruitBoxing(orange, 5);
		orange.print();
		
		Apple apple = new Apple();
		apple.name = "사과";
//		fruitBoxing(apple, 10);
		apple.print();
		
		
		Banana banana = new Banana();
		banana.name = "바나나";
//		fruitBoxing(banana, 8);
		banana.print();   //***오버라이딩***
		
		
	}

}
