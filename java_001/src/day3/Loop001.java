package day3;

public class Loop001 {

	public static void main(String[] args) {
		
/*		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue; // 건너 뜀
			}
			System.out.println(i);*/
			
		
		for(int i=2; i<=9; i++) {
			if(i % 2 == 0) {
				continue; //if 조건을 제외하고 다시 증감식으로 건너뜀.
			}
			for(int j=1; j<=9; j++) {
				//if(i % 2 == 1) { 가 밑에 있을때 문제가 생길 수 있음.
				//i가 짝수일때도 계속 실행함. 위에 있을땐 짝수를 걸러냄.
					System.out.print(i + "x" + j + "=" + i*j);
					System.out.print("\t");
			}
			System.out.println();
	}
}
}
