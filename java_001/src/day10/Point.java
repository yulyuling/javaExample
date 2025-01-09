package day10;

public class Point {
	
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a == b) // false
		System.out.println("a==b");
		
		if(a.equals(b)) // true
		System.out.println("a is equal to b"); //a가 본인 메소드 호출하면서 b를 보냄.
		//equals = Object; 최상위 포식자
		
		if(a.equals(c)) // false
		System.out.println("a is equal to c");

	
		private int x, y;
		public Point(int x, int y) {
		this.x = x; this.y = y;
		}
		public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
		return true;
		else return false;
		
		}

}
