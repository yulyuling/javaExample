package day9Test;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		   cp.setXY(10, 20);
		   cp.setColor("RED");
		   String str = cp.toString();
		   System.out.println(str+"입니다. ");
		   
		   
		   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		   System.out.println(zeroPoint.toString() + "입니다.");
		   
		   
		   ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		   cp.setXY(5,5);
		   cp.setColor("RED");
		   System.out.println(cp.toString()+"입니다.");
		   
		   
		   
		   Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		   System.out.println(p.toString()+"입니다.");
		   //(1,2,3) 의 점입니다.
		   
		   p.moveUp(); // z 축으로 위쪽 이동
		   System.out.println(p.toString()+"입니다.");
		   //(1,2,4) 의 점입니다.
		   
		   p.moveDown(); // z 축으로 아래쪽 이동
		   p.move(10, 10); // x, y 축으로 이동
		   System.out.println(p.toString()+"입니다.");
		   
		   p.move(100, 200, 300); // x, y, z축으로 이동
		   System.out.println(p.toString()+"입니다.");
	}
	
}
