package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClass {
	
		Connection conn;
		public Statement stmt = null;
		public DBClass() {
			// TODO Auto-generated constructor stub
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				String db_url = "jdbc:oracle:thin:@localhost:1521:db";
				String db_id = "SYSTEM";
				String db_pw = "test1234";
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
				System.out.println("DB 연결 완료");
				stmt = conn.createStatement();
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC 드라이버 로드 오류");
			} catch (SQLException e) {
				System.out.println("DB 연결 오류");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
