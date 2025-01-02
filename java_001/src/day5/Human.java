package day5;

public class Human {


		String name;
		int age;
		String Speak;
		String eat;
		String addr;
		boolean isSingle;
		double height;
		
		void speak(String name) { //매개변수 String (qqq) 명칭을 명확히 하자
			System.out.println(name + "가 말한다.");
		}
		
		void eat() {
		System.out.println("맛있는걸 먹는다.");
		}
		
		void intro(String name, int age, String addr) {
			//이름,나이,주소
			//ooo의 나이는 00, 주소는 000입니다.
			System.out.println(
					name + "의 나이는 " + age + ", 주소는 "+ addr +"입니다."
			);
		} //여기까지 오버로딩의 개념
		void intro2(String name) { //매개변수 name
			System.out.println(
					name + "의 나이는 " + age + ", 주소는 "+ addr +"입니다."
			);
			System.out.println(name + "의 본명은 " + this.name); //내가 선언한 객체의 name이 된다_나 자신 ( this. )
		} 
	}

