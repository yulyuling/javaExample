package day9;

public class IPTV extends ColorTV {
	
		String ip;
		
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
		
	}
	@Override
	void printProperty() {
		
		System.out.print("나의 IPTV는 "+ip+ " 주소의 "); //부모에 있던 printProperty를 내 입맛대로 재정의함.
		super.printProperty();//printProperty : 입력하지 않아도 출력됨.
	}
}
