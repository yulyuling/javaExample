package day7;

public class HumanMain { //여기가 2 출력값

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //프라이빗 상태의 객체에 진입
//					new Math(); //는 객체를 못 만들게 만들어놨음.***static 멤버***
		 Human hong = new Human("홍길동", 30, "인천"); //생성자를 만들어줘야함. 
//		 		hong.name = "홍길동"; //프라이빗이 되면 이렇게는 사용 불가
//		 		hong. age = 30;
		 hong.intro(); //null 출력		//직접적으로 접근하는 것. 권장하지않음
		 hong.setAge(31); // hong.setAge(hong.getAge()+1);
		 		//직접 멤버변수에 접근하게 되면 안정성과 무결성을 보장하기 어렵다.
		 		//만약 hong.age로 접근했다면 이런 검증을 할 수 없다.(나이제한 등)
		 		//getAge()에 로그를 남기거나, 추가 작업 수행이 가능. syso등
		 
		 hong.money = 40000; //non - static **독립적**
		 System.out.println("홍길동 가진 돈 : " + hong.money);
		 hong.money_708 = 195000;
		 
		 
		 
		 Human kim = new Human("김철수", 20, "제주도");
		 int age = kim.getAge();
		 kim.money = 80000; //non - static **독립적**
		 System.out.println("철수 가진 돈 : " + kim.money);
		 System.out.println("철수가 회비 확인 : " + kim.money_708);
		 //static은 클래스명으로도 접근 가능하다.-원랜 클래스명으로 접근불가
		 Human.money_708 = 100000;
		 System.out.println("길동이가 회비 확인 : " + hong.money_708);
	}

}
