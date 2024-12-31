package day4;

import java.util.Arrays;

public class Array001 {

	public static void main(String[] args) {
		
		
		//int[] arr = new int[5]; --같이 써도 됨> <
		//5개의 공간을 가지는 arr 배열 선언
		
//		int arr [] = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		//arr[] = {10,20,30,40,50}
		//arr[10][20][30][40][50]
			
			int arr[] = {10,20,30,40,50,5};
			//위와 동일한 코드
//			System.out.println(arr[3]);
			for(int i=0; i<arr.length; i++) { //arr.length :배열의 길이___=붙이면 오류뜸;ㅅ;
//				System.out.println(arr[i]);
				System.out.println(arr.length); // 이렇게 출력해도 배열의 길이가 나옴.????????
			}
			
//		System.out.println(arr[1]); // 값을 넣지 않으면 0 (int니까?)
		//index 0 1 2 3 4 (전체 크기의 -1)
		//*System.out.println(Arrays.toString(arr));
		//* arr의 전체 값 출력하는 법_arr은 객체라서 한 번에 출력이 안 됨
		//*(Arrays.toString(arr)로 어떤 값이 있는지 확인 할 수 있음.
		
		
							 
		
		
		
		
	}

}
