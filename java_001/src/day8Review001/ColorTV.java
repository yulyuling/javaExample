package day8Review001;

public class ColorTV extends TV{ //자식클래스

	public static void main(String[] args) {
		
		//다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
		//결과 : 32인치 1024컬러
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

		private int color;
		ColorTV(int size, int color){
			super(size);
			this.color = color;
			System.out.println(size + "인치" + color + "컬러");		
	

	}   
		
}
