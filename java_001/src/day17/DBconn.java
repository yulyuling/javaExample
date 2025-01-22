package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconn {
    private Connection conn;
    private Statement stmt;

    public DBconn() {
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // DB 연결
            String db_url = "jdbc:oracle:thin:@localhost:1521:db";
            String db_id = "SYSTEM";
            String db_pw = "test1234";
            conn = DriverManager.getConnection(db_url, db_id, db_pw);

   
            System.out.println("DB 연결 완료");

            // Statement 생성
            stmt = conn.createStatement();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("DB 연결 오류: " + e.getMessage());
        }
    }

    // DB 연결 종료 메서드
    public void close() {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("DB 연결 종료");
        } catch (SQLException e) {
            System.out.println("DB 종료 오류: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        DBConn dbConn = new DBConn();
        dbConn.close();
    }
}