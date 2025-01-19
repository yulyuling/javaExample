package Test2025_01_19;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub. 이미지 참고
		/*
		 * -- 메뉴 1 : 중복 이름 저장 금지 --
		 * 메뉴 2 : java, oracle 점수 추가(0~100 사이 값), 없는 사용자 입력 시 메뉴로 이동 -- 
		 * 메뉴 3 : ArrayList 객체 그대로 출력, ex) System.out.println(list); -- 
		 * 메뉴 4 : * java, oracle 중 1가지 선택해서 점수 변경. 
		 * 없는 사용자 입력 및 없는 과목 입력 시 메뉴로 이동 -- 메뉴 5 : 종료
		 */
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.println("1.학생추가 2.성적입력 3.조회 4.성적수정 5.종료");
			HashMap<String, Object> map = new HashMap<>();
			String input = scan.next();
			
			if(!input.matches("\\d+")) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			
				int menu = Integer.parseInt(input);
					
				if(menu == 1) {
				System.out.println("학생 정보를 추가합니다.");
				
				System.out.print("이름: ");
				String name = scan.next();
				map.put("이름", name);

				boolean flg = false;				
				
				for(HashMap<String, Object> student : list) {
					if(student.get("name").equals(name)){
						System.out.println("중복된 이름 입니다.");
						
						flg = true;
						break;
					}
				}				
				if(!flg) {
					System.out.println("추가되었습니다.");
					list.add(map);
				}
			} else if(menu == 2) { //성적입력
				System.out.println("성적을 입력해주세요");
				
				System.out.print("java 성적: ");
				int java = scan.nextInt();
				map.put("java", java);
				System.out.print("oracle 성적: ");
				int oracle = scan.nextInt();
				map.put("oracle", oracle);
				
				list.add(map);
				System.out.println(list);
				
			} else if(menu == 3) { //조회
				System.out.println("ArrayList 객체를 그대로 출력합니다.");
				System.out.println(list);
				
			} else if(menu == 4) { //성적 수정
				
			} else if(menu == 5) { //종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			
		}
		

	}

}
