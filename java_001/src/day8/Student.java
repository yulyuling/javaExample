package day8;

public class Student extends Person{ //extends Person = 상속==>자식 클래스
	//PersonMain을 만들면 이렇게 Student에서 빨간줄이 뜬다
	
	
	String stuNo; //학번
	int grade; //학년
	
	Student(){
		System.out.println("자식 클래스 생성자 실행!");
		//자식클래스의 생성자는 부모클래스를 호출한다. 디폴트
		//그래서 부모클래스에 생성자가 없으면 빨간줄이 뜸.
		//기본 생성자는 자동으로 만들어지지 않음.
		//기본 생성자가 필요함.
		
		//자식클래스를 호출하면 부모클래스가 있는지 확인하고 부모클래스부터 호출한다. 그 후 부모부터 실행.
		//그 후 자식클래스를 호출하고, 자식이 본인을 실행한다.
	}
	Student(String name, int age, String addr){ //따로 지정하지 않으면 무조건 기본생성자를 호출함. //그걸 해결하려면 Super
		super(name, age, addr);//메소드 호출_부모의생성자 호출[기본]=>super();	//혹은 똑같이 this.로  하나씩 입력해야함. 
		//super 내가 부모클래스의 원하는 메소드를 갖고 오는 것.
	}
	Student(String name, int age, String addr, String stuNo){
		super(name,age,addr); //부모에서 초기화 할 거는 부모한테서 받고 //줄을 바꾸면 오류남. 부모클래스부터 확인하기때문.super는 첫줄
		this.stuNo = stuNo; // 내껀 내꺼에서 다시 쓴다. 
	}
	
	void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
		//자식클래스에 name이라는 변수가 없지만 부모클래스에 있는 name을 쓸 수 있다.
	}
		
}
