package day7;

public class Human { //1 입력값.
	
	
	
	// intro 라는 메소드 호출 시
	// "ooo의 나이는 oo, 주소는 ooo입니다." 출력
	private String name;
	private int age;
	private String addr;
	int money = 50000;
	static int money_708 = 200000; //static이면 공유함.
	
	
	Human(String name, int age, String addr){ // 프라이빗을 사용하게 해주기 위해서 만들어줌.
		this.name = name;
		this.age = age;
		this.addr = addr;
		
		//게터 세터로 간접적으로 수정하게 만들어줌
		
		
		
	}
	
	void intro() {
		System.out.println(name + "의 나이는 " + age + " 주소는 " + addr + "입니다.");
	}

	public String getName() { // get은 리턴해준다- 출력 // 가져온다

		return name;
	}

	public void setName(String name) { // get은 입력한다
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= this.age) {
			System.out.println("현재 나이보가 큰 값을 입력하세요.");
		}
		this.age = age;
		System.out.println("나이가 " + age + " (이)가 되었습니다.");
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
