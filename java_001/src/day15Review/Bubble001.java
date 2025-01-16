package day15Review;

import java.util.ArrayList;

public class Bubble001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		//버블 정렬
//		//뒤에서부터 큰 숫자로 정리한다.
//		// i < j , j == maxIndex;
//		// j를 맨 뒤로 보낼거야.
//		int arr[] = {3, 5, 2, 4, 1};
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=0; j<arr.length - i - 1; j++) {
//				if(arr[j] > arr[j + 1]) {
//					
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	
//	
//	
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		
		int sum = 0;
		
		for(Integer number : list) {
			if(number % 2 == 0) {
				sum += number;
				System.out.println(sum);
			}
		}
		
		
	}
}