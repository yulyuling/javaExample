package day9Test001;

public class PointMain {

	public static void main(String[] args) {
		
		//Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
		//다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
		
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		 cp.setXY(10, 20); //리턴이 없어 보임. void
		 cp.setColor("RED");
		 String str = cp.toString(); //문자열로 리턴받음. "입니다"제외한 리턴
		 System.out.println(str+"입니다. ");
		    //결과 : RED색의 (10,20)의 점입니다. 
			  
			   
		 ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		 System.out.println(zeroPoint.toString() + "입니다.");
		 	// (0,0) 위치의 BLACK 색 점
		   
		 ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		 cp.setXY(5,5);
		 cp.setColor("RED");
		 System.out.println(cp.toString()+"입니다.");
		 	// BLACK색의 (5,5)의 점입니다. 
		 
		 
		}
		
	}

