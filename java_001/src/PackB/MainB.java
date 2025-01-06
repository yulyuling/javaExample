package PackB;

import PackA.ClassA;
//PackA의 클래스를 내가 임포트한다.


public class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassA a = new ClassA();
		a.varPublic = 10;     
		a.varDefault = 10;    //다른 패키지이므로 접근 불가
		a.varProtected = 10;  //다른 패키지이므로 접근 불가
		a.varprivate = 10;    //같은 클래스내에서만 접근 가능하다. - 같은 패키지에서도 불가
		

	}

}
