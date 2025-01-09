package day9Test001;

public class PositivePoint001 extends Point{

	public PositivePoint001() {  //point의 기본 생성자를 호출하지 않으면, 명시적으로 좌표를 수정해야한다.
		super(0,0); 		// 만약 부모클래스에 매개변수 없는 기본 생성자가 있었다면, super()를 호출or생략해도 됨.
	}						// 하지만 기본 생성자가 없으므로, 0,0으로 초기화한다.
	
		public PositivePoint001(int x, int y){
		super( x > 0 ? x : 0, y > 0 ? y : 0);	//삼항연산자사용. 바로 반환
		//		super(x, y);
		//		if( x < 0 || y < 0) {
		//			super.move(0, 0);
		}
		
		@Override
		public String toString() {
			return ("("+getX()+","+getY()+")의 점");
		}
		@Override
		protected void move(int x, int y) {
			if(!(x < 0 || y < 0)) { //둘다 양수일때만 이동
			super.move(x, y);
		}
		}
}
