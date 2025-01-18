package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
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
		DBClass db = new DBClass();
		ResultSet rs;
		try {
			rs = db.stmt.executeQuery("SELECT * FROM STUDENT");
			printData(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}