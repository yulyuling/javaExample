package day9Test001;

public class ColorPoint extends Point {
	 //결과 : RED색의 (10,20)의 점입니다. 
	private String color;
	
		ColorPoint(){ //기본생성자 필요함. 디폴트값--오류뜨는 이유, 부모에 기본생성자가 없어.
			super(0, 0); //xy값을 초기화하려고 0,0??을 보내서 초기화?????????????
			color = "BlACK";
		}					 //디폴트 값을 줌 셋컬러를 쓰지않아도 블랙이 나옴
		ColorPoint(int x, int y){
			super(x, y);
			color = "BLACK"; //디폴트 값을 줌
		}
	
		ColorPoint(int x, int y, String color){
			super(x, y);
			this.color = color;
			
			
	}
		void setXY(int x, int y) {
			move(x, y); //부모의 x,y를 직접 호출 못하니깐 move를 쓴다.
	}
		void setColor(String color) {
			this.color = color; //내꺼라서 this.
	}
		//toString==>문자열을 리턴받았다.
		//▲오브젝트의(최상위)의 메소드임. 이건 오버라이딩해서 써야함.
		//toString은 출력할때 생략이 가능하다 cp.toString()을 안 쓰고 cp만 써도 됨!!
		@Override
		public String toString() {
			
			return (color + "색의 (" + getX() + "," + getY() + ")의 점" );
			
		}

}
