package day18_jdbc_mvc.connUtill;

import java.sql.Connection;
import java.sql.DriverManager;

/*
Connection 클래스의 문제
매번 드라이버 로드를 해야함
connection 생성

어차피 하나의 프로세스에서 하나만 만들어서 재사용하면 될텐데
해결방법 >> 공유자원 (싱글톤)
 
 */

public class ConnectionSingletonHelper2 {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원(static)
	private static Connection conn;

	private void ConnectionSingletonHelper() {
	}

	public static Connection getConnection(String dsn) {
		if(conn != null) { //이미 conn 있냐고 물어보는 것
			return conn;
	}
		try {
			if(dsn.equalsIgnoreCase("mysql")) {
				Class.forName("org.gjt.mm.mysql.Driver"); // exception
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "maira"); 
				
			}else if(dsn.equalsIgnoreCase("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver"); // exception
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mini", "oracle"); //루트계정과 
				
			}else if(dsn.equalsIgnoreCase("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver"); // exception
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", "root", "maria");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return conn;
		}
		
		/*
		 * public static void close() throws SQLException{ if(conn != null) {
		 * if(!conn.isClosed()) { conn.close(); } } }
		 */
	
		
	}

}
