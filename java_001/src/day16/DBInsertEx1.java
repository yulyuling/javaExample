package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsertEx1 {
	public static void printData(ResultSet rs) throws SQLException {
		while(rs.next()) {
			String name = rs.getString("STU_NAME");
			int height = rs.getInt("STU_HEIGHT");
			System.out.print(name + "\t");
			System.out.println(height);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;
		//Statement 초기값이 null인 이유
		//Steatement는 SQL문을 실행하기 위해 사용됨.
		//db연결이 생성된 이후에만 초기화 할 수 있음. 그래서 db연결 전 선언만 하고 null로 설정
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "TEST1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement(); //실제 Statement 생성
			// 학번(String - 8글자), 이름, 학과를 입력받아서
			// STUDENT 테이블에 저장
			System.out.print("학번 : ");
			String stuNo = scan.next();
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("학과 : ");
			String dept = scan.next();
			
			String sql // INSERT, UPDATE, DELETE를 작성하기 위해 사용.
				= "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) "
				+ "VALUES('" + stuNo + "', '" + name + "', '" + dept + "')";
			int num = stmt.executeUpdate(sql);
			//SQL은 실행결과로 변경된 행(ROW)의 개수가 계산됨. ROW의 개수를 반환
			if(num > 0) {
				System.out.println("추가되었음!");
			} else {
				System.out.println("오류발생!");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}