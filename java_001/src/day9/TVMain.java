package day9;

public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
//
//		public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty(); //myTV에서 이걸 갖고 있어야 함. //메소드임

		   
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty(); //오버라이딩.--부모에 있는 걸 자식에서 정의한 것.
	   
	}//나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러

}
