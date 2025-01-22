package day17;

import java.util.HashMap;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person hong = new person("홍길동", 30);
//		hong.mbti = ""; //set메소드로 수정한다.
		hong.setMbti("ISFP");
		System.out.println(hong);
		
		Student kim = new Student("김철수", 25, "20201234", 3);
		kim.getGrade();
		kim.getStuNo();
		System.out.println(kim);
		//김철수의 mbti는 000입니다.
				//학번은 20201234, 학년은 3학년 입니다.
		
		System.out.println(kim.study("자바"));
		//자바는 재밌다!
		
		// 리턴은 메소드 하나만 리턴가능. (해쉬맵을 이용하면 간접적으로 메소드 여러개를 리턴받을 수 있음)
		
		HashMap<String, Object> map = kim.getInfo();
		System.out.println(map.get("stuNo"));
		System.out.println(map.get("grade"));
		
		kim.temp();
	}

}
