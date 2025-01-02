package day5;

import java.util.Arrays;

public class SelectionSort003 {

	public static void main(String[] args) {
		
//		4번을 이렇게 쓸 순 없으니, 반복문 안에 너허야함.
//		4번 반복하기
		for(int i=0; i<arr.length; i++) {
			
		}
		
		
		int arr [] = {3,5,2,1,4};
		// 배열에서 가장 작은 수를 찾아서 인덱스 0번째거랑 자리 변경
		// 비교 전에 작은 값을 저장해야한다
		// 작은 값을 넣은 상자랑 다음 i+1과 비교해야함
		int minIndex = 0;
		int temp = 0; //빈 상자-가장 작은 값의 위치
		for(int i=1; i<arr.length; i++) { // 반복돌리기 첫번째 0이면 0과 굳이 비교할 필요 없으니 1부터 i=1;
			if(arr[i] < arr[temp]) {
				temp = i; //인덱스 위치 최종 3(0123)
				
//			if(arr[minIndex] > arr[i]){//2. 작은 인덱스를 어떻게 찾을 것? **돌아가는 i와 0의 min을 비교
//				minIndex = i; 		   //3. minIndex에 작은 i값을 넣을 것. ---temp라는 상자에 가장 작은 i값이 들어가이씀

//				for(int j=0) {
				minIndex = arr[0];// 빈 상자에 옮길 값 넣기 //temp상자에 min(3번인덱스 1)넣었음---새 상자 minIndex
				arr[0] = arr[temp];//빈 인덱스에 0번쨰인덱스 넣기 //  ---가장작은 i값 temp
				arr[temp] = minIndex; //temp에 새 상자 덮기
//				}//for2(안쪽)
			
			}//if
			System.out.println(Arrays.toString(arr));
		}//for
		
		//{1,5,2,3,4}
		int minindex = 1; // index와 arr[1]의 값은 같아야 함.
		for(int i=2; i<arr.length; i++) {
			if( arr[i] < arr[minindex] ) {
				minindex = i;
				
				minindex = arr[1];
				arr[1] = temp;
				temp = minindex;
				}
		}
		
	}//2
}//1
