package day4;

public class Array008 {

	public static void main(String[] args) {
		
/*		int arr[] = {3, 5, 2, 4, 1};
		int num = 0;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			num = i;
		if (i == 1 );
			max = num;
			if ( num < max );
			arr[i] = max;
					
			if(arr[i] == max);
			System.out.println(arr[i]);
		*/

		//가장 큰 숫자를 가진 인덱스 위치 찾기
		
		int arr[] = {3, 5, 2, 4, 1};
		int maxIndex = 0;
		for(int i=1; i<arr.length; i++) { //1부터 시작한 이유
											//maxindex=0이 1번인덱스
			if(arr[i] > arr[maxIndex]) {	//인덱스끼리 비교 arr[i] > arr[0]
				maxIndex = i;				//
			}
		}
		System.out.println((maxIndex+1) + "번째 숫자가 가장 크다.");
		
		
		}
			}
		


