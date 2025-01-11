package day11Review001_Extends;

public class ShapeMain {

	public static void main(String[] args) {
		        // 1. Shape 배열 생성
		        // Shape 타입의 배열을 만들어 Rectangle과 Circle 객체를 저장합니다.
		        // Rectangle과 Circle은 Shape를 상속받고, Drawable 인터페이스도 구현합니다.
		    	
		        Shape[] shapes = {
		            new Rectangle("Rectangle", 5, 10), // Rectangle 객체 생성 (가로: 5, 세로: 10)
		            new Circle("Circle", 5)           // Circle 객체 생성 (반지름: 5)
		        };

		        // 2. 반복문을 통해 배열의 각 객체를 처리
		        // Shape 배열의 각 요소에 대해 displayInfo()와 draw() 메서드를 호출합니다.
		        for (Shape shape : shapes) {
		            // 도형의 정보 출력
		            shape.displayInfo(); // 도형 이름, 넓이, 둘레를 출력

//		             도형 그리기
		            System.out.println("그림:"); 
		            ((Drawable) shape).draw(); // Drawable로 캐스팅 후 draw() 호출하여 도형의 ASCII 아트를 출력

		            System.out.println(); // 각 도형 사이에 빈 줄 추가
		        }
		    }
	}

//도형 이름: Rectangle
//넓이: 50.0
//둘레: 30.0
//그림:
//*****
//*****
//*****
//*****
//*****
//
//도형 이름: Circle
//넓이: 78.54
//둘레: 31.42
//그림:
//  ***
// *   *
//*     *
// *   *
//  ***