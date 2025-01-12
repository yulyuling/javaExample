package Review2025_01_12;

public class Circle extends Point{
	
	int radius;
	
	Circle(int x, int y, int radius){
		super(x,y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println
	("x: " + x + ", y: " + y + ", radius : " + radius + ", 면적 : " + radius*radius*Math.PI + ", 둘레 : " + 2*Math.PI*radius);
	}

}
