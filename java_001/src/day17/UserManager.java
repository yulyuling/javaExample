package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserManager {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			String colKor[] = {"아이디", "비밀번호", "이름"};
			String colEng[] = {"USER_ID", "USER_PASSWORD", "USER_NAME"};
			//아이디, 비밀번호, 이름을 입력받아서 db의 tbl_user에 
			
//			boolean idFlg = true;
			String id = "";
//			while(idFlg) { // while문도 불값인데, idFlg가 트루일때만 반복한다.
			while(true) {
				System.out.print("아이디: ");
				id = scan.next();
				String idCheck = "SELECT * FROM TBL_USER " + "WHERE USERID = '" + id + "'";
				ResultSet rs = stmt.executeQuery(idCheck);
//				idFlg = rs.next();
				if(rs.next()) { //rs.next눈 bool값임
					System.out.println("이미 사용중인 아이디입니다.");
				} else {
					break;
				}
			}
				
			System.out.print("비밀번호: ");
			String pwd = scan.next();
			System.out.print("이름: ");
			String name = scan.next();
			//나이가 없으니까 빈값을 넣거나 컬럼명을 명시해야함
			String sql = "INSERT INTO TBL_USER" +"(USERID, PASSWORD, USERNAME)" + " VALUES(" + "'" + id + "',"
																							+ "'" + pwd + "',"
																							+ "'" + name + "')";
//			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("가입되었습니다.");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
