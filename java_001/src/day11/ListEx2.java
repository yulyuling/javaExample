package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Human> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		int age = 0;
		String addr = "";
		
		Human h = new Human(name, age, addr); 
		
			
			
			for(int i=0; i<2; i++) {
			System.out.print("(1)추가 (2)확인 (3)종료 ");
			
			int choice = scan.nextInt();
			
			
			System.out.print("이름 : ");
			name = scan.next();
			
			System.out.print("나이 : ");
			age = scan.nextInt();
			
			System.out.print("주소 : ");
			addr = scan.next();
			list.add(h);
			
			
			if(choice == 1) {
				
		}else if(choice == 2) {
			System.out.println();
			
		} else if (choice == 3){
			System.out.println("종료 되었습니다.");
		}
	
		}
			System.out.print("이름 : "+ h.getName() + " 나이 : " + h.getAge() + " 주소 : " + h.getAddr());
			System.out.println();
	}	
}


