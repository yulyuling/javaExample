package day5;

public class HumanMain {

	public static void main(String[] args) {
		
		Human hong = new Human();
		hong.name = "홍길동";
		hong.age = 30;
		hong.addr = "인천";
		hong.height = 170.5;
		hong.isSingle = true;
			
		System.out.println(hong.name);
		
		hong.eat();
		hong.speak("길동이");
		hong.intro2("길동이");
		
//		Human kim = new Human();
//		kim.name = "김철수";
//		
//		System.out.println(kim.name);
//		kim.speak("철수");
//		kim.intro("철수", 25, "제주도");
	}

}
