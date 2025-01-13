package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		//-1이 입력되기 전까지 문자열을 받아서
		//list에 저장
		//글자수가 3글자 이상이면
		//문자열을 두글자 + * // *(글자개수 (te**)화면에 출력
		//2글자 이하는 출력 x
		
		while(true) {
		System.out.print("문자열을 입력하세요: ");
		String input = scan.next();
		
		if(!input.equals("-1")){
		list.add(input);
		
		} else {
			break;
		}
		}
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).length() >=3) {
			System.out.print(list.get(i).substring(0, 2)+" ");
			for(int j=0; j<list.get(i).length()-2; j++) {
				System.out.print("*");
				
			}
			} System.out.print(" ");
		}
//	System.out.print(list);
	
		
		
		
		
	}
}