package day17;

public class person {
	
	private String name;
	private int age;
	String mbti;
	
	//객체 생성시 객체 초기화=생성자
	
	person(String name, int age){ //생성자
		this.name = name;
		this.age = age;
		
	}
	
	public String getMbti() { //되돌려준다.
		return mbti;
	}

	public void setMbti(String mbti) { //값을 입력하게 해준댜
		this.mbti = mbti;
	}

	// 파라미터로 값을 받아서(음식명을) 출력한다.
	void eat(String food){
		System.out.println(food + "를 먹는다");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"의 mbti는 " + mbti; //to.string 메소드로 메세지를 출력한다
	}

				
}
