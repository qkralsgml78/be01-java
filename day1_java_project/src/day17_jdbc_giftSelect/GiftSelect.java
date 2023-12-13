package day17_jdbc_giftSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
public static void main(String[] args) throws ClassNotFoundException, SQLException { //예외발생
		
		
		//1. Driver load ...execption
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success");
		
		//2. Connection load
		//				Driver:IP:portNumber/DBName(db)
		
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", "root", "maria");
		
		//3. 사용 (DML 명령어 사용) -
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		
		System.out.println("상품번호\t상품명\t최저가\t최고가\t");
		while(rs.next()) {//rs의 커서가 필드 제목에 있고 그 커서를 다음 칸으로 내려야 하기에 rs.next()를 하는 것
			int gno = rs.getInt(1); //인덱스, int gno = rs.getInt("필드명"); /getXXX ->XXX 자료형타입이 들어가 그 타입에 맞게 처리가 됌
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
			
		}
		
		//4. 닫기(자원 반환)
		rs.close();
		stmt.close();
		conn.close();
	}
}

//Sql Qurey구문, HTML Tag는 자바에서 문자열 취급함.