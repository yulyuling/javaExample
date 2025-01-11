package day11Review001_Extends;

public abstract class Shape {
	
	String name;
	int width;
	int height;
	double radius;
	String a = "height";
	
	Shape(String name, int width, int height){
		this.name = name;
		this.width = width;
		this.height = height;		
	}
	Shape(String name, int radius){
		this.name = name;
		this.radius = radius;		
	}
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	public void displayInfo() {
		System.out.println("도형의 이름: " + this.name);
		System.out.println("넓이: " + calculateArea());
		System.out.println("둘레: " + calculatePerimeter());
	}
	}
	
	
	

