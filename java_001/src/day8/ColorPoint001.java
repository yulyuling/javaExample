package day8;

public class ColorPoint001 { //부모클래스
	
	class Point {
		 private int x, y; // 한 점을 구성하는 x, y 좌표
		public Point() { //생성자
		 this.x = this.y = 0; // 0으로 x와 y를 초기화함
		 }

		public Point(int x, int y) { // 생성자2
		 this.x = x; this.y = y;  //x와 y를 x,y로 정의함
		 }
		 public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
		 }
		 }
	/*
	 * 자식 클래스
	 */
		 class ColorPoint extends Point {  // point를 상속받은 자식 클래스.
		private String color; // 점의 색  --자식클래스에서 새로 추가된 필드   
		public ColorPoint(int x, int y, String color) {  //자식클래스 생성자 생성!
		 super(x, y); // Point의 생성자 Point(x, y) 호출     //부모클래스의 생성자 일부를 불러냄. super(,)로
		 /*
		  * super(x, y):
		  * 
		  * 부모 클래스의 생성자(Point(int x, int y))를 호출하여 x와 y 좌표를 초기화합니다. 자식 클래스 생성자에서 super를
		  * 통해 부모 클래스의 생성자를 호출하지 않으면, 기본 생성자(매개변수 없는 생성자)가 자동 호출됩니다. 만약 부모 클래스에 기본 생성자가
		  * 없으면 컴파일 오류가 발생합니다.
		  */
		this.color = color;		//자식클래스의 color 필드 초기화		//color를 get시킴.
		 }
		 public void showColorPoint() { // 컬러 점의 좌표 출력	//자식클래스에서 새로 추가된 메소드.
		System.out.print(color);
		
		/*System.out.print(color)로 색상을 출력한 뒤,
		부모 클래스의 showPoint()를 호출하여 (x, y) 좌표를 출력합니다.*/
		
		 showPoint(); // Point 클래스의 showPoint() 호출 //
		}
		 }
		 /*
		  * 캡슐화 클래스 **프로그램 실행의 진입점**
		  */
		 public class SuperEx {							//캡슐화 된 새로운 클래스.
			 public static void main(String[] args) {   //메인 달고 출고
			 ColorPoint cp = new ColorPoint(5, 6, "blue"); //생성자 생성! cp=라는 생성자,ColorPoint(자식)에서 메소드 불러옴.
			 cp.showColorPoint();							//자식클래스에 있던 showColorPoint를 불러옴
			 }
				/*
				 * ColorPoint 객체를 생성합니다. 생성자는 x=5, y=6, color="blue"를 초기값으로 받아 객체를 초기화합니다.
				 */
			 
				/*
				 * cp.showColorPoint();:
				 * 
				 * 생성한 객체의 showColorPoint() 메서드를 호출합니다.
				 * 이 메서드는 다음 순서로 실행됩니다: 
				 * color 필드 출력 (System.out.print(color)): "blue" 출력.
				 * 부모 클래스의 showPoint() 호출: "(5, 6)" 출력.
				 */
			 }

}
