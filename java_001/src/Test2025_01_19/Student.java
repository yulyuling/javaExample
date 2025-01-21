package Test2025_01_19;

import java.util.ArrayList;

public class Student extends Human{
	
	ArrayList<String> subjectList = new ArrayList<>();
	
	String stuNo;
	
	
	public Student(String name, int age, String stuNo) {
		super(name, age);
		this.stuNo = stuNo;
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> subjectList() {
		// TODO Auto-generated method stub
		subjectList.add("자바");
		subjectList.add("오라클");
		subjectList.add("HTML");
		
		return  subjectList;
	}
	@Override
	public String toString() {
		return super.name + "의 나이는 " + super.age + "입니다.";
	}

}
