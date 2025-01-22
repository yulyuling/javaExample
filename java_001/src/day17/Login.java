package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scan = new Scanner(System.in);
		DBClass db = new DBClass();
		Statement stmt = db.stmt;  
		
		//아이디랑 비밀번호를 받아서
		//아이디/패스워드 둘다 만족하는 데이터가 있으면
		//로그인 성공, 아닐 경우 로그인 실패
		
		String id = "";
		String password = "";
		while(true) {
			System.out.print("아이디: ");
			id = scan.next();
			System.out.println("비밀번호: ");
			password = scan.next();
			String sql = "SELECT * FROM TBL_USER" + "WHERE USERID = '" + id + "'"
					+ "AND PASSWORD = '" + password +"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
				break;
			}
			
			System.out.println(sql);
		}
//		System.out.print("이름: ");
//		String name = scan.next();
//		String sql = "INSERT INTO TBL_USER" +"(USERID, PASSWORD, USERNAME)" + " VALUES(" + "'" + id + "',"
//				+ "'" + password + "',"
//				+ "'" + name + "')";
		
//		int result = stmt.executeUpdate(sql);
//		if(result > 0) {
//			System.out.println("가입되었습니다.");
//		}
//		

	} catch (SQLException e) {
		// TODO: handle exception
					System.out.println(e.getMessage());
	}
		
	}

}
