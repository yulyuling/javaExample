package day3;

public class Loop002_While {

	public static void main(String[] args) {
		
		/*
		 * int i=1;
		 * 
		 * while(i<=10) { //true 면 무한반복 실행
		 * __i++가 이 위치에 잇으면 2부터 시작. 마지막은 11
		 * System.out.println(i); i++; 
		 * __i++의 위치에 따라 결과가 다르다. }
		 * 보통 for문을 많이 사용한다.
		 * for(int j=1; j<=10; j++) {
		 * 
		 * }
		 */
		
		//while문으로 구구단 출력
		
		int o=1; //현재 단을 나타내는 변수, 초기값 1
		while(o < 9) { //o가 9보다 작을 때까지 반복(2단부터 시작하려고 1에서 시작)
			o++; //o를 1씩 증가시켜 2단부터 시작하게 설정
			System.out.print("\t");
			System.out.println();
			int k=0; //초기값 0 
			//초기값을 0으로 설정하여 내부 루프에서 k++로 1부터 시작하도록 설정
			while(k < 9) { //k가 9보다 작을때까지 반복 (1~9까지 곱셈)
				k++; //k를 1씩 증가
				//현재 단과 곱해지는 숫자 o,k_그리고 결과o*k를 출력
				
				System.out.print(o + "x" + k + "=" + o*k);
				System.out.print("\t");
			}	
		}
			System.out.println(); 
			
/*		} //첫번째 방법
			int i=2;
			int j=1;
			while(i<=9) {
				while(j<=9) {
					System.out.println(i+"x"+j+"="+(i*j));
					j++;
				}
			}
			j=1;
			i++;*/
			
			
			
//			 //두번째 방법
//			int i=2; // 단 초기화
//			while(i<=9) { //2단부터 9단까지 반복
//				int j=1; //곱하는 수 초기화
//				while(j<=9) { //1부터 9까지 반복
//					System.out.println(i+"x"+j+"="+(i*j));
//					j++; //곱하는 수 증가
//					System.out.print("\t");
//				}
//			i++; //다음 단으로 이동
//			}System.out.println();
			
			
			/*i는 "현재 단"을 나타내는 변수
			 * 바깥쪽 while 루프는 2단부터 9단까지의 각 단을 반복해야한다.
			 * 따라서 하나의 단을 모두 출력후에 i++로 다음 단으로 넘어감
			 * 만약 i++이 블록 안쪽으로 들어가면 현재 단이 완료되기 전에 i가 증가하여 구구단 출력이 안 됨
			 * 
			 * i++이 루프 안에 들어가면 곱셈이 끝나기 전에 i가 증가함.
			 * 한 단의 모든 곱셈을 출력하기도 전에 다음 단으로 넘어가버리는 문제가 생김.
			 * 
			 * j루프를 모두 출력->j루프 종료 후-> i++실행-> 다음 단으로 넘어감
			 * i=2:2단 출력 => j=1~9 반복(2단 출력완료) => i++실행 => i=3
			 * 
			 *  i++은 바깥쪽 while 루프의 제어 변수/ 한 단이 모두 끝난 후 증가해야 함.
			 *  
			 *  
			 *  
			 *  while 문에서는 증감식을 개발자가 명시적으로 작성해야함.
			 *  그래서 위치에 따라서 동작이 달라질 수 있음.
			 *  for문은 증감식이 항상 루프 반복의 끝에서 실행되도록 보장됨.
			 *  while 문은 개발자가 따로 명시적으로 작성해야 함.
			 *  
			 * */
}
}