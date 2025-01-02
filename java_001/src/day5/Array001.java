package day5;

import java.util.Arrays;
import java.util.Random;

public class Array001 {

	public static void main(String[] args) {
		
		
		//랜덤한 숫자 6개를 배열에 넣기
		//범위 1~45 6개(로또번호)
		//숙제 : 중복번호 제외
		/*
		 * Random ran = new Random(); System.out.print("로또번호를 추첨합니다 :");
		 * 
		 * int arr[] = new int[6]; // int x = ran.nextInt(45)+1; // 2~9 int input = 0;
		 * int num = 0; for(int i=0; i<arr.length; i++) { arr[i] = ran.nextInt(45)+1;
		 * if(i == ran.nextInt() ); num = i;
		 * 
		 * if (num == ran.nextInt()) { i--; } }
		 * System.out.println(Arrays.toString(arr));
		 */
		
		Random ran = new Random();
		int arr[] = new int[6];
		for (int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(45)+1; //0~44==>1~45
			for(int j=0; j<=i; j++) {
					  // j<arr.length 대신 j<i로 바꾸면 i의 갯수만큼 비교하게 됨.
			if(ranNum == arr[j]) {
				System.out.println("중복된 숫자 있음");
				i--;
// 중복된 숫자를 발견했을때 다시 재추첨 하는 방법에 대해서.
// 중복된 결과를 체크해둔 뒤 중복된 결과를 실행하지말고, 없다면 실행해라.(힌트)
				
			}//if
		}
			arr[i] = ranNum;
			
		} //for1
		System.out.println(Arrays.toString(arr));
		
		
		
	} //close 2

}//close 1
