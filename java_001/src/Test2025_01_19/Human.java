package Test2025_01_19;

public class Human {

	String name;
	int age;
	
	public Human(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public boolean setPhone(String phone) {
		// TODO Auto-generated method stub
		if(phone.length() == 11) {			
		} else {
			System.out.println("핸드폰 번호는 11글자로 입력해주세요. ( - 제외 )");
			System.out.println("ex) 01012341234");
		}
		return false;
	}
	@Override
	public String toString() {
		return name + "의 나이는 " + age + "입니다.";
	}

}
