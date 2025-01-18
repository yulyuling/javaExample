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
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "TEST1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			// 학번(String - 8글자), 이름, 학과를 입력받아서
			// STUDENT 테이블에 저장
			System.out.print("학번 : ");
			String stuNo = scan.next();
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("학과 : ");
			String dept = scan.next();
			
			String sql 
				= "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) "
				+ "VALUES('" + stuNo + "', '" + name + "', '" + dept + "')";
			int num = stmt.executeUpdate(sql);
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