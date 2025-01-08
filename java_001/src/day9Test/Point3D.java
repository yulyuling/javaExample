package day9Test;

public class Point3D extends Point{
		
//		private move() {
//			super(x,y);
//			this.z=z;
//		}
	
		private int z;
		Point3D(int x, int y, int z){
			
		super(x,y);
		this.z = z;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return ("(" + getX() + "," + getY() + "," + z + ")" + "의 점" );
		// 1,2,3은 각각 x, y, z축의 값.
		}
		public void moveUp() {
			z++;
		}
		
		public void moveDown() {
			z--;
		}
		
		public void move(int x, int y, int z) {
			super(x, y);
			this.z;
			
		}
	}
		
	
	
