package day9Test001;

public class Point3D extends Point{
	
		private int z;
		
		public Point3D(int x, int y, int z){
			super(x, y);
			this.z = z;
			
		}
		
		@Override
		public String toString() { //toString의 특징은 문자열을 리턴해준다. 
		return ("(" + getX() + "," + getY() + "," + z + ")" + "의 점" );
		}
		
		public void moveUp() {
			z++;
		}
		public void moveDown() {
			z--;
		}
		public void move(int x, int y, int z) { //move가 부모에 있어서 새로 안 만들어도 됨.
			super.move(x, y);					//오버로딩. 메소드호출
			this.z = z;
		}

}
