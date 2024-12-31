package day3;

public class Gugudan {

	public static void main(String[] args) {

//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
////				System.out.print(\t);
//			}
//		}System.out.println();{
			
		
		//구구단 역순
/*		for(int i=9; i>=2; i--) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "x" + j + "=" + i*j);
				System.out.print("\t");
			}System.out.println();
			*/
		
/*		//구구단 홀수
			for(int i=2; i<=9; i++) {
				if(i % 2 == 1) {
				for(int j=1; j<=9; j++) {
					//if(i % 2 == 1) { 가 밑에 있을때 문제가 생길 수 있음.
					//i가 짝수일때도 계속 실행함. 위에 있을땐 짝수를 걸러냄.
						System.out.print(i + "x" + j + "=" + i*j);
						System.out.print("\t");
				}
				System.out.println();*/
		
				
				for(int i = 2; i<=9; i++){
					System.out.println("===== "+ i +"단"+ "=====");

					for (int j = 1; j <= 9; j++) {
						
						System.out.println(i + "x" + j + "=" + i * j);
//						System.out.print("\t");
					}
					System.out.println();
				
	}
}
	}
