package day8;

public class Point {
	private int x;
	private int y; //한 점을 구성하는 x, y좌표
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // (10,20)
		System.out.println("("+ x + "," + y + ")");
	}

}
