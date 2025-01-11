package day11Review001_Extends;

public class Rectangle extends Shape implements Drawable{


	
	Rectangle(String name, int width, int height){
		super(name, width, height);		
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	@Override
	public double calculatePerimeter() {
		return (width+height)*2;
	}
	@Override
	public void draw() {
		
		for(int i = 0; i < (int) height; i++) {
			for(int j = 0; j < (int) width; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
}
}

