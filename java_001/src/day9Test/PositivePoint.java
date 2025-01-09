package day9Test;

public class PositivePoint extends Point{
	
	//Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라.
	
	public PositivePoint() {  //point의 기본 생성자를 호출하지 않으면, 명시적으로 좌표를 수정해야한다.
		super(0,0); 		// 만약 부모클래스에 매개변수 없는 기본 생성자가 있었다면, super()를 호출or생략해도 됨.
	}						// 하지만 기본 생성자가 없으므로, 0,0으로 초기화한다.
	
	
											    ///super(0,0)는 맨 위에 있어야 함.
		public PositivePoint(int x, int y){     //만약 이 코드에 super로 초기화를 하려면 맨 윗줄이어야하는데,
		super( x > 0 ? x : 0, y > 0 ? y : 0);   //그러면 계속 0,0이라 0,0만 나옴.
	}										    //삼항연산자사용. 바로 반환
		@Override
		public String toString() {
			return ("("+getX()+","+getY()+")의 점");
	}
		@Override
		protected void move(int x, int y) {     //조건문. 삼항연산자를 쓰면 오류가 남.
			if(x > 0 && y > 0) {				//오버라이딩
		  //if(!(x < 0 || y < 0)) { //둘다 양수일때만 이동
	     //이렇게 쓰이기도 함.
			super.move(x, y);                  //this.x =를 사용할 수 없음.
			
	}
		}	
}
		

