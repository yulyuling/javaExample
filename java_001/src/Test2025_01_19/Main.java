package Test2025_01_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Human hong = new Human("홍길동", 30); // name, age
		System.out.println(hong);
		boolean flg = true;
		while(flg) {
			System.out.print("핸드폰 번호 입력 : ");
			String phone = scan.next();
				flg = hong.setPhone(phone);
		};
		System.out.println("번호 등록 완료");
		System.out.println("--------------------------------");
		
		Student kim = new Student("김철수", 20, "20201234");
		System.out.println(kim);
		System.out.println("--------- 수강해야할 과목 ---------");
		ArrayList<String> subjectList = kim.subjectList();
		for(int i=0; i<subjectList.size(); i++) {
			System.out.println(subjectList.get(i));
		}
	}
}