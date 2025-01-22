package day17;

import java.util.HashMap;

public class Student extends person{

	private String stuNo;
	private int grade;
	
	Student(String name, int age, String stuNo, int grade) {
		super(name, age);
		this.stuNo = stuNo;
		this.grade = grade;
		
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = super.toString() + "\n" + "학번은 " + stuNo + "이고, 학년은 " + grade + "학년 입니다.";
		return str;
	}

	public String study(String java) {
		// TODO Auto-generated method stub
		return java + "는 재밌다!";
		
	} 
	
	//해쉬맵도 클래스라 리턴타입이 가능하다
	HashMap<String, Object> getInfo(){
		HashMap<String, Object> map = new HashMap<>();
		map.put("stuNo", stuNo);
		map.put("grade", grade);
		return map;
		
	}
	void temp() {
		for(int i=0; i<100; i++) {
			if(i > 50) {
				return; //리턴을 만나는 시점에 메소드를 빠져나가는 역할.
						//브레이크는 반복문을 빠져나감.
			}
			System.out.println(1);
		}
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		
	}
	

		

}
