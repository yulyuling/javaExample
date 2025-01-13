package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		//-1이 입력되기 전까지 문자열을 받아서
		//list에 저장
		//저장 이후 글자수가 5글자 이상인 문자열을 화면에 출력
		
		while(true) {
		
		System.out.print("문자 입력 : ");
		String strBox= scan.next();
		if(!strBox.equals("-1")) {
			list.add(strBox);
		} else {
			break;		
		}
		} for(int i = 0; i<list.size(); i++) {
				if(list.get(i).length() >= 5) {
					System.out.println(list.get(i) + " ");
					
				}
			}	
			
//		System.out.println(list);
	}//2

}
