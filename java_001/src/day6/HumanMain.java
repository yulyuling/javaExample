package day6;

public class HumanMain {

	public static void main(String[] args) {
		
		Human hong = new Human("홍길동", 30, "인천");
		//생성자-클래스 이름과 동일한 메소드_객체가 만들어질때 반드시 호출이 된다.
		System.out.println(hong.name);
		
		Human kim = new Human("김철수", 25, "제주도");
		// 김철수,25,제주도
		System.out.println(kim.name);
		
		// 박영희, 35,
		Human park = new Human("박영희", 35);
		System.out.println(park.addr); //"알 수 없음"
		
		hong.study();    //스터디라는 메소드
		hong.eat("사과"); //특정 이름 뒤에 ( )가 붙는 애들은 메소드
		
		
		
	}

}
