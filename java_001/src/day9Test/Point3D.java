package day9Test;

public class Point3D extends Point{
		

	private int z;
		
		public Point3D(int x, int y, int z) {
			super(x, y);
			this.z = z;
		}
			
		@Override
		public String toString() {
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
			super.move(x, y);
			this.z = z;
		}
	}
		
	
	
