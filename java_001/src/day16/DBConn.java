package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConn {
	Scanner scan = new Scanner(System.in);
	Connection conn;
	Statement stmt = null;

	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "SYSTEM";
		String db_pw = "test1234";
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
		System.out.println("DB 연결 완료");
		System.out.println("DELETE FROM STUDENT WHERE STU_NAME -");

		System.out.println("삭제할 학생의 이름 입력 :");
		String name = scan.next();
		int num = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NAME -" + "'" + name + "'");
		// int 형임 몇개 리턴하냐?
		if(num == 0) {
			System.out.println("삭제할 대상이 존재하지 않습니다.");
		}else {
			System.out.println("삭제되었습니다.");
		}

	}catch(
	ClassNotFoundException e)
	{
		System.out.println("JDBC 드라이버 로드 오류");
	}catch(
	SQLException e)
	{
		System.out.println("DB 연결 오류");
	}

}

}
