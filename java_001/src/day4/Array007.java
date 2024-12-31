package day4;

import java.util.Arrays;
import java.util.Random;

public class Array007 {

	public static void main(String[] args) {
		
		//랜덤한 숫자 6개를 배열에 넣기
		//범위 1~45 6개(로또번호)
		//숙제 : 중복번호 제외
		
		Random ran = new Random();
		System.out.print("로또번호를 추첨합니다 :");
		
		int arr[] = new int[6];
//		int x = ran.nextInt(45)+1; // 2~9
		int input = 0;
		int num = 0;
		for(int i=0; i<arr.length; i++) {
				arr[i] = ran.nextInt(45)+1;
				if(i == ran.nextInt() ); 
					num = i;
					
		 if (num == ran.nextInt()) { 
			 i--;
		}
		}
		System.out.println(Arrays.toString(arr));
	}
}
					
					
					
				
		

	

			
					
			
			

