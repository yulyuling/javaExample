package day3;

public class Loop003_DoWhile {

	public static void main(String[] args) {
		
		
		for(int i=100; i<=10; i++) {
			System.out.println("for 실행!"); //실행 안됨,조건만족안함
		}
		int i=100;
		while(i<=10) {
			System.out.println("while 실행!");//실행 안됨,조건만족안함
		}
		do { //조건에 상관없이 꼭 한번 실행되는 반복문
			System.out.println("do while 실행!");
		}while (i<=10);
	}

}
