package day11Review002;

public class BubbleSort001 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,2,4,5,1};
		
		int maxIndex = 0;						//외부루프는 순회==정렬할 범위를 앞으로 줄이는 거임!!!
		for(int i = arr.length-1; i > 0; i--) { //배열의 마지막위치 i가 줄어들수록 비교할범위가 줄어듬. 배열의 뒤에서부터.
			for(int j = 0; j < i; j++) {        //배열의 처음부터 인접한 비교함.
												//내부는 비교하는 역할.
			if( arr[j] < arr[j+1] ) {
				maxIndex = arr[j];
			}
			System.out.println();	
			}
			}
		
	}

}
