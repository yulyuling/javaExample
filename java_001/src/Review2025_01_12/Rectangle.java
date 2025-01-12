package Review2025_01_12;

public class Rectangle extends Point{

//	int area;
//	int circumference;
	int width;
	int height;
	Rectangle(int x, int y, int width, int height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println("x: " + x + ", y: " + y + ", 면적 :  " + width*height + ", 둘레 :" + 2*(width+height));
	}
	
}
