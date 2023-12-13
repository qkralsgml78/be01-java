package day17_jdbc_jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException { //예외발생
		
		
		//1. Driver load ...execption
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success");
		
		//2. Connection load
		//				Driver:IP:portNumber/DBName(db)
		String url = "jdbc:mariadb://localhost:3306/db";
		String uid = "root";
		String pwd = "maria";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!");
		
		//3. 사용 (DML 명령어 사용)
		
		
		//4. 닫기(자원 반환)
		
	}

}
