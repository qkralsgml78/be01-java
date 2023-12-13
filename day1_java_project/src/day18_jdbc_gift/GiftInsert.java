package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws Exception {
		//1. Driver load ...execption
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success");
		
		//2. Connection load
		//				Driver://IP:portNumber/DBName(db)
		
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", "root", "maria");
		
		
		//3. 사용 (insert) - Statement / preparedStatement
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		
		
		//INSERT INTO gift VALUES(1, '스팸', 800, 1200);
//		String sql = "INSERT INTO gift VALUES(12, '스팸', 800, 1200)";// 1. 데이터 값을 직접 집어넣는 방법
		String sql = "INSERT INTO gift VALUES("+args[0]+", '"+args[1]+"', "+args[2]+", "+args[3]+")";
		System.out.println(sql);
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개 데이터 추가 성공함.");
		
		conn.commit(); //자바는 원래 자동 commit이 되는데 안되면 commit코드를 넣어줘야 함
		//4. 닫기(자원 반환)
		stmt.close();  //conn.close();  rs.close();
		
		}
		
		
		

}
