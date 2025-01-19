package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//sql은 SELECT SQL문자열임.
			//ResultSet (rs) = 저장. SELECT 결과를 테이블 형태로 저장.
			//rs.next():사용으로 행row를 이동.
			//각 열(column)의 데이터를 rs.getString, rs.getInt 등으로 읽음(ㄱㅏ져옴)
			//PrintData = SELECT결과를 출력
			//(\t)탭. 홍길동170 ==> 홍길동  170
			
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt; 
			//Statement는 SQL문을 실행하기위해 사용됨
			//DB연결이 생성된 이후에만 초기화 할 수 있따.
			String colKor[] = {"이름", "학과", "키"};
			//사용자에게 보여줄 한글이름.
			String colEng[] = {"STU_NAME", "STU_DEPT", "STU_HEIGHT"};
			//DB에서 사용 할 실제 컬럼이름.
			while(true) {
				System.out.print("[(1) 학생추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료] : ");
				int menu = scan.nextInt();
				if(menu == 1) {
					String stuNo = "";
					while(true) {
						System.out.print("학번 : ");
						stuNo = scan.next();
						if(stuNo.length() == 8) {
							break;
						} else {
							System.out.println("학번은 8글자 입니다.");
						}
					}
					System.out.print("이름 : ");
					String name = scan.next();
					System.out.print("학과 : ");
					String dept = scan.next();
					String sql 
						= "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) "
						+ "VALUES('" + stuNo + "', '" + name + "', '" + dept + "')";
					int num = stmt.executeUpdate(sql);
					//executeUpdate = 반환값 정수형 int
					//JDBC에서 DB의 데이터 변경작업 (INSERT, UPDATE, DELETE)를 수행하는 메소드
					//행을 추출.
					if(num > 0) {
						System.out.println("추가되었음!");
					} else {
						System.out.println("오류발생!");
					}
				} else if(menu == 2) {
					System.out.print("학번 : ");
					String stuNo = scan.next();
					ResultSet rs =  stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO = '" + stuNo + "'");
					//executeQuery = DB에 저장된 값을 가져옴.
					//JDBC에서 SELECT문을 실행하기 위한 메소드.
					//SQL SELECT를 실행하고, 결과를 RESELTSET 객체에 담아 반환한다.
					//DB조회작업에 사용. **DB의 저장값을 가져옴**
					if(rs.next()) {
						//rs = SQL SELECT 결과를 담은 객체
						//주로 stastment or preparedStatement를 통해 생성
						//rs.next는 ResultSet의 다음행으로 이동. **데이터를 읽으려면**
						System.out.println("수정할 데이터 선택 ");
						System.out.print("(1) 이름 (2) 학과 (3) 키 => " );
						int column = scan.nextInt();
						if(column > 3 || column < 1) {
							//컬럼이 1~3까지 존재하므로, 1~3이 아닌 값을 입력하면 없는정보 반환.
							System.out.println("없는 정보입니다.");
							continue;
						}
						System.out.print(colKor[column-1] + " 입력 : ");
						//자바에서 배열은 0부터 시작하기때문에 -1을 해줌.
						String value = scan.next();
						stmt.executeUpdate("UPDATE STUDENT SET " + colEng[column-1] + " = '" + value + "' " + "WHERE STU_NO = '" + stuNo + "'");
						System.out.println("수정되었습니다.");
					} else {
						System.out.println("해당 학번을 가진 학생 없음");
					}
					
				} else if(menu == 3) {
					
				} else if(menu == 4) {
					
				} else if(menu == 5) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("없는 메뉴 입니다.");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}