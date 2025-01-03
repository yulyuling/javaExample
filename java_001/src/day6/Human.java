package day6;

public class Human { 

		
	
	String name;
	int age;
	String addr;
	
	
	Human (String name, int age, String addr){   //1.생성자=클래스 이름과 동일한 이름을 가진다.-메소드
				//2.초기화를 목적으로 두기때문에, 다른 애들과는 달리 Return이 없다. 자바엔 리턴이 필수, void라도 붙여야됨

		
		this.name = name; //this를 써서 구분한다.
		this.age = age;
		this.addr = addr; //나 자신의 객체-객체 본인 this.
		
	System.out.println("생성자를 호출했습니다.");
	}
	Human(String name, int age) { //생성자는 무조건 맨 앞에 와야함.
		this(name, age, "알 수 없음"); //밑의 조건을 이렇게 간단하게 바꿈.
		//		this.name =name;
		//		this.age =age;
		//		this.addr = "알 수 없음";
		
	}
	
	void study() {
		System.out.println("공부를 합니다.");
	
	}
	String eat(String food) {
		return food + "를(을) 먹습니다.";
	}
	
	}

