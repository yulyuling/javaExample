package day11Review001_Extends;

public class Circle extends Shape implements Drawable{
	

	
	Circle(String name, int radius){
		super(name, radius);
	}
		@Override
		public double calculateArea() {
			return radius * Math.PI;
}
		@Override
		public double calculatePerimeter() {
			return 2 * Math.PI *radius;
		}
		@Override
		public void draw() {
			System.out.println("  ***  ");
			System.out.println(" *   *  ");
			System.out.println("*     * ");
			System.out.println(" *   * ");
			System.out.println("  *** ");

		}
}