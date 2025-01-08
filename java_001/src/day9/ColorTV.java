package day9;

public class ColorTV extends TV {

		private int color;
		ColorTV(int size, int color){ //이렇게만 하면 오류가 생김. tv에기본생성자가 없어서 super로 직접불러와야함
			super(size); 
			this.color = color;
			
		}
		void printProperty() {
			//리턴이 없으니 그냥 void로 처리.
			System.out.println(getSize() + "인치" + color + "컬러");
		}
	}

