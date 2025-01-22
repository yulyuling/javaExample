package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserUpdate {

	public static void main(String[] args) {
				//id를 입력받아서 없는 아이디면 '없는 아이디 입니다'='다시 입력
				//있는 아이디일 경우 나이 값을 입력받아서 업데이트
		
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;  
			
				String id = "";
				while(true) {
					System.out.println("이름 : ");
					id = scan.next();
					
					String sql = "SELECT * FROM TBL_USER" + id + "WHERE USERID = '" + "'";
					ResultSet rs = stmt.executeQuery(sql);
					if(!rs.next()) {
						System.out.println("없는 아이디 입니다.");
						break;
				} else {
					System.out.println("나이 : ");
					String age = scan.next();
					
					String sql1 = "UPDATE TBL_USER SET AGE = '" + age + "'" + "WHERE USERID = '" +id+ "'";
					int result = stmt.executeUpdate(sql1);//update
					//SQL은 실행결과로 변경된 행(ROW)의 개수가 계산됨. ROW의 개수를 반환
					if(result > 0) {
						System.out.println("수정되었습니다.");
					} else {
						System.err.println("수정에 실패했습니다.");
					}
			}

			
			}
		} catch (SQLException e) {
			// TODO: handle exception
						System.out.println(e.getMessage());
		}
	}

}

//String id = "";
//while(true) {
//	System.out.println("아이디 : ");
//	id = scan.next();
//	String sql = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "' ";
//	ResultSet rs = stmt.executeQuery(sql);//값불러오기
//	if(!rs.next()) {
//		System.out.println("없는 아이디 입니다.");
//		 break;
				
