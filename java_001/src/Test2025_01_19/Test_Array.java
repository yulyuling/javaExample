package Test2025_01_19;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int arr[] = new int [6];
		for(int i = 0; i<arr.length; i++) {
			while(true) {
				System.out.println("숫자를 입력해: ");
				int num = scan.nextInt();
				if(num < 1 &&  num > 100) {
					System.out.println("1~100 숫자 입력해 ");
				} else {
					boolean inputFlg = false; // 중복된값이 없으면
					for(int j=0; j<i; j++) {
						if(num == arr[j]) {
							System.out.println("중복된 값 입력함");
							inputFlg = true;
						}
					}
					if(!inputFlg) {
						arr[i] = num;	
						break;	
						}
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
