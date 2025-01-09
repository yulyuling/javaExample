package day9Test001;

public class PositivePoint extends Point{
	
	public PositivePoint(){
		super(0,0);
	}
	PositivePoint(int x, int y){
		super(x > 0 ? x : 0, y > 0 ? y :0);
	}
	@Override
	public String toString() {
		return ("("+getX()+","+getY()+")의 점");
	}`
	@Override
	protected void move(int x, int y) {
		if(x > 0 && y > 0) {
			super.move(x, y);
			//if(!(x < 0 || y < 0)) { //둘다 양수일때만 이동
		     //이렇게 쓰이기도 함.
			
		}
	}

}
