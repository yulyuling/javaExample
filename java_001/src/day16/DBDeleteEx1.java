package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBDeleteEx1 {
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
			
			System.out.print("삭제할 학생의 이름 입력 : ");
			String name = scan.next();
			int num = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NAME = '" + name + "'");
			if(num == 0) {
				System.out.println("삭제할 대상이 존재 하지 않습니다.");
			} else {
				System.out.println("삭제되었습니다.");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}