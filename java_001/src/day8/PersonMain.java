package day8;

public class PersonMain {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 30, "서울"); //가져오려는 곳의 클래스명으로 생성자!!!!!
//		hong.study(); // person이 갖고 있지 않아서 만들 수 없음
		Student kim = new Student("김철수", 25, "인천");
		//▲▲▲이건 Student(자식클래스)의 것을 가져왔기 때문에, 부모클래스와 자식클래스가 가진 메소드를 다 사용할 수 있음.
//		kim.name = "김철수";
		
		kim.eat();  //eat은 person요소지만 상속받음.
		kim.study();
		
		Student park = new Student("박영희", 20, "제주도", "12341234");
		
	}

}
