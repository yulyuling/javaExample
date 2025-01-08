package day9;

public class UsingOverride {
	public static void main(String [] args) {
		
		 Shape start, last, obj;
		 // 링크드리스트로도형생성하여연결
		start = new Line(); // Line 객체연결
		last = start;       //***시작점을 만든다*** 최초로 만들어진 애는 시작이자 끝이기 때문
							// Line이 Start + Last.
		
		 obj= new Rect();
		 last.next= obj; // Rect객체연결
		 last = obj;	 //***Line 뒤에 Rect의 주소를 담았따.*** Obj에 Rect에 담김.
		 				 //obj:last니까, 비어있는 obj에 다음 주소를 넣는다.
		
		 obj= new Line(); // Line 객체연결
		 last.next= obj;  // **다음 주소인 line 넣는다.**
		 last = obj;      // 다시 빈 obj에 Circle을 넣는다.
		 
		 obj= new Circle(); // Circle 객체연결
		 last.next= obj;
		 // 모든도형출력
		 
		 Shape p = start;  //start = line.
		 	while(p != null) { //draw 메소드 호출해라.
		 						
			 p.draw();			//draw 메소드 호출해라.
			 p = p.next;		//p가 null이 아닐떄까지 돌려라.
	 }
 }

}
