package PackA;

public class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA a = new ClassA();
		a.varPublic = 10;     
		a.varDefault = 10;    //같은 패키지이므로 접근 가능
		a.varProtected = 10;  //같은 패키지이므로 접근 가능
		a.varprivate = 10;    //같은 클래스내에서만 접근 가능하다. - 같은 패키지에서도 불가
		

	}

}
