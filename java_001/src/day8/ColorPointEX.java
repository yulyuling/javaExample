package day8;

public class ColorPointEX {
		 public static void main(String [] args) {
		 Point p = new Point(); // Point 객체생성
		p.set(1, 2); // Point 클래스의set() 호출
		p.showPoint(); //(1,2)
		
		ColorPoint cp= new ColorPoint();// ColorPoint객체
		cp.set(3, 4); // Point의 set() 호출
		cp.setColor("red"); // ColorPoint의setColor() 호출
		cp.showColorPoint(); // 컬러와좌표출력
		}
		 
}
