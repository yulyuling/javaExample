package day8;

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
		
		System.out.println(orange.toString()); //tostring의 특징 우리 입맛에 맞게 객체명으로만 출력가능.
		
		
//		System.out.println(orange); 이렇게 쓰면 주소만 나온다.				 day8.Orange@1f32e575
//		System.out.println(orange.toString()); 이렇게 써도 주소만 나온다.	 day8.Orange@1f32e575	
	
//		 public static void main(String[] args) {
//			 Line line= new Line();
//			 paint(line); 
//			paint(new Shape());   // Line line=new Line을 바로 new Line으로 만든 것
//			paint(new Line()); 
//			paint(new Rect()); 
//			paint(new Circle()); 

}
