package day8;

public class ColorPoint extends Point {
		private String color; //점의 색
		
		public void setColor(String color) {
			this.color = color;
			
		}
		public void showColorPoint() {
			System.out.println(color);
			showPoint(); //point 클래스의 showpoint를 호출
			
		}

}
