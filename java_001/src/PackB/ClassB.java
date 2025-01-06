package PackB;

import PackA.ClassA;

public class ClassB extends ClassA{ // A는 부모, B는 자식클래스
	//선언 없이 바로 접근함.
	//자식 클래스인 B는 매개변수에 다 접근이 가능함 Public, Protected는 접근 가능.
	void test() {
		
		varPublic = 10;     
		varDefault = 10;    //다른 패키지이므로 접근 불가
		varProtected = 10;  //다른 패키지이지만, 자식클래스이기 때문에 접근이 가능하다.
		varprivate = 10;    //같은 클래스내에서만 접근 가능하다. - 같은 패키지에서도 불가
		
	}

}
