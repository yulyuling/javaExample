package day8;

public class Orange extends Fruit{
	
	
	@Override //오버라이딩 된 메소드라는 뜻.
	void print() {
		// TODO Auto-generated method stub
		System.out.println("오렌지는 달다");
//		super.print(); //부모에 있는 메소드를 아예 못 쓰는 것이 아니다.
		
	}
		
	@Override //object 오버라이딩함.
	public String toString() {
		// TODO Auto-generated method stub
		return "과일명 : " + name + "색 : " + color + " , 가격 : " + price;
		
	}
}
