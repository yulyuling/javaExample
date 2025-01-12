package Review2025_01_12;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
				Circle[] c = new Circle[2];
				Rectangle[] r = new Rectangle[2];
				
				// 위의 사용 데이터를 참고하여 각각 초기화
				c[0] = new Circle(1, 2, 3);
				c[1] = new Circle(3, 3, 4);
				
				r[0] = new Rectangle(-1, -2, 5, 2);
				r[1] = new Rectangle(-2, 5, 2, 8);
				
				// 각 도형의 draw 메소드 실행
				for(int i = 0; i < c.length; i++) {
					c[i].draw();
					System.out.println();
				}
				for(int i = 0; i < r.length; i++) {
					r[i].draw();
					System.out.println();
				}
			}

}
