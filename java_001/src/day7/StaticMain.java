package day7;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(StaticEx1.num); //static이 아니면 객체를 만들어서 접근해야 하기 때문에 그냥 쓰면 오류생김.
		System.out.println(StaticEx1.PI); //얘는 바로 접근이 가능함. static final double PI로 만들었기때문 (static)
		int num = StaticEx1.staticSum(10,20);
		System.out.println(num);
		
		StaticEx1 ex1 = new StaticEx1();
		ex1.money = 45000; //디폴트로 StaticEx1 money를 만들었을때.
		
		StaticEx1 ex2 = new StaticEx1();
//		ex2.money = 45000;
		System.out.println(ex2.money); //static이 붙지 않은 것들은 공유하지않음/ StaticEx1 은 클래스 명임. 선언한게 아님.
	}

}
