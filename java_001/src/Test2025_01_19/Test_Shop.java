package Test2025_01_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test_Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		
		System.out.println("=== 학생 관리 시스템 입니다! ===");
		
		while(true) {
			System.out.print("[ (1)학생추가 (2)성적입력 (3)조회 (4)성적수정 (5)초기화면 (6)종료]  :  ");
			String input = scan.next();
			if(!input.matches("\\d+")) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
				if(input.equals("5")) {
					System.out.println("초기화면으로 되돌아갑니다.");
					continue;
				}
				
				int menu = Integer.parseInt(input);
				
				HashMap<String, Object> map = new HashMap<>();
				
				boolean flg = false; // 초기값을 거짓으로 만듬. 그래야 true일때만 걸러냄
				
					if(menu == 1) { // 학생추가
						System.out.print("이름 입력: ");
						String name = scan.next();
						if(name.matches("\\d+")){
							System.out.println("숫자는 입력할 수 없습니다.");
							continue;
						}
						if(name.equals("5")) {
							System.out.print("초기화면으로 되돌아갑니다.");
							System.out.print("[ (1)학생추가 (2)성적입력 (3)조회 (4)성적수정 (5)초기화면 (6)종료]  :  ");
							continue;
						}
						map.put("이름", name);
						
						for(HashMap<String, Object> stu : list) {
							if(stu.get("이름").equals(name)) {
								System.out.println("이미 존재하는 학생입니다. 처음으로 이동합니다.");
								flg = true;
								break;
							}
						}
						if(!flg) {
							System.out.println("학생이 추가되었습니다.");
							list.add(map);
						}
					}
					if(menu == 2) {//성적입력
						System.out.print("학생의 이름을 입력해주세요: ");
						String name = scan.next();
						
						if(name.matches("\\d+")){
							System.out.println("숫자는 입력할 수 없습니다.");
							continue;
						}
						boolean modifyFlag = false; //성적 수정여부 확인 변수
						
						for(HashMap<String, Object> stu : list) {
							if(stu.get("이름").equals(name)) {
								flg = true;
								
								while(true) {
										
									System.out.print("java: ");
									int java = scan.nextInt();									
									if(java < 0 || java > 100) {
										System.out.println("점수는 0~100 값을 입력해주세요.");
										continue;
									}
									if( stu.get("java") != null) {
										System.out.println("이미 입력된 점수입니다.");
										System.out.print("성적 수정을 원하시면 4번을 입력해주세요");
										int choice =scan.nextInt();
										
										if(choice == 4) {
											menu = 4;
											modifyFlag = true;
											break;
										}
										break;
									}
									stu.put("java", java);
									System.out.println("java 점수: " + stu.get("java"));
									break;
								}
								if(modifyFlag) break; //성적수정이 선택되면 oracle 입력 전에 종료.
								
								while(true) {
									System.out.print("oracle: ");
									int oracle = scan.nextInt();
									
									if(oracle < 0 || oracle > 100) {
										System.out.println("점수는 0~100 값을 입력해주세요.");
										continue;
									}
									if(stu.get("oracle") != null) {
										System.out.println("이미 입력된 점수입니다.");
										break;
									}
									stu.put("oracle", oracle);
									System.out.println("oracle 점수: " + stu.get("oracle"));
									break;
								}
							}
							if(!flg) {
								System.out.println("존재하지 않는 학생입니다. 다시 입력해주세요.");
								continue;
							}
							if(modifyFlag) {
								System.out.println("성적 수정 메뉴로 이동합니다...");
								menu = 4;
							}
							
						}
					}		
					if(menu == 3) {//조회
						System.out.println("조회합니다.");
						System.out.println(list);
					}
					if(menu == 4) {//수정
						System.out.println("성적을 수정합니다.");
						System.err.print("조회하려는 이름을 입력해주세요 : ");
						String name = scan.next();
						
						if(name.matches("\\d+")){
							System.out.println("숫자는 입력할 수 없습니다.");
							continue;
						}
						
						
						for(HashMap<String, Object> stu : list) {
							if(stu.get("이름").equals(name)) {
								
								flg = true;
								
								if(!stu.containsKey("java") || !stu.containsKey("oracle")) {
									System.out.println("해당 학생의 성적이 입력되지 않았습니다.");
									System.out.println("성적 입력메뉴로 이동합니다.");
									input = "2";
									continue;
								}
								while(true) {							
									System.out.print("java: ");
									int java = scan.nextInt();							
									
									if(java < 0 || java > 100) {
										System.out.println("점수는 0~100 값을 입력해주세요.");
										continue;
									}
									stu.put("java", java);
									break;
									}
								
								
								while(true) {
									System.out.print("oracle: ");
									int oracle = scan.nextInt();
									
									if(oracle < 0 || oracle > 100) {
										System.out.println("점수는 0~100 값을 입력해주세요.");
										continue;
									}
									stu.put("oracle", oracle);
									System.out.println("성적이 입력되었습니다.");
									break;
								}
							}
							if(!flg) {
								System.out.println("해당 학생이 존재하지 않습니다.");
								continue;
							}
						}
					}
					if(menu == 5) { //초기화면
						System.out.println("초기화면으로 되돌아갑니다.");
						int num = scan.nextInt();
						continue;
					}
					if(menu == 6) { //종료
						System.out.println("종료합니다.");
						break;
					}
			
		}

	}

}
