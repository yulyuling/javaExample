package day6Review001;

import java.util.Arrays;
import java.util.Random;

public class Sort001 {

	public static void main(String[] args) {
		
		
		//arr의 모든 요소에 값을 1~20사이의 랜덤한 값으로
		//넣기
		//그 다음에 모든 수의 평균 구하기
		
		
		Random ran = new Random();
		int arr[][] = new int [3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int ranNum = ran.nextInt(20)+1;
				
				arr[i][j] = ranNum;
				
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
			sum += arr[i][j];
			}
		}
			System.out.println("평균은 " + sum / (arr.length * arr[0].length));
		}

}
