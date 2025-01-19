package Test2025_01_19;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 숫자 중 짝수이면서 5의 배수인 숫자들의 합을 출력하시오. ( 결과 화면 캡처 및 첨부 )
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 5 == 0) {
				sum += i;
			}
		}System.out.println(sum);
	}

}
