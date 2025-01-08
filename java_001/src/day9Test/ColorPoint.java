package day9Test;

public class ColorPoint extends Point{
	
	
	private String color;
		
	
		ColorPoint(){
			super(0,0);
			color = "BLACK";
		}
		ColorPoint(int x, int y){
			super(x, y);
			color = "BLACK";
		}
		
		ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
		public void setXY(int x, int y) {
			move(x,y);
			
	}
		void setColor(String color) {
			this.color = color;
				
			
		} @Override
		public String toString() {
			// TODO Auto-generated method stub
			return (color + "색의 " + getX() +"," + getY()+"의 점");
		}
		
		
		

		}
		

